package com.journalApp.journallingApp.service;

import com.journalApp.journallingApp.entity.JournalEntry;
import com.journalApp.journallingApp.entity.User;
import com.journalApp.journallingApp.repository.JournalRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class JournalService {
    @Autowired
    public JournalRepo journalRepo;
    @Autowired
    public UserService userService;

    public List<JournalEntry> findAll() {
        return journalRepo.findAll();
    }
@Transactional
    public void savedata(JournalEntry journalEntry, String username) {

          JournalEntry entry = journalRepo.save(journalEntry);
          User user = userService.findByUserName(username);
//          user.setUsername(null); this is a problem bcz journal entry will save in db bt not assosicate with user as user is null so to control this trnasacction is used which protects from half work as it abort the session if error occur...
          user.getJournalEntries().add(entry);
          userService.savedata(user);

    }

    public JournalEntry search(ObjectId id) {
        return journalRepo.findById(id).orElse(null);
    }

    public void savedata(JournalEntry old) {
        journalRepo.save(old);
    }

    public boolean update(ObjectId id, JournalEntry newEntry, String username) {
        JournalEntry old = search(id);
        if (old != null) {
            if (newEntry.getTitle() != null && !newEntry.getTitle().equals("")) old.setTitle(newEntry.getTitle());
            if (newEntry.getContent() != null && !newEntry.getContent().equals(""))
                old.setContent(newEntry.getContent());
            journalRepo.save(old);
            return true;
        }
        return false;
    }

    public boolean remove(ObjectId id, String username) {
        User user = userService.findByUserName(username);
        user.getJournalEntries().removeIf(x -> x.getId().equals(id));
        userService.savedata(user);
        journalRepo.deleteById(id);
        return true;
    }
}

package com.journalApp.journallingApp.controller;

import com.journalApp.journallingApp.entity.JournalEntry;
import com.journalApp.journallingApp.entity.User;
import com.journalApp.journallingApp.service.JournalService;
import com.journalApp.journallingApp.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/api")
public class JournalController {
    @Autowired
    public JournalService journalService;
    @Autowired
    public UserService userService;

    @GetMapping("/{username}")
    public ResponseEntity<?> getAll(@PathVariable String username) {
        User user = userService.findByUserName(username);
        List<JournalEntry> all = user.getJournalEntries(); // give journal entry for particular user
        if (all != null) {
            return new ResponseEntity<>(all, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/{username}")
    public ResponseEntity<?> storeData(@RequestBody JournalEntry journalEntry, @PathVariable String username) {
        try {
//            User user=userService.findByUserName(username);
            journalEntry.setLocalDateTime(LocalDateTime.now());
            journalService.savedata(journalEntry, username);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{username}/{id}")
    public ResponseEntity<?> update(@PathVariable ObjectId id, @RequestBody JournalEntry journalEntry, @PathVariable String username) {
        JournalEntry entry = journalService.search(id);
        if (entry != null) {
            entry.setLocalDateTime(LocalDateTime.now());
            journalService.update(id, journalEntry, username);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping("/{username}/{id}")
    public ResponseEntity<?> delete(@PathVariable ObjectId id, @PathVariable String username) {

        journalService.remove(id, username);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/byid/{id}")
    public ResponseEntity<?> getById(@PathVariable ObjectId id) {
        JournalEntry entry = journalService.search(id);
        if (entry == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        } else return new ResponseEntity<>(entry, HttpStatus.OK);
    }
    // without db implementation of rest api...
//    private Map<Long, JournalEntry> db=new HashMap<>();

//    @GetMapping("/mydata")
//    public  List<JournalEntry> getAll()
//    {
//        return  new ArrayList<>(db.values());
//    }
// @PostMapping("/savedata")
//    public  void storeDB(@RequestBody JournalEntry entry)
//    {
//        db.put(entry.getId(),entry);
//    }
//    @PutMapping("/updatedata/{id}")
//    public  void update(@PathVariable Long id,@RequestBody JournalEntry entry)
//    {
//        db.put(id,entry);
//    }
//    @DeleteMapping("/deldata/{id}")
//    void delete(@PathVariable Long id)
//    {
//         db.remove(id);
//    }
//    @GetMapping("/byid/{id}")
//    public  JournalEntry getById(@PathVariable Long id)
//    {
//        return  db.getOrDefault(id,null);
//    }
}

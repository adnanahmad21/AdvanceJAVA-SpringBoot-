package com.journalApp.journallingApp.service;

import com.journalApp.journallingApp.entity.User;
import com.journalApp.journallingApp.repository.JournalRepo;
import com.journalApp.journallingApp.repository.UserRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    public UserRepo userRepo;

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public void savedata(User user) {
        userRepo.save(user);
    }

    public Optional<User> search(ObjectId id) {
        return userRepo.findById(id);
    }

    public User findByUserName(String name) {
        return userRepo.findByUsername(name);
    }

//    public  boolean update(ObjectId id,User newEntry)
//    {
//        User old= search(id);
//   if(old!=null)
//   {
//       if(newEntry.getTitle()!=null && !newEntry.getTitle().equals("")) old.setTitle(newEntry.getTitle());
//       if(newEntry.getContent()!=null && !newEntry.getContent().equals("")) old.setContent(newEntry.getContent());
//       journalRepo.save(old);
//       return  true;
//   }
//   return false;
//    }
//    public  boolean remove(ObjectId id)
//    {
//        userRepo.deleteById(id);
//        return  true;
//    }
}

package com.journalApp.journallingApp.controller;

import com.journalApp.journallingApp.entity.JournalEntry;
import com.journalApp.journallingApp.entity.User;
import com.journalApp.journallingApp.service.JournalService;
import com.journalApp.journallingApp.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/userapi")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAll();
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.savedata(user);
    }

    @PutMapping("/{name}")
    public ResponseEntity<?> update(@RequestBody User userEntry, @PathVariable String name) {
        User user = userService.findByUserName(name);
        if (user != null) {
            user.setUsername(userEntry.getUsername());
            user.setPassword(userEntry.getPassword());
            userService.savedata(user);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }

}

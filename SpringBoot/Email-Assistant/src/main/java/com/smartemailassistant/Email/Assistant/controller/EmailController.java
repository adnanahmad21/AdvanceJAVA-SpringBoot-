package com.smartemailassistant.Email.Assistant.controller;


import com.smartemailassistant.Email.Assistant.Entity.EmailRequest;
import com.smartemailassistant.Email.Assistant.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EmailController {

    @Autowired
    EmailService emailService;
    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest)
    {
        String response=emailService.generateResonse(emailRequest);
        return  ResponseEntity.ok(response);
    }

}

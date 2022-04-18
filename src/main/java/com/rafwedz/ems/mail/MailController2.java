package com.rafwedz.ems.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail2")
@CrossOrigin("*")
public class MailController2 {

    public final Email email;

    @Autowired
    private SendMailService sendEmailService2;

    public MailController2() {
        email = new Email();
    }

    @PostMapping
    public ResponseEntity<Email> envoieMail(@RequestBody Email email){
        try {

            sendEmailService2.sendMail(email);

            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }




}

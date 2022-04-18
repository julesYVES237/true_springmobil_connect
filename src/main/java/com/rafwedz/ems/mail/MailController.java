package com.rafwedz.ems.mail;

import com.rafwedz.ems.mail.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
@CrossOrigin("*")
public class MailController {

    public final Email email;

    @Autowired
    private SendMailService sendEmailService;

    public MailController() {
        email = new Email();
    }

    @PostMapping
    public ResponseEntity<Email> envoieMail(@RequestBody Email email){
        try {

            sendEmailService.sendMail(email);

            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }




}

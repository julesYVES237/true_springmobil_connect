package com.rafwedz.ems.mail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;


import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;

@Service
public class SendMailService {

    private final List<Email> emails= new ArrayList();

    @Autowired
    private JavaMailSender javaMailSender;


    public void sendMail(Email email) throws MessagingException {

      //  Email email2 = new Email();
        MimeMessage message = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);


        helper.setTo("juyv02@gmail.com");
        helper.setSubject("First Name");
            helper.setText("Bonjour , " +email.getUser()+ "Vous contacte avec pour  objet "+email.getOject()+" le numero de telephone"+email.getPhone()+"et le sujet est"+email.getText());

        javaMailSender.send(message);




    }

   /* public void sendMail(Email email1){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        init().setText(email1.getPrice());
        simpleMailMessage.setText(email1.getPhone());
        simpleMailMessage.setSubject(email1.getSubject());
        simpleMailMessage.setText(email1.getNomCmd());
        simpleMailMessage.setText(email1.getUser());
        javaMailSender.send(simpleMailMessage);

        emails.add(email1);

    }

*/


    public List<Email> getAllMail() {
        return emails;
    }





}


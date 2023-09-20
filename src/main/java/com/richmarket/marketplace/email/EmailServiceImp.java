package com.richmarket.marketplace.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmailServiceImp implements EmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sentEmail(EmailDTO emailDTO) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailDTO.getEmail());
        message.setSubject(emailDTO.getSubject());
        message.setText(emailDTO.getMessage());
        javaMailSender.send(message);
    }

    @Override
    public void sendBulkEmail(ArrayList<EmailDTO> emailDTOS) {

    }
}

package com.richmarket.marketplace.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author Richard K Chifamba on 9/20/2023
 **/

@RestController
@RequestMapping("/v1/email")
public class EmailAPI {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailDTO emailDTO) {
        emailService.sentEmail(emailDTO);
        return "Email sent successfully.";
    }
}

package com.richmarket.marketplace.email;

import java.util.ArrayList;

public interface EmailService {

    void sentEmail(EmailDTO emailDTO);

    void sendBulkEmail(ArrayList<EmailDTO> emailDTOS);

}

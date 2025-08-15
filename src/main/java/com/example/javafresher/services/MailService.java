package com.example.javafresher.services;


import org.springframework.stereotype.Service;

@Service
public interface MailService {
    //void sendHtmlMail(DataMailDTO dataMail, String templateName);
    String  sendTextMail(String to, String subject, String text);

    //void sendFileMail(String to, String subject, String text, String path);
}

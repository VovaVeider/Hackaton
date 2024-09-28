package com.hackaton.case2.email;

import jakarta.mail.MessagingException;

import java.io.FileNotFoundException;

public interface EmailSender {
    public void sendSimpleEmail(String toAddress, String subject, String message);

    public void sendEmailWithAttachment(
            String toAddress, String subject, String message, String attachment, String attachmentName)
            throws MessagingException, FileNotFoundException;
}

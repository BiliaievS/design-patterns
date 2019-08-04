package com.patterns.gof.structural.bridge;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("EmailMessageSender: Sending email message...");
    }
}

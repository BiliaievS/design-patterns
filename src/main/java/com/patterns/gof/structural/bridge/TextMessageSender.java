package com.patterns.gof.structural.bridge;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public class TextMessageSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("TextMessageSender: Sending text message...");
    }
}

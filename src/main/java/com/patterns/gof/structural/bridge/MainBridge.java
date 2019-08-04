package com.patterns.gof.structural.bridge;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public class MainBridge {
    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage(new TextMessageSender());
        textMessage.send();

        EmailMessage emailMessage = new EmailMessage(new EmailMessageSender());
        emailMessage.send();
    }
}

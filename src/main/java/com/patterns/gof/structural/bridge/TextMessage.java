package com.patterns.gof.structural.bridge;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public class TextMessage extends Message {

    public TextMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage();
    }
}

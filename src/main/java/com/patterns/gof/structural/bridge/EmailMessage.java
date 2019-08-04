package com.patterns.gof.structural.bridge;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public class EmailMessage extends Message {

    public EmailMessage(MessageSender sender){
        super(sender);
    }

    @Override
    public void send() {
        sender.sendMessage();
    }
}

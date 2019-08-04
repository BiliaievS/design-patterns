package com.patterns.gof.structural.bridge;

/**
 * @author Sergii Biliaiev
 * Created on 04/08/2019.
 */
public abstract class Message {

    protected MessageSender sender;

    public Message(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void send();
}

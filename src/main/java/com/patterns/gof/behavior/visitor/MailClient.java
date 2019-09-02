package com.patterns.gof.behavior.visitor;

/**
 * @author Sergii Biliaiev
 * Created on 02/09/2019.
 */
public interface MailClient {
    void sendMail(String[] mailInfo);
    void receiveMail(String[] mailInfo);
    boolean accept(MailClientVisitor visitor);
}

package com.patterns.gof.behavior.visitor;

import java.util.Map;

/**
 * @author Sergii Biliaiev
 * Created on 02/09/2019.
 */
public class OperaMailClient implements MailClient {
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("OperaMailClient: Sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("OperaMailClient: Receiving mail");
    }

    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}

package com.patterns.gof.behavior.visitor;

/**
 * @author Sergii Biliaiev
 * Created on 02/09/2019.
 */
public class ZimbraMailClient implements MailClient {
    @Override
    public void sendMail(String[] mailInfo) {
        System.out.println("ZimbraMailClient: sending mail");
    }

    @Override
    public void receiveMail(String[] mailInfo) {
        System.out.println("ZimbraMailClient: receiving mail");
    }

    @Override
    public boolean accept(MailClientVisitor visitor) {
        visitor.visit(this);
        return true;
    }
}

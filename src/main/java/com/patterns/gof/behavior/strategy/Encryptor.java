package com.patterns.gof.behavior.strategy;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class Encryptor {
    private EncryptionStrategy strategy;
    private String plainText;

    public Encryptor(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public void encrypt() {
        strategy.encryptData(plainText);
    }
}

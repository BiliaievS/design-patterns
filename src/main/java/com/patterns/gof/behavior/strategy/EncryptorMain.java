package com.patterns.gof.behavior.strategy;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class EncryptorMain {
    public static void main(String[] args) {
        Encryptor aesEncryptor = new Encryptor(new AesEncryptionStrategy());
        aesEncryptor.setPlainText("This is plain text");
        aesEncryptor.encrypt();

        Encryptor bfEncryptor = new Encryptor(new BlowfishEncryptionStrategy());
        bfEncryptor.setPlainText("This is plain text");
        bfEncryptor.encrypt();
    }

}

package com.patterns.gof.behavior.strategy;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public class AesEncryptionStrategy implements EncryptionStrategy {
    @Override
    public void encryptData(String plainText) {
        System.out.println("-------Encrypting data using AES algorithm-------");
        try {
            KeyGenerator generator = KeyGenerator.getInstance("AES");
            generator.init(128);
            SecretKey secretKey = generator.generateKey();
            byte[] plainTextBytes = plainText.getBytes("UTF8");

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plainTextBytes);

            System.out.println("Original data: " + plainText);
            System.out.println("Encrypted data: ");

            for (int i = 0; i < cipherText.length; i++) {
                System.out.print(cipherText[i]+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

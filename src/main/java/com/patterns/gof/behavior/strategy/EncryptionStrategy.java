package com.patterns.gof.behavior.strategy;

/**
 * @author Sergii Biliaiev
 * Created on 01/09/2019.
 */
public interface EncryptionStrategy {
    void encryptData(String plainText);
}

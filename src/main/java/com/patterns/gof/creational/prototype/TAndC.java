package com.patterns.gof.creational.prototype;

/**
 * @author Sergii Biliaiev
 * Created on 28/07/2019.
 */
public class TAndC extends PrototypeCapableDocument {

    @Override
    public PrototypeCapableDocument cloneDocument() {
        TAndC tAndC = null;
        try {
            tAndC = (TAndC) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }
}

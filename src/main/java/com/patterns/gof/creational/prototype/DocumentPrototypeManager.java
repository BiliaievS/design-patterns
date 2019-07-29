package com.patterns.gof.creational.prototype;

import java.util.HashMap;

/**
 * @author Sergii Biliaiev
 * Created on 29/07/2019.
 */
public class DocumentPrototypeManager {

    private static java.util.Map<String, PrototypeCapableDocument> prototypes = new HashMap<>();
    static {
        TAndC tAndC = new TAndC();
        tAndC.setVendorName("Vendor name PlaceHolder");
        tAndC.setContent("Please read and accept the terms and conditions...");
        prototypes.put("tandc", tAndC);

        AuthorizedSignatory authorizedSignatory = new AuthorizedSignatory();
        authorizedSignatory.setName("Andrew Clark");
        authorizedSignatory.setDesignation("Operation Head");

        NDAgreement nda = new NDAgreement();
        nda.setVendorName("Vendor Name Placeholder");
        nda.setContent("Please read and accept the NDA...");
        nda.setAuthorizedSignatory(authorizedSignatory);
        prototypes.put("nda", nda);
    }


    private static PrototypeCapableDocument getClonedDocument(String type) {
        PrototypeCapableDocument document = null;
        try {
            PrototypeCapableDocument doc = prototypes.get(type);
            document = doc.cloneDocument();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return document;
    }

    public static void main(String[] args) {
        PrototypeCapableDocument clonedDocument = getClonedDocument("tandc");
        System.out.println(clonedDocument);
        clonedDocument.setVendorName("Mary Parker");
        System.out.println(clonedDocument);

        PrototypeCapableDocument nda = getClonedDocument("nda");
        System.out.println(nda);
        nda.setVendorName("Patrick smith");
        System.out.println(nda);
    }

}

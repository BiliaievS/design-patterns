package com.patterns.gof.creational.prototype;

/**
 * @author Sergii Biliaiev
 * Created on 28/07/2019.
 */
public class NDAgreement extends PrototypeCapableDocument {

    private AuthorizedSignatory authorizedSignatory;

    public AuthorizedSignatory getAuthorizedSignatory() {
        return authorizedSignatory;
    }

    public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
        this.authorizedSignatory = authorizedSignatory;
    }

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        NDAgreement nda;
        nda = (NDAgreement) super.clone();
        AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();
        nda.setAuthorizedSignatory(clonedAuthorizedSignatory);
        return nda;
    }

    @Override
    public String toString() {
        return "[NDAgreement: Vendor Name - " + getVendorName() + ", Content - " + getContent() + ", Authorized Signatory - " + getAuthorizedSignatory() + "]";
    }
}

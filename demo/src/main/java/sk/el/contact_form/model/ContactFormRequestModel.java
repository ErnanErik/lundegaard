package sk.el.contact_form.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ContactFormRequestModel {

    @NotEmpty(message = "Mandatory field!")
    private String contactFormType;

    @NotEmpty(message = "Mandatory field!")
    @Pattern(regexp = "[0-9]+", message = "Only numbers are allowed!")
    private String policyNumber;

    @NotEmpty(message = "Mandatory field!")
    @Pattern(regexp = "[a-zA-Z]+", message = "Only letters are allowed!")
    private String name;

    @NotEmpty(message = "Mandatory field!")
    @Pattern(regexp = "[a-zA-Z]+", message = "Only letters are allowed!")
    private String surname;

    @NotEmpty(message = "Mandatory field!")
    @Size(max = 5000, message = "Max 5000 characters is allowed")
    private String requestField;

    public ContactFormRequestModel(String contactFormType,
                                   String policyNumber,
                                   String name,
                                   String surname,
                                   String message) {
        this.contactFormType = contactFormType;
        this.policyNumber = policyNumber;
        this.name = name;
        this.surname = surname;
        this.requestField = message;
    }
    public ContactFormRequestModel() {}
    public String getContactFormType() {
        return contactFormType;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRequestField() {
        return requestField;
    }

    public void setContactFormType(String contactFormType) {
        this.contactFormType = contactFormType;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRequestField(String requestField) {
        this.requestField = requestField;
    }
}

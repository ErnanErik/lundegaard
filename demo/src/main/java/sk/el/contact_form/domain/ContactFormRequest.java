package sk.el.contact_form.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contact_form_request")
public class ContactFormRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(name = "kind_of_request")
    private String contactFormType;

    @NotNull
    @Column(name = "policy_number")
    private String policyNumber;

    @NotNull
    @Column(name = "first_name")
    private String name;

    @NotNull
    @Column(name = "last_name")
    private String surname;

    @NotNull
    @Column(name = "request_field")
    @Size(max = 5000)
    private String requestField;

    public ContactFormRequest(long id, String contactFormType,
                              String policyNumber,
                              String name,
                              String surname,
                              String message) {
        this.id = id;
        this.contactFormType = contactFormType;
        this.policyNumber = policyNumber;
        this.name = name;
        this.surname = surname;
        this.requestField = message;
    }

    public ContactFormRequest() {}

    public long getId() {
        return id;
    }

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

    public void setId(long id) {
        this.id = id;
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

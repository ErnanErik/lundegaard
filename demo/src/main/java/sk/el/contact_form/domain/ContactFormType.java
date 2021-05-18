package sk.el.contact_form.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contact_form_type")
public class ContactFormType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(name = "type_name")
    private String typeName;

    public ContactFormType(long id,
                           String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public ContactFormType() {}

    public long getId() {
        return id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}

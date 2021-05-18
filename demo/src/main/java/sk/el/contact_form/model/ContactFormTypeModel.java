package sk.el.contact_form.model;

public class ContactFormTypeModel {

    private String typeName;

    public ContactFormTypeModel(String typeName) {
        this.typeName = typeName;
    }

    public ContactFormTypeModel(){}

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}

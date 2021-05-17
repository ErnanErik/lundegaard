package com.Lundegaard.demo.model;

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

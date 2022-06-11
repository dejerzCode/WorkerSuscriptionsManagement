package com.dejerz.workersuscriptionsmanagement.core.entity;

//Inheritance
public class Student extends Person{
    private String id;
    private String picture;
    private String education;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void sendPersonalInformationByEmail(String message) {
        System.out.println(message);
    }
}

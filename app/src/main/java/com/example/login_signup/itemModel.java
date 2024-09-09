package com.example.login_signup;

public class itemModel {
    String firstName;
    String lastName;
    String email;
    int imageId;

    public itemModel(String firstName, String lastName, String email, int imageId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.imageId = imageId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
package com.app.paytm.models;

/**
 * @author t0k02w6 on 16/07/22
 * @project paytm_lld
 */
public class User extends BaseModel{
    private String name;
    private String phoneNumber;
    private String hashsedPassword;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHashsedPassword() {
        return hashsedPassword;
    }

    public void setHashsedPassword(String hashsedPassword) {
        this.hashsedPassword = hashsedPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hashsedPassword='" + hashsedPassword + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


//BCrypt
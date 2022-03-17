package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class User {

    public User(String firstName, String lastname, String password) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.password = password;
    }

    private String firstName;
    private String lastname;
    private String password;

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

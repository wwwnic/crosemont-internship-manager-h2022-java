package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class User {

    public User(int id, String firstName, String lastname, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.password = password;
    }
    
    private int id;
    private String firstName;
    private String lastname;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

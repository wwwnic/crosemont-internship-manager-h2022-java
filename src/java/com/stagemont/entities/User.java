package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class User {

    public User(int id, String firstname, String password) {
        this.id = id;
        this.firstname = firstname;
        this.password = password;
    }

    protected int id;
    protected String firstname;
    protected String password;
    protected String userTypeName;

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

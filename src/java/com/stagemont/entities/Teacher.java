package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class Teacher extends User {

    private String lastname;

    public Teacher(int id, String firstname, String lastname, String password) {
        super(id, firstname, password);
        super.userTypeName = "teacher";
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

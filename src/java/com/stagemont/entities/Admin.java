package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class Admin extends User {

    public Admin(int id, String firstname, String password) {
        super(id, firstname, password);
        super.userTypeName = "admin";
    }
}

package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class Company extends User {

    public Company(int id, String name, String password, String phone, String email, String personInCharge) {
        super(id, name, password);
        super.userTypeName = "company";
        this.phone = phone;
        this.email = email;
        this.personInCharge = personInCharge;
    }

    private String phone;
    private String email;
    private String personInCharge;

    public String getName() {
        return super.firstname;
    }

    public void setName(String name) {
        super.firstname = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }
}

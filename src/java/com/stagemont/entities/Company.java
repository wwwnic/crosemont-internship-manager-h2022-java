package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class Company {

    public Company(String name, String password, String phone, String email, String personInCharge) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.personInCharge = personInCharge;
    }

    private String name;
    private String password;
    private String phone;
    private String email;
    private String personInCharge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

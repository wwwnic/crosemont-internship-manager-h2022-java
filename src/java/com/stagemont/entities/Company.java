package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class Company {

    public Company(int id, String name, String phone, String email, String personInCharge) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.personInCharge = personInCharge;
    }

    private int id;
    private String name;
    private String password;
    private String phone;
    private String email;
    private String personInCharge;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class Company {

    public Company(String name, String password, String phone, String email, String person_in_charge) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.person_in_charge = person_in_charge;
    }

    private String name;
    private String password;
    private String phone;
    private String email;
    private String person_in_charge;

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

    public String getPerson_in_charge() {
        return person_in_charge;
    }

    public void setPerson_in_charge(String person_in_charge) {
        this.person_in_charge = person_in_charge;
    }
}

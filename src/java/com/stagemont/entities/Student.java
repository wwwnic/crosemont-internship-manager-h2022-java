package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet
 */
public class Student extends User {

    private String lastname;

    public Student(int id, String firstName, String lastname, String password, int da, String cv, String letter) {
        super(id, firstName, password);
        super.userTypeName = "student";
        this.da = da;
        this.cv = cv;
        this.letter = letter;
        this.lastname = lastname;
    }

    private int da;
    private String cv;
    private String letter;

    public int getDa() {
        return da;
    }

    public void setDa(int da) {
        this.da = da;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

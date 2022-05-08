package com.stagemont.entities;

import java.util.Date;

/**
 *
 * @author Nicolas Brunet
 */
public class Contract {

    public Contract(int id, Date start_date, Date end_date, Status status, int company_id, int student_id) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = status;
        this.company_id = company_id;
        this.student_id = student_id;
    }

    public Contract() {
    }
    
    /*

    public Contract(Date start_date, Date end_date, Status status, int company_id, int student_id) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.status = status;
        this.company_id = company_id;
        this.student_id = student_id;
    }
    */

    private Date start_date;
    private Date end_date;
    private Status status;
    private int company_id;
    private int student_id;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public java.util.Date getStart_date() {
        return start_date;
    }

    public void setStart_date(java.util.Date start_date) {
        this.start_date = start_date;
    }

    public java.util.Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(java.util.Date end_date) {
        this.end_date = end_date;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}

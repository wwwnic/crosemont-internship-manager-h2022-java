/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.entities;

/**
 *
 * @author Nicolas Brunet permet d'afficher la liste de contrat dans le
 * dashboard etudiant
 */
public class ContractRelation {

    private Company company;
    private Contract contract;
    private Student student;


    public ContractRelation(Contract contract, Student student, Company company) {
        this.company = company;
        this.contract = contract;
        this.student = student;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

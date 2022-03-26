package com.stagemont.source.company;

import com.stagemont.entities.Company;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class CompanyFakeData implements CompanySource {

    @Override
    public Company getCompanyFromId(int id) {
        Company company = new Company(1, "Crosemont", "4132321242", "crosemont@quebec.ca", "Dini");
        return company;
    }

    @Override
    public List<Company> getAllCompany() {
        List<Company> lstCompany = new ArrayList();

        Company company0 = new Company(1, "Meta", "5123213131", "crosemont@quebec.ca", "Dini");
        Company company1 = new Company(2, "Google", "4132321242", "quebec@quebec.ca", "Uber");
        Company company2 = new Company(3, "Ubisoft", "5435334534", "crosemont@crosemont.ca", "Rose");

        for (int i = 0; i < 10; i++) {

            lstCompany.add(company0);
            lstCompany.add(company1);
            lstCompany.add(company2);
        }
        return lstCompany;
    }
}

package com.stagemont.source.company;

import com.stagemont.entities.Company;

/**
 *
 * @author Nicolas Brunet
 */
public class CompanyFakeData implements CompanySource {

    @Override
    public Company getCompanyFromId(int id) {
        Company company = new Company("Crosemont", "egswdrgwergwerg", "4132321242", "crosemont@quebec.ca", "Dini");
        return company;
    }                                                                                                                                                                                                     
}                                                                                                            
                                                                                          
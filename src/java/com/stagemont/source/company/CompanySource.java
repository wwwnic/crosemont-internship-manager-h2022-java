package com.stagemont.source.company;

import com.stagemont.entities.Company;

/**
 *
 * @author Nicolas Brunet
 */
public interface CompanySource {

    public Company getCompanyFromId(int id);
}

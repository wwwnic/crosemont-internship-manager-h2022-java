package com.stagemont.source.company;

import com.stagemont.entities.Company;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public interface CompanySource {

    public Company getCompanyFromId(int id);

    public List<Company> getAllCompany();
}

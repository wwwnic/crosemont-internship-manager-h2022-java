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

    public boolean insertCompany(Company company);

    public boolean deleteCompany(int id);

    public boolean updateCompany(Company company);

    public Company loginCompany(int id, String name, String password);
}

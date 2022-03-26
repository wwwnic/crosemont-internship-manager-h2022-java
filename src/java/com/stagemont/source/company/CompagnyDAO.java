package com.stagemont.source.company;

import com.stagemont.entities.Company;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class CompagnyDAO implements CompanySource {

    @Override
    public Company getCompanyFromId(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Company> getAllCompany() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

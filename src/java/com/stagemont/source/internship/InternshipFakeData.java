/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.internship;

import com.stagemont.entities.Internship;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author melis
 */
public class InternshipFakeData implements InternshipSource {

     List<Internship> listIntern = new ArrayList();
    public InternshipFakeData() {
        this.listIntern.add(new Internship(1, "Developper Intern", "Google is hiring intern developpers who are fluent in : HTML, CSS, PHP, SQL", new Date(2022,1,14), new Date(2022,3,14), 1));
        this.listIntern.add(new Internship(2, "Developper Intern", "Amazon is hiring intern developpers who are fluent in : HTML, CSS, MYSQL, ASP.NET, JAVA", new Date(2021,6,30), new Date(2022,8,30), 2));
        this.listIntern.add(new Internship(3, "Developper Intern", "Meta is hiring intern developpers who are fluent in : HTML, CSS, PHP, SQL, JAVA", new Date(2022,1,14), new Date(2022,3,14), 3));
        this.listIntern.add(new Internship(4, "Engineer Intern", "Dell is hiring intern engineers who are fluent in : C++ and Python", null, null, 4));
        this.listIntern.add(new Internship(5, "Engineer Intern", "Ubisoft is hiring intern engineers who are fluent in : C++ and Python", new Date(2022,5,30), new Date(2022,6,30), 5));
    }
    @Override
    public List<Internship> getAllInternship() {
        return this.listIntern;
    }

    @Override
    public Internship getInternshipFromId(int id) {
        return listIntern.get(id);
    }

    @Override
    public boolean insertInternship(Internship internship) {
        internship.setId(listIntern.size() + 1);
        listIntern.add(internship);
        return true;
    }

    @Override
    public boolean updateInternship(Internship internship) {
        this.listIntern.remove(internship.getId() - 1);
        this.listIntern.add(internship.getId() - 1, internship);
        return true;
    }

    @Override
    public boolean deleteInternship(int id) {
        this.listIntern.remove(id - 1);
        return true;
    }
    
}

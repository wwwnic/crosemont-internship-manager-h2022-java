/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.internship;

import com.stagemont.entities.Internship;
import java.util.List;

/**
 *
 * @author melis
 */
public interface InternshipSource {
    
    public List<Internship> getAllInternship();
    
    public Internship getInternshipFromId(int id);
    
    public boolean insertInternship(Internship internship);

    public boolean updateInternship(Internship internship);

    public boolean deleteInternship(int id);
    
}

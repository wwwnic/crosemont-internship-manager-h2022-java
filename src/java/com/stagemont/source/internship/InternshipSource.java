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
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.job;

import com.stagemont.entities.Job;
import java.util.List;

/**
 *
 * @author melis
 */
public interface JobSource {
    
    public List<Job> getAllJob();
    
}

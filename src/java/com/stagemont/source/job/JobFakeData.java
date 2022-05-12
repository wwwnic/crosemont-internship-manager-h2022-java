/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.job;

import com.stagemont.entities.Job;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author melis
 */
public class JobFakeData implements JobSource {

    List<Job> listJob = new ArrayList();
    public JobFakeData() {
        this.listJob.add(new Job(1, "Developper", "Google is hiring developpers who are fluent in : HTML, CSS, PHP, SQL", new Date(2022,1,14), new Date(2022,3,14), 1));
        this.listJob.add(new Job(2, "Developper", "Amazon is hiring developpers who are fluent in : HTML, CSS, MYSQL, ASP.NET, JAVA", new Date(2021,6,30), new Date(2022,8,30), 2));
        this.listJob.add(new Job(3, "Software Engineer", "Suitable for people able to work with Android mobile", null, null, 3));
        this.listJob.add(new Job(4, "Developper Front-end", "Applicable for people able to work in a fast-pace environnement", null, null, 4));
        this.listJob.add(new Job(5, "Developper Front-end", "Applicable for people able to work in a fast-pace environnement with flexible hours", null, null, 5));
    }
    @Override
    public List<Job> getAllJob() {
        return this.listJob;
    }

    @Override
    public Job getJobFromId(int id) {
        return listJob.get(id);
    }

    @Override
    public boolean insertJob(Job job) {
        job.setId(listJob.size() + 1);
        listJob.add(job);
        return true;
    }

    @Override
    public boolean updateJob(Job job) {
        this.listJob.remove(job.getId() - 1);
        this.listJob.add(job.getId() - 1, job);
        return true;
    }

    @Override
    public boolean deleteJob(int id) {
        this.listJob.remove(id - 1);
        return true;
    }
    
}

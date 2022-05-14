/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.teacher;

import com.stagemont.entities.Teacher;
import java.util.List;

/**
 *
 * @author Brune
 */
public interface TeacherSource {

    public Teacher getTeacherFromId(int id);

    public List<Teacher> getAllTeacher();

    public boolean insertTeacher(Teacher teacher);

    public boolean updateTeacher(Teacher teacher);

    public boolean deleteTeacher(int id);
    
    public Teacher loginTeacher(int id, String firstName, String password);
}

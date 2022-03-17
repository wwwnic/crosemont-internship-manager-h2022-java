package com.stagemont.source.student;

import com.stagemont.entities.Student;

/**
 *
 * @author Nicolas Brunet
 */
public interface StudentSource {

    public Student getStudentFromId(int id);
}

package com.stagemont.source.student;

import com.stagemont.entities.Student;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public interface StudentSource {

    public List<Student> getAllStudents();
}

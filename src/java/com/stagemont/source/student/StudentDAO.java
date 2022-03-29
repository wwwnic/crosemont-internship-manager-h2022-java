package com.stagemont.source.student;

import com.stagemont.entities.Student;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class StudentDAO implements StudentSource {

    @Override
    public List<Student> getAllStudents() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Student getStudentFromId(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

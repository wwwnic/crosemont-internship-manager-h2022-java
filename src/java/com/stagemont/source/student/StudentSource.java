package com.stagemont.source.student;

import com.stagemont.entities.Student;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public interface StudentSource {

    public List<Student> getAllStudents();

    public Student getStudentFromId(int id);

    public boolean insertStudent(Student student);

    public boolean updateStudent(Student student);

    public boolean deleteStudent(int id);

    public Student loginStudent(int id, String firstName, String password);
}

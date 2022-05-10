package com.stagemont.source.student;

import com.stagemont.entities.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class StudentFakeData implements StudentSource {

    List<Student> lstStudent = new ArrayList();
    public StudentFakeData() {
        this.lstStudent.add(new Student(1, "Nicolas", "Brunet", "ALLO", 41242, "ALLO", "ALLO"));
        this.lstStudent.add(new Student(2, "Prenom", "Nom", "ALLO", 12345, "ALLO", "ALLO"));
        this.lstStudent.add(new Student(3, "RICO", "COCO", "ALLO", 10101, "ALLO", "ALLO"));
    }
    
    
    
    @Override
    public List<Student> getAllStudents() {
        return this.lstStudent;
    }

    @Override
    public Student getStudentFromId(int id) {

       return lstStudent.get(id);
    }

    @Override
    public boolean insertStudent(Student student) {
        student.setId(lstStudent.size()+1);
        lstStudent.add(student);
        return true;
    }

    @Override
    public boolean updateStudent(Student student) {
        this.lstStudent.remove(student.getId() - 1);
        this.lstStudent.add(student.getId() - 1, student);
        return true;
    }

    @Override
    public boolean deleteStudent(int id) {
        this.lstStudent.remove(id - 1);
        return true;
    }
}

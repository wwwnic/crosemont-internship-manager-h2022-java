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
        Student student0 = new Student(1, "Nicolas", "Brunet", "ALLO", 41242, "ALLO", "ALLO");
        Student student1 = new Student(2, "Prenom", "Nom", "ALLO", 12345, "ALLO", "ALLO");
        Student student2 = new Student(3, "RICO", "COCO", "ALLO", 10101, "ALLO", "ALLO");
        Student student4 = new Student(4, "a", "a", "a", 444444, "a", "a");
        Student student5 = new Student(5, "b", "b", "b", 55555, "b", "b");

        List<Student> lstStudent = new ArrayList();

        lstStudent.add(student0);
        lstStudent.add(student1);
        lstStudent.add(student2);
        lstStudent.add(student4);
        lstStudent.add(student5);

        /*
        for (int i = 0; i < 10; i++) {
            lstStudent.add(student0);
            lstStudent.add(student1);
            lstStudent.add(student2);
        }
         */
        return lstStudent;
    }

    @Override
    public Student getStudentFromId(int id) {

        return lstStudent.get(id);
    }

    @Override
    public boolean insertStudent(Student student) {
        student.setId(lstStudent.size() + 1);
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

    @Override
    public Student loginStudent(int id, String firstName, String password) {
        return lstStudent.get(1);
    }
}

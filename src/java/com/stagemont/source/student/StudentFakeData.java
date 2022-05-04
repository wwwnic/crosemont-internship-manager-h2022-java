package com.stagemont.source.student;

import com.stagemont.entities.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class StudentFakeData implements StudentSource {

    @Override
    public List<Student> getAllStudents() {
        Student student0 = new Student(1, "Nicolas", "Brunet", "ALLO", 41242, "ALLO", "ALLO");
        Student student1 = new Student(2, "Prenom", "Nom", "ALLO", 12345, "ALLO", "ALLO");
        Student student2 = new Student(3, "RICO", "COCO", "ALLO", 10101, "ALLO", "ALLO");

        List<Student> lstStudent = new ArrayList();

        lstStudent.add(student0);
        lstStudent.add(student1);
        lstStudent.add(student2);
            
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

        Student student;

        switch (id) {
            case 1:
                student = new Student(1, "Nicolas", "Brunet", "ALLO", 41242, "ALLO", "ALLO");
                break;
            case 2:
                student = new Student(2, "Prenom", "Nom", "ALLO", 12345, "ALLO", "ALLO");
                break;
            default:
                student = new Student(3, "RICO", "COCO", "ALLO", 10101, "ALLO", "ALLO");
        }
        return student;
    }
}

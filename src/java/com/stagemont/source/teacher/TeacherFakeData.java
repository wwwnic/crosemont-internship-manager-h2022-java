package com.stagemont.source.teacher;

import com.stagemont.entities.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class TeacherFakeData implements TeacherSource {

    List<Teacher> listTeacher = new ArrayList();

    public TeacherFakeData() {
        this.listTeacher.add(new Teacher(1, "Marc", "Ville", "pw"));
        this.listTeacher.add(new Teacher(2, "Simone", "Phare", "pw2"));
        this.listTeacher.add(new Teacher(3, "Roger", "Cartier", "pw3"));
    }

    @Override
    public Teacher getTeacherFromId(int id) {
        return listTeacher.get(id);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return this.listTeacher;
    }

    @Override
    public boolean insertTeacher(Teacher teacher) {
        teacher.setId(listTeacher.size() + 1);
        listTeacher.add(teacher);
        return true;
    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        this.listTeacher.remove(teacher.getId() - 1);
        this.listTeacher.add(teacher.getId() - 1, teacher);
        return true;
    }

    @Override
    public boolean deleteTeacher(int id) {
        this.listTeacher.remove(id - 1);
        return true;
    }

}

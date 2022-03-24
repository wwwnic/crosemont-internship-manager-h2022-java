package com.stagemont.source.teacher;

import com.stagemont.source.company.*;
import com.stagemont.entities.Company;
import com.stagemont.entities.Teacher;

/**
 *
 * @author Nicolas Brunet
 */
public class TeacherFakeData implements TeacherSource {

    @Override
    public Teacher getTeacherFromId(int id) {
        Teacher teacher = new Teacher(1, "Crosemont", "egswdrgwergwerg", "4132321242");
        return teacher;
    }
}

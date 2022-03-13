package com.stegemont.source.student;

import com.stagemont.entities.User;

/**
 *
 * @author Nicolas Brunet
 */
public interface StudentDAO {

    public User getStudentFromId(int id);
}

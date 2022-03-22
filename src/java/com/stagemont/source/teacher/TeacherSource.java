/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.stagemont.source.teacher;

import com.stagemont.entities.Teacher;

/**
 *
 * @author Brune
 */
public interface TeacherSource {

        public Teacher getTeacherFromId(int id);

    
}

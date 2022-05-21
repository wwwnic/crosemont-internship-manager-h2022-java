/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stagemont.source.admin;

import com.stagemont.entities.Admin;

/**
 *
 * @author Brune
 */
public interface AdminSource {

    public Admin loginAdmin(int id, String firstName, String password);
}

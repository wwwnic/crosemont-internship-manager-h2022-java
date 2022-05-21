package com.stagemont.source.admin;

import com.stagemont.entities.Admin;
import com.stagemont.entities.Teacher;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas Brunet
 */
public class AdminFakeData implements AdminSource {

    List<Admin> listAdmin = new ArrayList();

    public AdminFakeData() {
        this.listAdmin.add(new Admin(1, "root", "root"));
        this.listAdmin.add(new Admin(2, "admin", "admin"));
        this.listAdmin.add(new Admin(3, "sonic", "adventure"));
    }

    @Override
    public Admin loginAdmin(int id, String firstName, String password) {
        return this.listAdmin.get(0);
    }

}

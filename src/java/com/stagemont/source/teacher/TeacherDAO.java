package com.stagemont.source.teacher;

import com.stagemont.entities.Teacher;
import com.stagemont.service.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Brunet
 */
public class TeacherDAO implements TeacherSource {

    private static final String SQL_SELECT = "SELECT * FROM teacher";

    private static final String SQL_SELECT_BY_ID = "SELECT * FROM teacher WHERE id = ?";

    private static final String SQL_INSERT = "INSERT INTO teacher(firstName,lastname,password) value(?,?,?)";

    private static final String SQL_UPDATE = "UPDATE teacher SET firstname = ?, lastname = ?, password = ? WHERE id = ?";

    private static final String SQL_DELETE = "DELETE FROM teacher WHERE id = ?";

    private static final String SQL_LOGIN = "SELECT * FROM teacher WHERE id = ? AND firstName = ? AND password = BINARY ?";

    @Override
    public Teacher getTeacherFromId(int id) {

        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_BY_ID);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                Teacher teacher = new Teacher(
                        result.getInt("id"),
                        result.getString("firstName"),
                        result.getString("lastname"),
                        result.getString("password")
                );
                ConnectionDB.closeConnection();
                return teacher;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public List<Teacher> getAllTeacher() {
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT);
            ResultSet result = ps.executeQuery();
            List<Teacher> teacherLst = new ArrayList();

            while (result.next()) {
                teacherLst.add(new Teacher(
                        result.getInt("id"),
                        result.getString("firstName"),
                        result.getString("lastname"),
                        result.getString("password")
                ));
            }
            ConnectionDB.closeConnection();
            return teacherLst;

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean insertTeacher(Teacher teacher) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_INSERT);

            ps.setString(1, teacher.getFirstname());
            ps.setString(2, teacher.getLastname());
            ps.setString(3, teacher.getPassword());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;

    }

    @Override
    public boolean updateTeacher(Teacher teacher) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_UPDATE);

            ps.setString(1, teacher.getFirstname());
            ps.setString(2, teacher.getLastname());
            ps.setString(3, teacher.getPassword());
            ps.setInt(4, teacher.getId());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public boolean deleteTeacher(int id) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public Teacher loginTeacher(int id, String firstName, String password) {

        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_LOGIN);
            ps.setInt(1, id);
            ps.setString(2, firstName);
            ps.setString(3, password);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                Teacher teacher = new Teacher(
                        result.getInt("id"),
                        result.getString("firstName"),
                        result.getString("lastname"),
                        result.getString("password")
                );
                ConnectionDB.closeConnection();
                return teacher;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TeacherDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}

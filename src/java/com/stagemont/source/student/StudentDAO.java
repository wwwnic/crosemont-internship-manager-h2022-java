package com.stagemont.source.student;

import com.stagemont.entities.Student;
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
public class StudentDAO implements StudentSource {

    private static final String SQL_SELECT = "SELECT * FROM student";

    private static final String SQL_SELECT_BY_ID = "SELECT * FROM student WHERE id = ?";

    private static final String SQL_INSERT = "INSERT INTO student(firstName,lastname,password,da,cv,letter) value(?,?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE student SET firstname = ?, lastname = ?, password = ?, da = ?, cv = ?, letter = ? WHERE id = ?";

    private static final String SQL_DELETE = "DELETE FROM student WHERE id = ?";
    
    @Override
    public List<Student> getAllStudents() {
       try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT);
            ResultSet result = ps.executeQuery();
            List<Student> studentLst = new ArrayList();

            while (result.next()){
                studentLst.add(new Student(
                        result.getInt("id"),
                        result.getString("firstName"),
                        result.getString("lastname"),
                        result.getString("password"),
                        result.getInt("da"),
                        result.getString("cv"),
                        result.getString("letter")
                )); 
            }
            ConnectionDB.closeConnection();
            return studentLst;
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Student getStudentFromId(int id) {
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(SQL_SELECT_BY_ID);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();

            if (result.next()) {
                Student student = new Student(
                        result.getInt("id"),
                        result.getString("firstName"),
                        result.getString("lastname"),
                        result.getString("password"),
                        result.getInt("da"),
                        result.getString("cv"),
                        result.getString("letter")
                );
                ConnectionDB.closeConnection();
                return student;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean insertStudent(Student student) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_INSERT);

            ps.setString(1, student.getFirstname());
            ps.setString(2, student.getLastname());
            ps.setString(3, student.getPassword());
            ps.setInt(4, student.getDa());
            ps.setString(5, student.getCv());
            ps.setString(6, student.getLetter());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public boolean updateStudent(Student student) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_UPDATE);

            ps.setString(1, student.getFirstname());
            ps.setString(2, student.getLastname());
            ps.setString(3, student.getPassword());
            ps.setInt(4, student.getId());
            ps.setString(5, student.getCv());
            ps.setString(6, student.getLetter());

            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }

    @Override
    public boolean deleteStudent(int id) {
        boolean isSucces = false;
        int rowCount = 0;
        PreparedStatement ps;
        try {
            ps = ConnectionDB.getConnection().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);
            
            rowCount = ps.executeUpdate();
            ConnectionDB.closeConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rowCount != 0) {
            isSucces = true;
        }
        return isSucces;
    }
}

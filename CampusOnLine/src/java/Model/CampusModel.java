/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Berke
 */
public class CampusModel {
    
    private String driver ="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost/campus++db";
    
    private Connection c;

    public CampusModel() {
         try {
            Class.forName(driver);
            c = (Connection) DriverManager.getConnection(url,"root","");
            
        } catch (Exception ex) {
             System.out.println(ex.getMessage()); 
        }
    }
    
    public User checkLoginInfo(String username, String password){
        
        User u = null;
        
        try {
            Statement st = (Statement) c.createStatement();
            Statement st2 = (Statement) c.createStatement();
            Statement st3 = (Statement) c.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM user WHERE userNo = '"+username+"' AND password = '"+password+"' ");
            res.next();
            
            ResultSet res2;
            ResultSet res3;
            if(res.getInt("status") == 3){
                res2 = st2.executeQuery("SELECT * FROM instructor WHERE user_id = '"+res.getInt("id")+"'");
                res2.next();
                
                res3 = st3.executeQuery("SELECT * FROM department WHERE id = "+res2.getInt("department_id")+"");
                res3.next();
                Department d = new Department(res3.getInt("id"),res3.getString("name"),res3.getInt("num_dept_elect"),
                                              res3.getInt("num_comp_elect"),res3.getInt("num_free_elect"));
                
                
                u = new Instructor(res.getString("userNo"),
                                       res2.getBoolean("isAdvisor"),
                                       res2.getBoolean("isDeptAdmin"),
                                       res2.getBoolean("isQuotaManager"),
                                       d,
                                       res2.getString("officeroom"),
                                       res.getInt("id"),
                                       res.getString("name"),
                                        res.getString("surname"),
                                        res.getInt("status"),
                                        res.getString("password"),
                                        res.getString("address"),
                                        res.getString("tc"),
                                        res.getString("phone"),
                                        res.getString("bloodType"));
                
                //instructor schedule ekleme
            }
            else if(res.getInt("status") == 4){
                res2 = st2.executeQuery("SELECT * FROM student WHERE user_id = '"+res.getInt("id")+"'");
                res2.next();
                
                res3 = st3.executeQuery("SELECT * FROM department WHERE id = "+res2.getInt("department_id")+"");
                res3.next();
                Department d = new Department(res3.getInt("id"),res3.getString("name"),res3.getInt("num_dept_elect"),
                                              res3.getInt("num_comp_elect"),res3.getInt("num_free_elect"));
                
                u = new Student(res.getString("userNo"),
                                       res2.getString("standing"),
                                       res2.getInt("advisor_id"),
                                       d,
                                       res.getInt("id"),
                                       res.getString("name"),
                                        res.getString("surname"),
                                        res.getInt("status"),
                                        res.getString("password"),
                                        res.getString("address"),
                                        res.getString("tc"),
                                        res.getString("phone"),
                                        res.getString("bloodType"));
                
                //u.setSchedule(getStudentSchedule(u.getId()));
            }
            else if(res.getInt("status") == 1){
                u = new User(res.getInt("id"),
                                       res.getString("name"),
                                        res.getString("surname"),
                                        res.getInt("status"),
                                        res.getString("password"),
                                        res.getString("address"),
                                        res.getString("tc"),
                                        res.getString("phone"),
                                        res.getString("bloodType"),res.getString("userNo"));
                
            }
            
        } catch (SQLException ex) {
            ex.getStackTrace();
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }
    
    public ArrayList<Course> getAllCourse(){
        ArrayList<Course> allCourse = new ArrayList();
        
        try {
            com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) c.createStatement();
            com.mysql.jdbc.Statement st1 = (com.mysql.jdbc.Statement) c.createStatement();
            com.mysql.jdbc.Statement st2 = (com.mysql.jdbc.Statement) c.createStatement();
            com.mysql.jdbc.Statement st3 = (com.mysql.jdbc.Statement) c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM course");
            while(rs.next()){
                Course c = new Course(rs.getString("code"),
                                       rs.getString("name"),
                                       rs.getInt("credit"),
                                       rs.getInt("department_id"),
                                       rs.getBoolean("isConsent")
                                      );
                allCourse.add(c);
                ResultSet rs2 = st1.executeQuery("SELECT prerequisite_code FROM prerequisite WHERE course_code='"+rs.getString("code")+"'");
                while(rs2.next())
                    c.addPrere(rs2.getString("prerequisite_code"));
                
                ResultSet rs3 = st2.executeQuery("SELECT * FROM courseSection WHERE course_code='"+rs.getString("code")+"'");
                while(rs3.next()){
                    Section s = new Section(rs3.getInt("instructor_id"),rs3.getString("days"),rs3.getString("hours"),rs3.getString("section"),rs3.getString("room"));
                    c.addSection(s);
                }
                
                ResultSet rs4 = st3.executeQuery("SELECT * FROM courseType WHERE course_code = '"+rs.getString("code")+"'");
                while(rs4.next()){
                    CourseAndDept t = new CourseAndDept(rs4.getInt("department_id"), rs4.getString("status"));
                    c.addType(t);
                }
              
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allCourse;
       
   }
    
    public ArrayList<String> getOldCoursesByStuID(int id){
        ArrayList<String> courses = new ArrayList<String>();
        
        try {
            Statement st = (Statement) c.createStatement();
            ResultSet rs = st.executeQuery("SELECT course_code FROM studentTakenCourses WHERE student_id = "+id+" AND "
                                            + "(grade = 'FF' OR grade = 'DD' OR grade = 'DC')");
            while(rs.next()){
                courses.add(rs.getString("course_code"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courses;
    }
    
    public boolean addDepartment(Department d){
        try {
            Statement st = (Statement) c.createStatement();
            st.execute("INSERT INTO department (name, num_dept_elect,num_comp_elect, num_free_elect) VALUES('"+d.name+"', "+d.numOfDeptElect+", "+d.numOfCompElect+", "+d.numOfFreeElect+" )");
            return true;
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    public boolean updateDepartment(Department d){
        try {
            Statement st = (Statement) c.createStatement();
            st.execute("UPDATE department SET name='"+d.name+"',num_dept_elect="+d.numOfDeptElect+",num_comp_elect="+d.numOfCompElect+",num_free_elect = "+d.numOfFreeElect+" WHERE id = "+d.getId());
            return true;
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
    
    public ArrayList<Department> getAllDepartment(){
        ArrayList <Department> depts = new ArrayList<Department>();
        try {
            Statement st = (Statement) c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM department");
            
            while(rs.next()){
                depts.add(new Department(rs.getInt("id"),rs.getString("name"),rs.getInt("num_dept_elect"),rs.getInt("num_comp_elect"),rs.getInt("num_free_elect")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return depts;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CampusModel;
import Model.Course;
import Model.CourseAndDept;
import Model.Student;
import Model.User;
import java.util.ArrayList;

/**
 *
 * @author Berke
 */
public class Registration {
    
    private CampusModel m;
    private User u;
    private Student s;
    
    public ArrayList<Course> obligatory;
    public ArrayList<Course> deptElective;
    public ArrayList<Course> compElective;
    public ArrayList<Course> freeElective;

    public Registration() {
        m = new CampusModel();
        obligatory = new ArrayList<Course>();
        deptElective = new ArrayList<Course>();
        compElective = new ArrayList<Course>();
        freeElective = new ArrayList<Course>();
    }
    
    
    
    public void filterCourses(){
        boolean check = true;
        s = (Student)u;
        ArrayList <Course> allCourse = m.getAllCourse();
        ArrayList <String> oldCourse = m.getOldCoursesByStuID(u.getId());
        for (Course course : allCourse) {
            for(CourseAndDept t : course.courseTypesForDepts){
                if(t.deptID == s.getDept().getId()){
                    for(String str : oldCourse){
                        if(course.code.equals(str) ){
                            check = false;
                            if(t.type.equals("obligatory")){
                                obligatory.add(course);
                            }
                            if(t.type.equals("departmental")){
                                deptElective.add(course);
                            }
                            if(t.type.equals("complementary")){
                                compElective.add(course);
                            }
                            if(t.type.equals("free")){
                                freeElective.add(course);
                            }
                            if(!check)
                                break;
                        }
                        if(check){
                            check = false;
                            if(t.type.equals("obligatory")){
                                obligatory.add(course);
                            }
                            if(t.type.equals("departmental")){
                                deptElective.add(course);
                            }
                            if(t.type.equals("complementary")){
                                compElective.add(course);
                            }
                            if(t.type.equals("free")){
                                freeElective.add(course);
                            }
                            if(!check)
                                break;
                        }
                    }
                }
                check = true;
            }
        }
        
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }
    
    
    
    
    
}

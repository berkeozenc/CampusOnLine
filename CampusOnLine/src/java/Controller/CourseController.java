/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.CampusModel;
import Model.Course;
import Model.Department;
import java.util.ArrayList;
/**
 *
 * @author LabTek
 */
public class CourseController {
    private String courseCode;
    private String courseName;
    private int credit;
    private int department_id;
    private int isConsent;
    private int consentApproval;
    private int quota;
     private CampusModel m;
     private  ArrayList<Course> courses;
     private  ArrayList<Department> depts ;
     private String updateMessage;
     public Department selected;

    public CourseController() {
         m = new CampusModel();
        courses = new ArrayList<Course>();
        updateMessage = "";
    }
    
    
    public boolean add(){
        Course c = new Course(courseCode,courseName,credit,department_id,isConsent,quota);
         return m.addCourse(c);
    }
    public void getAllCourses(){
        courses = m.getAllCourses();
    }
    
     public void getAllDept(){
        depts = m.getAllDepartment();
    }
     
     public ArrayList<Department> getDepts() {
        return depts;
    }

    
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public int getIsConsent() {
        return isConsent;
    }

    public int getConsentApproval() {
        return consentApproval;
    }

    public int getQuota() {
        return quota;
    }

    public void setConsentApproval(int consentApproval) {
        this.consentApproval = consentApproval;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public void setIsConsent(int isConsent) {
        this.isConsent = isConsent;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
    
    
}

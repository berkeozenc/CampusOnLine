package Model;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ozgecan
 */
public class Course {
    
    public String code;
    public String name;
    public int credit;
    public int deptID;
    public boolean isConsent;
    public ArrayList <Section> sections ;
    public ArrayList <String> prerequisites;
    public ArrayList <CourseAndDept> courseTypesForDepts;
    

    public Course(String code, String name, int credit, int deptID, boolean isConsent) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.deptID = deptID;
        this.isConsent = isConsent;
        this.sections=new ArrayList();
        this.prerequisites=new ArrayList();
        courseTypesForDepts = new ArrayList<CourseAndDept>();
    }
    
    public void addSection(Section s){
        sections.add(s);
        
        
    }
    
    public void addPrere(String pre){
        prerequisites.add(pre);
    }
    
    public void addType(CourseAndDept t){
        courseTypesForDepts.add(t);
    }
    
    
    
    
}

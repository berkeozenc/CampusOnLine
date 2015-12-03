/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ozgecan
 */
public class studentTakenCourses {
    public String year;
    public String term;
    public String grade;
    private int studentid;
    public String coursecode;

    public studentTakenCourses(String year, String term, String grade, int studentid, String coursecode) {
        this.year = year;
        this.term = term;
        this.grade = grade;
        this.studentid = studentid;
        this.coursecode = coursecode;
    }

 
    
    
}

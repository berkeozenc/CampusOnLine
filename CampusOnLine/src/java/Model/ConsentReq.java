/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Berke
 */
public class ConsentReq {
    Course c;
    Student s;
    boolean approved; 

    public ConsentReq(Course c, Student s, boolean appproved) {
        this.c = c;
        this.s = s;
        this.approved = approved;
    }
    
    
    
}

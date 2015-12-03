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
public class Schedule {
    
    private ArrayList<Course> schedule;
    private boolean status ;

    public Schedule() {
        schedule = new ArrayList();
        status = false;
    }
    
    public void addCourse(Course c){ 
        schedule.add(c);
        
    }

    public ArrayList<Course> getSchedule() {
        return schedule;
    }
    
    public void approve(){
        status = true;
    }
    
    
    
}

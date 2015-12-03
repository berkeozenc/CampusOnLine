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
public class Department {
    
    private int id;
    public String name;
    public int numOfDeptElect;
    public int numOfCompElect;
    public int numOfFreeElect;
            
    public ArrayList<String> curriculum; //Stringler dönem+kod+name yapısında olacak

    public Department(int id, String name, int numOfDeptElect, int numOfCompElect, int numOfFreeElect) {
        this.id = id;
        this.name = name;
        this.numOfDeptElect = numOfDeptElect;
        this.numOfCompElect = numOfCompElect;
        this.numOfFreeElect = numOfFreeElect;
        
    }
    
    public Department(String name, int numOfDeptElect, int numOfCompElect, int numOfFreeElect) {
        
        this.name = name;
        this.numOfDeptElect = numOfDeptElect;
        this.numOfCompElect = numOfCompElect;
        this.numOfFreeElect = numOfFreeElect;
        
    }

    public int getId() {
        return id;
    }

    
    
    
    
    
    
}

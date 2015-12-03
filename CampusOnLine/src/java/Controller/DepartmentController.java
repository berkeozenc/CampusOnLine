/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CampusModel;
import Model.Department;
import java.util.ArrayList;

/**
 *
 * @author LabTek
 */
public class DepartmentController {
    public String depName;
    public String numOfDepElect;
    public String numOfCompElect;
    public String numOfFreeElect;
    
    public Department selected;
    private  ArrayList<Department> depts ;
    private String updateMessage;
    
    private CampusModel m;

    public DepartmentController() {
        m = new CampusModel();
        depts = new ArrayList<Department>();
        updateMessage = "";
    }
    
    public boolean add(){
        Department d = new Department(depName,Integer.parseInt(numOfDepElect), Integer.parseInt(numOfCompElect), Integer.parseInt(numOfFreeElect));
         return m.addDepartment(d);
    }
    public void update(Department d){
        
            if(depName != null)
                d.name = depName;
            if(numOfDepElect != null)
                d.numOfDeptElect = Integer.parseInt(numOfDepElect);
            if(numOfCompElect != null)
                d.numOfCompElect = Integer.parseInt(numOfCompElect);
            if(numOfFreeElect != null)
                d.numOfFreeElect = Integer.parseInt(numOfFreeElect);

             if(m.updateDepartment(d)){
                 updateMessage = "Update Successfull";
             }else{
                 updateMessage = "Update failed";
             }
        
    }
    public void setSelected(int id){
        
        for(Department d:depts ){
            if(d.getId() == id)
                selected = d;
        }
    }
    
    public void getAllDept(){
        depts = m.getAllDepartment();
    }

    public String getDepName() {
        return depName;
    }

    public String getNumOfCompElect() {
        return numOfCompElect;
    }

    public String getNumOfDepElect() {
        return numOfDepElect;
    }

    public String getNumOfFreeElect() {
        return numOfFreeElect;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void setNumOfCompElect(String numOfCompElect) {
        this.numOfCompElect = numOfCompElect;
    }

    public void setNumOfDepElect(String numOfDepElect) {
        this.numOfDepElect = numOfDepElect;
    }

    public void setNumOfFreeElect(String numOfFreeElect) {
        this.numOfFreeElect = numOfFreeElect;
    }

    public ArrayList<Department> getDepts() {
        return depts;
    }

    public Department getSelected() {
        return selected;
    }

    public String getUpdateMessage() {
        return updateMessage;
    }
    
    
    
    
    
    
    
    
}

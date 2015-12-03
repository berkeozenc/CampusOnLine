package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ozgecan
 */
public class Instructor extends User {
    
    private String instructorNo;
    private boolean isAdvisor;
    private boolean isDepAdmin;
    private boolean isQuotaMan;
    private Department dept;
    private String officeRoom;

    public Instructor(String userNo,boolean isAdvisor, boolean isDepAdmin, boolean isQuotaMan, Department dept, String officeRoom, int id, String name, String surname, int status, String password, String address, String tc, String phone, String bloodType) {
        super(id, name, surname, status, password, address, tc, phone, bloodType, userNo);
        this.instructorNo = instructorNo;
        this.isAdvisor = isAdvisor;
        this.isDepAdmin = isDepAdmin;
        this.isQuotaMan = isQuotaMan;
        this.dept = dept;
        this.officeRoom = officeRoom;
    }

    @Override
    public String getAddress() {
        return super.getAddress(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBloodType() {
        return super.getBloodType(); //To change body of generated methods, choose Tools | Templates.
    }

    public Department getDept() {
        return dept;
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getInstructorNo() {
        return instructorNo;
    }

    public String getOfficeRoom() {
        return officeRoom;
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPhone() {
        return super.getPhone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Schedule getSchedule() {
        return super.getSchedule(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getStatus() {
        return super.getStatus(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSurname() {
        return super.getSurname(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTc() {
        return super.getTc(); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isIsAdvisor() {
        return isAdvisor;
    }

    public boolean isIsDepAdmin() {
        return isDepAdmin;
    }

    public boolean isIsQuotaMan() {
        return isQuotaMan;
    }
    
      
    
}

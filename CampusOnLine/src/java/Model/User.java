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
public class User {
    
    private int id;
    public String name;
    public String surname;
    private int status;
    private String password;
    private String address;
    private String tc;
    private String phone;
    private String bloodType;
    private String userNo;
    private Schedule schedule;

    public User(int id, String name, String surname, int status, String password, String address, String tc, String phone, String bloodType, String userNo) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.password = password;
        this.address = address;
        this.tc = tc;
        this.phone = phone;
        this.bloodType = bloodType;
        schedule = new Schedule();
        this.userNo = userNo;
        
    }

    public int getId() {
        return id;
    }

    public String getTc() {
        return tc;
    }

    public String getSurname() {
        return surname;
    }

    public int getStatus() {
        return status;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getAddress() {
        return address;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    
    
    
    
    
    
    
    
}

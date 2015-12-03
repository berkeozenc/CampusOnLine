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
public class Student extends User {
    
    private String studentNo;
    private String standing;
    private int advisorID;
    private Department dept;
    
    

    public Student(String userNo,String standing, int advisorID, Department dept, int id, String name, String surname, int status, String password, String address, String tc, String phone, String bloodType) {
        super(id, name, surname, status, password, address, tc, phone, bloodType,userNo);
        this.studentNo = studentNo;
        this.standing = standing;
        this.advisorID = advisorID;
        this.dept = dept;
        
    }

    public Department getDept() {
        return dept;
    }

    public int getAdvisorID() {
        return advisorID;
    }

    public String getSurname() {
        return surname;
    }

    public String getStudentNo() {
        return studentNo;
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStanding() {
        return standing;
    }

    public String getName() {
        return name;
    }

    
    
    
    
    

}

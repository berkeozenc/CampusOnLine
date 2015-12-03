/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Berke
 */
public class CampusModel {

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/campus++db";

    private Connection c;

    public CampusModel() {
        try {
            Class.forName(driver);
            c = (Connection) DriverManager.getConnection(url, "root", "");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public User checkLoginInfo(String username, String password) {

        User u = null;

        try {
            Statement st = (Statement) c.createStatement();
            Statement st2 = (Statement) c.createStatement();
            Statement st3 = (Statement) c.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM user WHERE userNo = '" + username + "' AND password = '" + password + "' ");
            res.next();

            ResultSet res2;
            ResultSet res3;
            if (res.getInt("status") == 3) {
                res2 = st2.executeQuery("SELECT * FROM instructor WHERE user_id = '" + res.getInt("id") + "'");
                res2.next();

                Department d = getDeptByID(res.getInt("department_id"));

                u = new Instructor(res.getString("userNo"),
                        res2.getBoolean("isAdvisor"),
                        res2.getBoolean("isDeptAdmin"),
                        res2.getBoolean("isQuotaManager"),
                        d,
                        res2.getString("officeroom"),
                        res.getInt("id"),
                        res.getString("name"),
                        res.getString("surname"),
                        res.getInt("status"),
                        res.getString("password"),
                        res.getString("address"),
                        res.getString("tc"),
                        res.getString("phone"),
                        res.getString("bloodType"));

                //instructor schedule ekleme
            } else if (res.getInt("status") == 4) {
                res2 = st2.executeQuery("SELECT * FROM student WHERE user_id = '" + res.getInt("id") + "'");
                res2.next();

                Department d = getDeptByID(res.getInt("department_id"));

                u = new Student(res.getString("userNo"),
                        res2.getString("standing"),
                        res2.getInt("advisor_id"),
                        d,
                        res.getInt("id"),
                        res.getString("name"),
                        res.getString("surname"),
                        res.getInt("status"),
                        res.getString("password"),
                        res.getString("address"),
                        res.getString("tc"),
                        res.getString("phone"),
                        res.getString("bloodType"));

                //u.setSchedule(getStudentSchedule(u.getId()));
            } else if (res.getInt("status") == 1) {
                u = new User(res.getInt("id"),
                        res.getString("name"),
                        res.getString("surname"),
                        res.getInt("status"),
                        res.getString("password"),
                        res.getString("address"),
                        res.getString("tc"),
                        res.getString("phone"),
                        res.getString("bloodType"), res.getString("userNo"));

            }

        } catch (SQLException ex) {
            ex.getStackTrace();
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }
    
    public Department getDeptByID(int id){
        Department d = null;
        try {
            Statement st3 = (Statement) c.createStatement();
            
            ResultSet res3 = st3.executeQuery("SELECT * FROM department WHERE id = " + id + "");
            res3.next();
            d = new Department(res3.getInt("id"), res3.getString("name"), res3.getInt("num_dept_elect"),
                    res3.getInt("num_comp_elect"), res3.getInt("num_free_elect"));
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    public ArrayList<Course> getAllCourse() {
        ArrayList<Course> allCourse = new ArrayList();

        try {
            com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) c.createStatement();
            com.mysql.jdbc.Statement st1 = (com.mysql.jdbc.Statement) c.createStatement();
            com.mysql.jdbc.Statement st2 = (com.mysql.jdbc.Statement) c.createStatement();
            com.mysql.jdbc.Statement st3 = (com.mysql.jdbc.Statement) c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM course");
<<<<<<< HEAD
            while(rs.next()){
                int isConsent=0;
               
                if(rs.getBoolean("isConsent")){
                    isConsent=1;
                }
                
                Course c = new Course(rs.getString("code"),
                                       rs.getString("name"),
                                       rs.getInt("credit"),
                                       rs.getInt("department_id"),
                                       isConsent,
                                       rs.getInt("quota")
                                      );
=======
            while (rs.next()) {
                Course c = new Course(rs.getString("code"),
                        rs.getString("name"),
                        rs.getInt("credit"),
                        rs.getInt("department_id"),
                        rs.getBoolean("isConsent")
                );
>>>>>>> origin/master
                allCourse.add(c);
                ResultSet rs2 = st1.executeQuery("SELECT prerequisite_code FROM prerequisite WHERE course_code='" + rs.getString("code") + "'");
                while (rs2.next()) {
                    c.addPrere(rs2.getString("prerequisite_code"));
                }

                ResultSet rs3 = st2.executeQuery("SELECT * FROM courseSection WHERE course_code='" + rs.getString("code") + "'");
                while (rs3.next()) {
                    Section s = new Section(rs3.getInt("instructor_id"), rs3.getString("days"), rs3.getString("hours"), rs3.getString("section"), rs3.getString("room"));
                    c.addSection(s);
                }

                ResultSet rs4 = st3.executeQuery("SELECT * FROM courseType WHERE course_code = '" + rs.getString("code") + "'");
                while (rs4.next()) {
                    CourseAndDept t = new CourseAndDept(rs4.getInt("department_id"), rs4.getString("status"));
                    c.addType(t);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allCourse;

    }

    public ArrayList<String> getOldCoursesByStuID(int id) {
        ArrayList<String> courses = new ArrayList<String>();

        try {
            Statement st = (Statement) c.createStatement();
            ResultSet rs = st.executeQuery("SELECT course_code FROM studentTakenCourses WHERE student_id = " + id + " AND "
                    + "(grade = 'FF' OR grade = 'DD' OR grade = 'DC')");
            while (rs.next()) {
                courses.add(rs.getString("course_code"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courses;
    }

    public boolean addDepartment(Department d) {
        try {
            Statement st = (Statement) c.createStatement();
            st.execute("INSERT INTO department (name, num_dept_elect,num_comp_elect, num_free_elect) VALUES('" + d.name + "', " + d.numOfDeptElect + ", " + d.numOfCompElect + ", " + d.numOfFreeElect + " )");
            return true;
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }

    public boolean updateDepartment(Department d) {
        try {
            Statement st = (Statement) c.createStatement();
            st.execute("UPDATE department SET name='" + d.name + "',num_dept_elect=" + d.numOfDeptElect + ",num_comp_elect=" + d.numOfCompElect + ",num_free_elect = " + d.numOfFreeElect + " WHERE id = " + d.getId());
            return true;
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }

    public ArrayList<Department> getAllDepartment() {
        ArrayList<Department> depts = new ArrayList<Department>();
        try {
            Statement st = (Statement) c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM department");

            while (rs.next()) {
                depts.add(new Department(rs.getInt("id"), rs.getString("name"), rs.getInt("num_dept_elect"), rs.getInt("num_comp_elect"), rs.getInt("num_free_elect")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return depts;
    }

    public void insertRegHoldMessage(RegHold reg) {
        try {
            Statement st = (Statement) c.createStatement();
            st.executeQuery("INSERT INTO registerationHold (text, title, holded_id) VALUES('" + reg.getText() + "', '" + reg.getTitle() + "', '" + reg.getHoldedID() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<RegHold> getRegHoldMessage(int holdedID) {
        ArrayList<RegHold> allHolds = new ArrayList();

        try {
            Statement st = (Statement) c.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM registerationHold WHERE userNo = '" + holdedID + "'");
            res.next();

            while (res.next()) {

                allHolds.add(new RegHold(res.getInt("id"),
                        res.getString("text"),
                        res.getString("title"),
                        res.getInt("holded_id")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return allHolds;
    }

    public void getConsentReq(int instructorID) {
        try {
            Statement st = (Statement) c.createStatement();
            ResultSet c = st.executeQuery("SELECT STC.course_code, STC.student_id,C.consentApproval FROM courseSection AS CS, studentTakesCourse AS STC, course AS C WHERE "
                    + "CS.instructor_id =  " + instructorID + " AND"
                    + "C.isConsent = '1' AND"
                    + "C.consentApproval = '0' AND"
                    + "STC.advisorApproval = '0' AND"
                    + "CS.instructor_id = STC.instructor_id AND"
                    + "CS.days = STC.days AND CS.hours = STC.hours AND"
                    + "CS.course_code = STC.course_code AND"
                    + "CS.course_code = C.code");
            while (c.next()) {
                ConsentReq cr = new ConsentReq(getCourseByCode(c.getString("STC.course_code")), getStudentByID(Integer.parseInt(c.getString("STC.student_id"))), c.getBoolean("C.consentApproval"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
<<<<<<< HEAD
     public boolean addCourse(Course C){
        try {
            Statement st = (Statement) c.createStatement();
            st.execute("INSERT INTO course (code,name,credit,department_id,isConsent,quota) VALUES('"+C.code+"', '"+C.name+"', "+C.credit+", "+C.deptID+"," +C.isConsent+","+C.quota+" )");
            return true;
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
        return false;
    }
     public ArrayList<Course> getAllCourses(){
        ArrayList <Course> courses = new ArrayList<Course>();
        try {
            Statement st = (Statement) c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM course");
            
            while(rs.next()){
                courses.add(new Course(rs.getString("code"),rs.getString("name"),rs.getInt("credit"),rs.getInt("department_id"),rs.getInt("isConsent"),rs.getInt("quota")));
=======
     public Student getStudentByID(int studentID){ //buraya öğrencnin geçmiş ders bilgisini de ekle
        Student s = null;
        try {
            com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) c.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user AS U, student AS S WHERE U.id=S.user_id AND U.status = 4 AND S.user_id = '"+studentID+"'");
           rs.next();
           
           Department d = getDeptByID(rs.getInt("S.department_id"));
                s = new Student(rs.getString("S.studentNo"),
                                       rs.getString("S.standing"),
                                       rs.getInt("S.advisor_id"),
                                       d,
                                       rs.getInt("U.id"),
                                       rs.getString("U.name"),
                                        rs.getString("U.surname"),
                                        rs.getInt("U.status"),
                                        rs.getString("U.password"),
                                        rs.getString("U.address"),
                                        rs.getString("U.tc"),
                                        rs.getString("U.phone"),
                                        rs.getString("U.bloodType"));
                
            s.setSchedule(getStudetsSchedule(studentID));
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return s;
        
    }
     
      public Schedule getStudetsSchedule(int studentID){
        Schedule s = new Schedule();
        try {  
            com.mysql.jdbc.Statement st2 = (com.mysql.jdbc.Statement) c.createStatement();
            ResultSet courses = st2.executeQuery("SELECT * FROM studentTakesCourses AS STC, course AS C, courseSection AS CS"
                    + " WHERE student_id = '"+studentID+"' AND STC.course_code = C.code AND "
                    + "STC.instructor_id = CS.instructor_id AND STC.days = CS.days AND STC.hours = CS.hours");
            Course c = null;
            Section se = null;
            while(courses.next()){
                c = new Course(courses.getString("C.code"),courses.getString("C.name"), courses.getInt("C.credit"), courses.getInt("C.department_id"),courses.getBoolean("isConsent"));
                se = new Section(courses.getInt("CS.instructor_id"),courses.getString("CS.days"),courses.getString("CS.hours"),courses.getString("CS.section"),courses.getString("C.room"));
                c.addSection(se);
                s.addCourse(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
      
      public ArrayList<Student> getWaitingForApproval(int advisorID){
        ArrayList<Student> studentList = null;
        try {
            com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) c.createStatement();
            ResultSet Students = st.executeQuery("SELECT * FROM student WHERE advisor_id= '"+advisorID+"'");
            studentList = new ArrayList();
            while(Students.next()){
                studentList.add(getStudentByID(Students.getInt("user_id")));
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentList;
    }
    
    public void updateApprovedStudent(Student s){
        User u = (User)s;
        try {
            com.mysql.jdbc.Statement st = (com.mysql.jdbc.Statement) c.createStatement();
            Schedule sch = s.getSchedule();
            Course c = null;
            Section sec = null;
            for(int i=0; i<sch.getSchedule().size();i++){
                c = sch.getSchedule().get(i);
                for(int j=0; j<c.sections.size(); j++){
                    sec = c.sections.get(j);
                    st.executeQuery("UPDATE studetsTakesCourses SET "
                            + "advisorApproval ='1' WHERE "
                            + "student_id ="+u.getId()+" AND"
                            + "course_code = '"+c.code+"' AND"
                            + "instructor_id= "+sec.instructorID+" AND"
                            + "days = '"+sec.days+"' AND"
                            + "hours = '"+sec.hours+"'");
                    
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateConsentReq(ConsentReq cs) {
        try {
            Statement st = (Statement) c.createStatement();
            if (cs.approved) {
                st.execute("UPDATE course SET consentApproval = '1' WHERE code = '" + cs.c.code + "' AND isConsent = '1'");
            } else {
                st.execute("UPDATE course SET consentApproval = '0' WHERE code = '" + cs.c.code + "' AND isConsent = '1'");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Course getCourseByCode(String code) {
        Course course = null;
        Section s = null;
        try {
            Statement st = (Statement) c.createStatement();
            Statement st2 = (Statement) c.createStatement();
            Statement st3 = (Statement) c.createStatement();
            ResultSet courseInfo = st.executeQuery("SELECT * FROM course WHERE code = '" + code + "'");
            ResultSet sections = st.executeQuery("SELECT * FROM courseSection WHERE course_code = '" + code + "'");
            ResultSet prerequisites = st.executeQuery("SELECT * FROM prerequsite WHERE course_code = '" + code + "'");

            course = new Course(code, courseInfo.getString("name"), courseInfo.getInt("credit"), courseInfo.getInt("departmen_id"), courseInfo.getBoolean("isConsent"));
            while (sections.next()) {
                s = new Section(sections.getInt("S.instructorID"),
                        sections.getString("S.days"),
                        sections.getString("S.hours"),
                        sections.getString("S.sectionNo"),
                        sections.getString("S.room"));
                course.addSection(s);
            }

            while (prerequisites.next()) {
                course.addPrere(prerequisites.getString("prerequisite_code"));
>>>>>>> origin/master
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< HEAD
        return courses;
    }
    
=======
        return course;
    }

    public ArrayList<Message> getMessage(int id) {
        ArrayList<Message> allMessages = new ArrayList();

        try {
            Statement st = (Statement) c.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM message WHERE id = '" + id + "'");
            res.next();

            while (res.next()) {

                allMessages.add(new Message(res.getInt("id"),
                        res.getInt("senderID"),
                        res.getInt("recieverID"),
                        res.getString("text"),
                        res.getBoolean("isRead"),
                        res.getString("dateTime")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return allMessages;
    }

    public void sendMessage(Message message) {
        try {
            Statement st = (Statement) c.createStatement();
            st.executeQuery("INSERT INTO messages (id, senderID, recieverID, text, isRead, dateTime) VALUES('" + message.getId() + "', '" + message.getSenderID() + "', '" + message.getReceiverID() + "', " + message.getText() + ", '0', " + message.getDateTime() + ")");
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateCourseQuota(Course course) {
        try {
            Statement st = (Statement) c.createStatement();
            st.execute("UPDATE course SET quota = " + course.quota + " WHERE code = '" + course.code + "' ");

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //kişisel bilgilerini görüntüleme
    public User getInfo(String UserNo) {
        User u = null;
        try {
            Statement st = (Statement) c.createStatement();

            ResultSet res = st.executeQuery("SELECT * FROM user AS U WHERE userNo = '" + UserNo + "' ");
            res.next();

            u = new User(res.getInt("U.id"),
                    res.getString("U.name"),
                    res.getString("U.surname"),
                    res.getInt("U.status"),
                    res.getString("U.password"),
                    res.getString("U.address"),
                    res.getString("U.tc"),
                    res.getString("U.phone"),
                    res.getString("U.bloodType"),
                    res.getString("userNo"));

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return u;
    }

    //bilgilerini güncelleme
    public void updateInfo(String UserNo, String name, String surname, int status, String password, String address, String tc, String phone, String bloodType) {

        try {
            Statement st = (Statement) c.createStatement();
            String query = "UPDATE user SET ";
            if (name != null) {
                query += "name = '" + name + "',";
            }
            if (surname != null) {
                query += "' surname = '" + surname + "',";
            }
            if (password != null) {
                query += "'password = '" + password + "',";
            }
            if (address != null) {
                query += "'address = '" + address + "'";
            }
            if (phone != null) {
                query += "'phone = '" + phone + "',";
            }
            if (bloodType != null) {
                query += "'bloodType = '" + bloodType + "',";
            }

            query += "'tc = '" + tc + "' ";
            query += "'  WHERE userNo = '" + UserNo + "' ";

            ResultSet res = st.executeQuery(query);
            res.next();

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public CourseAndInstructorEvaluation getEvaluationForm(String coursecode) {
        SurveyQuestion sq;
        CourseAndInstructorEvaluation cıe = null;
        cıe.courseCode = coursecode;

        try {
            Statement st = (Statement) c.createStatement();

            ResultSet res = st.executeQuery("SELECT * FROM courseAndInsSurvey");

            while (res.next()) {
                sq = new SurveyQuestion(res.getInt("id"),
                        res.getInt("type"),
                        res.getString("text")
                );
                cıe.addQuestion(sq);

            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cıe;
    }

    public void submitEvaluationForm(CourseAndInstructorEvaluation a) {
        SurveyQuestion sq;
        CourseAndInstructorEvaluation cıe = null;

        try {
            Statement st = (Statement) c.createStatement();

            for (int i = 0; i < a.courseQuestions.size(); i++) {
                SurveyQuestion as = a.courseQuestions.get(i);
                ResultSet res = st.executeQuery("INSERT INTO studentSurveyAns ('question_id', 'answer','course_code') VALUES (" + as.getId() + ", " + as.getAnswer() + " ," + a.courseCode + "");
                res.next();
            }

            for (int i = 0; i < a.instructorQuestions.size(); i++) {
                SurveyQuestion as = a.instructorQuestions.get(i);
                ResultSet res = st.executeQuery("INSERT INTO studentSurveyAns ('question_id', 'answer','course_code') VALUES (" + as.getId() + ", " + as.getAnswer() + " ," + a.courseCode + "");
                res.next();
            }

            for (int i = 0; i < a.studentQuestions.size(); i++) {
                SurveyQuestion as = a.studentQuestions.get(i);
                ResultSet res = st.executeQuery("INSERT INTO studentSurveyAns ('question_id', 'answer','course_code') VALUES (" + as.getId() + ", " + as.getAnswer() + " ," + a.courseCode + "");
                res.next();
            }

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Announcement> getAnnouncement() {
        Announcement ann;
        ArrayList<Announcement> Ann = new ArrayList();
        try {
            Statement st = (Statement) c.createStatement();

            ResultSet res = st.executeQuery("SELECT * FROM announcement");

            while (res.next()) {
                ann = new Announcement(res.getInt("id"),
                        res.getString("title"),
                        res.getString("text"),
                        res.getInt("comperid")
                );
            }

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Ann;

    }

    public void insertAnnouncement(Announcement a) {
        try {
            Statement st = (Statement) c.createStatement();

            ResultSet res = st.executeQuery("INSERT INTO studentSurveyAns ('title','text','compeserid') VALUES (" + a.getTitle() + " ," + a.getText() + ", " + a.getComposerID() + "");
            res.next();

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //schedule, curriculum, 
    public ArrayList<String> getCirriculum(int department_id) {
        ArrayList<String> cur = new ArrayList();
        try {
            Statement st = (Statement) c.createStatement();

            ResultSet res = st.executeQuery("SELECT * FROM cirriculum WHERE department_id= '" + department_id + "' ");

            cur.add(res.getString("course_code") + " " + res.getString("course_name") + " " + res.getString("term"));

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cur;
    }

    public ArrayList<String> getPrerequisite(String CourseCode) {
        ArrayList<String> pre = new ArrayList();
        try {
            Statement st = (Statement) c.createStatement();

            ResultSet res = st.executeQuery("SELECT prerequisite_code FROM prerequisite WHERE course_code = '" + CourseCode + "' ");
            res.next();

            pre.add(res.getString("prerequisite_code"));
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pre;

    }

    public ArrayList<studentTakenCourses> getCCRTranscript(int studentid) {
        studentTakenCourses a = null;
        ArrayList<studentTakenCourses> stc = new ArrayList();
        try {
            Statement st = (Statement) c.createStatement();

            ResultSet res = st.executeQuery("SELECT * FROM studentTakenCourses WHERE student_id = '" + studentid + "' ");

            while (res.next()) {

                a = new studentTakenCourses(res.getString("year"),
                        res.getString("term"),
                        res.getString("grade"),
                        res.getInt("studentid"),
                        res.getString("coursecode")
                );
                stc.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stc;

    }

    public ArrayList<String> getFreeRoom(String days, String hours) {
        ArrayList<String> freeRoom = new ArrayList();
        try {
            Statement st = (Statement) c.createStatement();
            Statement st1 = (Statement) c.createStatement();

            ResultSet res = st.executeQuery("SELECT room FROM courseSection WHERE days = '" + days + "' AND hours = '" + hours + "' ");
            ResultSet res1 = st1.executeQuery("SELECT name FROM room");

            boolean isFree = true;
            while (res1.next()) {
                while (res.next()) {
                    if (res1.getString("name").equals(res.getString("room"))) {
                        isFree = false;
                    }
                }
                if (isFree) {
                    freeRoom.add(res1.getString("name"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return freeRoom;

    }

    public void updateStudent(Student a) {
        User u = (User) a;

        try {
            Statement st = (Statement) c.createStatement();
            String query = "UPDATE student SET studentNo = '" + a.getStudentNo() + "',standing = '" + a.getStanding() + "',advisor_id = " + a.getAdvisorID() + ",department_id = " + a.getDeptID() + " WHERE id = " + a.getId();

            String query1 = "UPDATE user SET status = " + u.getStatus() + ",password = '" + u.getPassword() + "', address = '" + u.getAddress() + "', tc = '" + u.getTc() + "', phone = '" + u.getPhone() + "', bloodType = '" + u.getBloodType() + "') WHERE user_id=" + u.getId() + "";

            ResultSet res = st.executeQuery(query);
            res.next();

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateCourse(Course a) {
        Section b = null;
        try {
            Statement st = (Statement) c.createStatement();
            String query = "UPDATE course SET (code = '" + a.code + "', name = '" + a.name + "', credit = " + a.credit + ", dapartment_id = '" + a.deptID + "') ";

            for (int i = 0; i < a.prerequisites.size(); i++) {
                String query1 = "UPDATE prerequisite SET (prerequisite_code = '" + a.prerequisites.get(i) + "') WHERE course_code='" + a.code + "' ";
            }
            for (int i = 0; i < a.sections.size(); i++) {
                b = a.sections.get(i);
                String query2 = "UPDATE courseSection SET (section = '" + b.sectionNo + "') WHERE instructor_id=" + b.getInstructorID() + " AND 'days=" + b.getDays() + "' AND hours=" + b.getHours() + "' ";
            }
            ResultSet res = st.executeQuery(query);
            res.next();

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateInstructor(Instructor ı) {
        User u = (User) ı;

        try {
            Statement st = (Statement) c.createStatement();
            String query = "UPDATE instructor SET (instructorNo = '" + ı.getInstructorNo() + "', isAdvisor = '" + ı.isAdvisor() + "', isDeptAdmin = " + ı.isDepAdmin() + ", isQuotaManager = " + ı.isQuotaMan() + ", department_id = " + ı.getDeptID() + ", officeroom = " + ı.getOfficeRoom() + ") WHERE id=" + ı.getId() + "";

            String query1 = "UPDATE user SET ('status','password','address','tc','phone','bloodType') VALUES (" + u.getStatus() + ",'" + u.getPassword() + "', '" + u.getAddress() + "','" + u.getTc() + "','" + u.getPhone() + "','" + u.getBloodType() + "') WHERE user_id=" + u.getId() + "";

            ResultSet res = st.executeQuery(query);
            res.next();

        } catch (SQLException ex) {
            Logger.getLogger(CampusModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

>>>>>>> origin/master
}

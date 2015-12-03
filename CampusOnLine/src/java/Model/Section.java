package Model;


public class Section {
    public int instructorID;
    public String instructorName;
    public String days;
    public String hours;
    public String sectionNo;
    public String room;

    public Section(int instructorID, String days, String hours, String sectionNo, String room) {
        this.instructorID = instructorID;
        this.days = days;
        this.hours = hours;
        this.sectionNo = sectionNo;
        this.room = room;
    }

    public String getDays() {
        return days;
    }

    public String getHours() {
        return hours;
    }

    public int getInstructorID() {
        return instructorID;
    }
    
    
    
}

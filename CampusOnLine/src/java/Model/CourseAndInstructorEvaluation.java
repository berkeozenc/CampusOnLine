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
public class CourseAndInstructorEvaluation {
    public ArrayList<SurveyQuestion> courseQuestions;
    public ArrayList<SurveyQuestion> instructorQuestions;
    public ArrayList<SurveyQuestion> studentQuestions;
    public String courseCode;

    public CourseAndInstructorEvaluation() {
        courseQuestions = new ArrayList();
        instructorQuestions = new ArrayList();
        studentQuestions = new ArrayList();
    }
    
    public void addQuestion(SurveyQuestion sq){
        if(sq.getType() == 1)
            courseQuestions.add(sq);
        else if(sq.getType() == 2)
            instructorQuestions.add(sq);
        else if(sq.getType() == 3)
            studentQuestions.add(sq);
    }
    
    
    
}

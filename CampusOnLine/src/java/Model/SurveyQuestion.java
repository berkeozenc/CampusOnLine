package campusmodel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ozgecan
 */
public class SurveyQuestion {
    private int id;
    private int type;
    public String text;
    private int answer;

    public SurveyQuestion(int id, int type, String text) {
        this.id = id;
        this.type = type;
        this.text = text;
    }
    
    public void ans(int ans){
        answer = ans;
    }

    public int getType() {
        return type;
    }

    public int getAnswer() {
        return answer;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }
    
    
    
    
    
}

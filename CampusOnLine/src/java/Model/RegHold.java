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
public class RegHold {
    private int id;
    private String text;
    private String title;
    private int holdedID;

    public RegHold(int id, String text, String title, int holdedID) {
        this.id = id;
        this.text = text;
        this.title = title;
        this.holdedID = holdedID;
    }
    
    public int getHoldedID() {
        return holdedID;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
    
    
    
}

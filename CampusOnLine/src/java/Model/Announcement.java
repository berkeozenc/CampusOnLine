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
public class Announcement {
    private int id;
    private String title;
    private String text;
    private int composerID;

    public Announcement(int id, String title, String text, int composerID) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.composerID = composerID;
    }

    public int getId() {
        return id;
    }

    public int getComposerID() {
        return composerID;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
    
    
}

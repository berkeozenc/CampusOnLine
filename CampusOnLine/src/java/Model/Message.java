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
public class Message {
    private int id;
    private int senderID;
    private int receiverID;
    private String text;
    private boolean isRead;
    private String dateTime;

    public Message(int id, int senderID, int receiverID, String text, boolean isRead, String dateTime) {
        this.id = id;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.text = text;
        this.isRead = isRead;
        this.dateTime = dateTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public int getId() {
        return id;
    }

    public int getReceiverID() {
        return receiverID;
    }

    public int getSenderID() {
        return senderID;
    }

    public String getText() {
        return text;
    }

    public boolean isRead() {
        return isRead;
    }
    
    
    
    
}

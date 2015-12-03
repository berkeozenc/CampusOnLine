/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CampusModel;
import Model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Berke
 */
public class Login {
    private String username;
    private String password;
    
    private CampusModel m;
    
    User u;

    public Login() {
        m = new CampusModel();
    }
    
    
    public boolean logIn(){
        
        u = m.checkLoginInfo(username, password);
        if(u != null)
            return true;
        return false;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getU() {
        return u;
    }
    
    
    
    
}

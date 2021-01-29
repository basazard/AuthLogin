/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author basazard
 */
@ManagedBean (name = "value_login", eager = true)
@RequestScoped
public class login implements Serializable{

    public String Username, Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    public String login() {
        String Username = this.Username;
        String Password = this.Password;
        
        if(Username.equals("Shadam") && Password.equalss("shadam123")){
            return "berhasil";
        }
        else {
            return "gagal";
        }
    }
    
}

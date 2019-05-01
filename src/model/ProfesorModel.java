/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Antonio-PC
 */
public class ProfesorModel {

private String user, name, lastName, pass;
    
    public String getUser(){ return user; }
    public String getName(){ return name; }
    public String getLastName(){ return lastName; }
    public String getPass(){ return pass; }
    
    public void setUser(String user){ this.user = user; }
    public void setName(String name){ this.name = name; }
    public void setLastName(String last){ lastName = last; }
    public void setPass(String pass){ this.pass = pass; }
    
    public ProfesorModel(String user, String name, String lastName, String pass){
        this.user = user;
        this.name = name;
        this.lastName = lastName;
        this.pass = pass;
    }    
}

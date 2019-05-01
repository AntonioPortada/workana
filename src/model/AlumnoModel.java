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
public class AlumnoModel {
    
    private String id, name, lastName, pass;
    
    public String getId(){ return id; }
    public String getName(){ return name; }
    public String getLastName(){ return lastName; }
    public String getPass(){ return pass; }
    
    public void setId(String id){ this.id = id; }
    public void setName(String name){ this.name = name; }
    public void setLastName(String last){ lastName = last; }
    public void setPass(String pass){ this.pass = pass; }
    
    public AlumnoModel(String id, String name, String lastName, String pass){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.pass = pass;
    }
}

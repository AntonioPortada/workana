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
public class CursoModel {
    
    private String id, name, seccion, fechaIni, fechaFin, horaIni, horaFin, profesor;
    
    public String getId(){ return id; }
    public String getName(){ return name; }
    public String getSeccion(){ return seccion; }
    public String getFechaIni(){ return fechaIni; }
    public String getFechaFin(){ return fechaFin; }
    public String getHoraIni(){ return horaIni; }
    public String getHoraFin(){ return horaFin; }
    public String getProfesor(){ return profesor; }
    
    public void setId(String id){ this.id = id; }
    public void setName(String name){ this.name = name; }
    public void setSeccion(String seccion){ this.seccion = seccion; }
    public void setFechaIni(String fecha){ this.fechaIni = fecha; }
    public void setFechaFin(String fecha){ this.fechaFin = fecha; }
    public void setHoraIni(String hora){ this.horaIni = hora; }
    public void setHoraFin(String hora){ this.horaFin = hora; }
    public void setProfesor(String profesor){ this.profesor = profesor; }
    
    public CursoModel(String id, String name, String seccion, String fechaIni, String fechaFin, String horaIni, String horaFin, String profesor){
        this.id = id;
        this.name = name;
        this.seccion = seccion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
        this.profesor = profesor;
    }
}

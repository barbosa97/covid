/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moelo.VO;

/**
 *
 * @author andres
 */
public class ClinicaVO {
    private String nombre;
    private String direccion;
    private int id;

    public ClinicaVO() {
    }

    public ClinicaVO(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
      
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}

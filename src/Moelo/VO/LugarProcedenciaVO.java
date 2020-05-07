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
public class LugarProcedenciaVO {
    private String nombre;
   
    public LugarProcedenciaVO() {
    }

    public LugarProcedenciaVO(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moelo.VO;

import java.util.Date;

/**
 *
 * @author andres
 */
public class PruebaVO {
     private Date fecha;
   private Boolean positivo;

    public PruebaVO() {
    }

    public PruebaVO(Date fecha, Boolean positivo) {
        this.fecha = fecha;
        this.positivo = positivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getPositivo() {
        return positivo;
    }

    public void setPositivo(Boolean positivo) {
        this.positivo = positivo;
    }
   
   
   
}

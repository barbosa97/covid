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
public class PersonalSaludVO extends PersonaVO{
  private  EspecialidadVO especialidad;
  private ClinicaVO clinica;
  private PruebaVO prueba;

    public PersonalSaludVO() {
    }

    public PersonalSaludVO(EspecialidadVO especialidad, ClinicaVO clinica, PruebaVO prueba, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.especialidad = especialidad;
        this.clinica = clinica;
        this.prueba = prueba;
    }

    

    public EspecialidadVO getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(EspecialidadVO especialidad) {
        this.especialidad = especialidad;
    }

    public ClinicaVO getClinica() {
        return clinica;
    }

    public void setClinica(ClinicaVO clinica) {
        this.clinica = clinica;
    }

    public PruebaVO getPrueba() {
        return prueba;
    }

    public void setPrueba(PruebaVO prueba) {
        this.prueba = prueba;
    }

}

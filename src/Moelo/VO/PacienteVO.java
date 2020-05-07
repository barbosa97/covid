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
public class PacienteVO extends PersonaVO {

    private LugarProcedenciaVO lugarprocedencia;
    private Date fechaDetencion;
    EstadoVO estado;
    private Boolean casa;
    PersonaVO persona;
    ClinicaVO clinica;
    private int id;

    public PacienteVO() {
    }

    public PacienteVO(LugarProcedenciaVO lugarprocedencia, Date fechaDetencion, EstadoVO estado, Boolean casa, PersonaVO persona,ClinicaVO clinica, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.lugarprocedencia = lugarprocedencia;
        this.fechaDetencion = fechaDetencion;
        this.estado = estado;
        this.casa = casa;
        this.persona = persona;
        this.clinica=clinica;
    }

    public LugarProcedenciaVO getLugarprocedencia() {
        return lugarprocedencia;
    }

    public void setLugarprocedencia(LugarProcedenciaVO lugarprocedencia) {
        this.lugarprocedencia = lugarprocedencia;
    }

    public Date getFechaDetencion() {
        return fechaDetencion;
    }

    public void setFechaDetencion(Date fechaDetencion) {
        this.fechaDetencion = fechaDetencion;
    }

    public EstadoVO getEstado() {
        return estado;
    }

    public void setEstado(EstadoVO estado) {
        this.estado = estado;
    }

    public Boolean getCasa() {
        return casa;
    }

    public void setCasa(Boolean casa) {
        this.casa = casa;
    }

    public PersonaVO getPersona() {
        return persona;
    }

    public void setPersona(PersonaVO persona) {
        this.persona = persona;
    }

    public ClinicaVO getClinica() {
        return clinica;
    }

    public void setClinica(ClinicaVO clinica) {
        this.clinica = clinica;
    }

    public int getId() {
        return id;
    }

}

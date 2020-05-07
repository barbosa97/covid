/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.DAO.Conexion;
import Modelo.DAO.ClinicaDAO;
import Modelo.DAO.PacienteDAO;
import Moelo.VO.ClinicaVO;
import Moelo.VO.PacienteVO;
import Moelo.VO.PersonaVO;
import java.util.Date;

/**
 *
 * @author andre
 */
public class Controlador implements ActionListener {

    private Registro registro;

    public Controlador() {
    }

    public Controlador(Registro registtro) {
        this.registro = registtro;
        actionListener(this);
    }

    private void actionListener(ActionListener Controlador) {
        registro.registrarClinica.addActionListener(Controlador);
        registro.Registrar.addActionListener(Controlador);
        registro.Registrar.addActionListener(Controlador);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        try {
            if (ev.getActionCommand().equals("Registrar")) {
                String nombre = registro.nombretxt.getText();
                String documento = registro.documentotxt.getText();
                String direccion = registro.direcciontxt.getText();
                String telefono = registro.telefonotxt.getText();
                String genero = registro.generotxt.getText();
                String fechaN = registro.fechanacimientotxt.getText();
                String procedencia = registro.procedenciatxt.getText();
                String tipo = registro.TipoPersona.getSelectedItem().toString();

                PersonaVO persona = new PersonaVO(documento, nombre, direccion, telefono, genero, null);
                PacienteVO paciente = new PacienteVO();
                paciente.setPersona(persona);

                Controlador servicio = new Controlador();
                servicio.persona(paciente);

            }
            if (ev.getActionCommand().equals("Registrar Clinica")) {
                String nombre = registro.nombreClinica.getText();
                String direccion = registro.direccionclinicatxt.getText();

                ClinicaVO clinica = new ClinicaVO(nombre, direccion);
                Controlador s = new Controlador();

                s.clinica(clinica);

            }

        } catch (Exception e) {

        }

    }

    private void clinica(ClinicaVO clinica) {
        try {
            ClinicaDAO da = new ClinicaDAO();
            Conexion s = new Conexion();
            da.guardarClinica(s.obtener(), clinica);

            System.out.println("Consulta exitosa clinica");
        } catch (Exception e) {
            System.out.println("Error de consulta ");
        }

    }

    private void persona(PacienteVO paciente) {
        try {
            PacienteDAO da = new PacienteDAO();
            Conexion s = new Conexion();
            da.guardar(s.obtener(), paciente);
            System.out.println("Consulta exitosa paciente");
        } catch (Exception e) {
            System.out.println("Error de consulta paciente");
        }
    }
}

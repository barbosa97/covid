/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;


import Moelo.VO.PacienteVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author andres
 */
public class PacienteDAO {


    
         public void guardar(Connection conexion, PacienteVO PacienteVO) throws SQLException {

        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO paciente(lugarprocedencia, fechadetencion,estado,id,clinica,persona)" + "  VALUES (?,?,?,?,?,?);");

            consulta.setInt(1, Integer.parseInt(PacienteVO.getLugarprocedencia().toString()));
            consulta.setDate(2, (java.sql.Date) PacienteVO.getFechaDetencion());
            consulta.setInt(3, Integer.parseInt(PacienteVO.getEstado().toString()));
            consulta.setInt(4, PacienteVO.getId());
            consulta.setInt(5, Integer.parseInt(PacienteVO.getClinica().toString()));
            consulta.setInt(6, Integer.parseInt(PacienteVO.getPersona().toString()));

            consulta.executeUpdate();

            System.out.println("Consulta exitosa paciente");
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error paciente");
            throw new SQLDataException(e);
        }

    }

}


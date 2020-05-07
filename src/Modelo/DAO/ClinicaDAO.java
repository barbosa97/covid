/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Moelo.VO.ClinicaVO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author andres
 */
public class ClinicaDAO {

 public void guardarClinica(Connection conexion, ClinicaVO ClinicaVO) throws SQLException {

        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO clinica(id,nombre,direccion)"+"VALUE(?,?,?)");
            consulta.setInt(1, ClinicaVO.getId());
            consulta.setString(2, ClinicaVO.getNombre());
            consulta.setString(3, ClinicaVO.getDireccion());
            
           
            consulta.executeUpdate();
            System.out.println("consulta");
        } catch (SQLException ex) {
            System.out.println("error");
            throw new SQLDataException(ex);
        }
    }

   
}

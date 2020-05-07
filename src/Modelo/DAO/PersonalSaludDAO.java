/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Moelo.VO.PersonalSaludVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author andres
 */
public class PersonalSaludDAO  {
     public void guardar(Connection conexion, PersonalSaludVO personalSaludVO) throws SQLException {

        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("Insert INTO persona(nombre,direccion,telefono,genero,fecha_nacimienrto)"+"VALUE(?,?,?,?,?)");
            consulta.setInt(1,(personalSaludVO.getEspecialidad().toString()));
            consulta.setInt(2, (personalSaludVO.getClinica().toString()));
            consulta.setInt(3, (personalSaludVO.getPrueba().toString()));
           
           
            consulta.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLDataException(ex);
        }
    }
}

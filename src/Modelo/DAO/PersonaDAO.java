/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Moelo.VO.PersonaVO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author andres
 */
public class PersonaDAO {
       public void guardar(Connection conexion, PersonaVO personaVO) throws SQLException {

        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("Insert INTO persona(nombre,direccion,telefono,genero,fecha_nacimienrto)"+"VALUE(?,?,?,?,?)");
            consulta.setString(1, personaVO.getNombre());
            consulta.setString(2, personaVO.getDireccion());
            consulta.setString(3, personaVO.getGenero());
            consulta.setString(4, personaVO.getTelefono());
            consulta.setDate(5,(java.sql.Date) personaVO.getFechaNacimiento());
            consulta.setString(6, personaVO.getDocumento());
           
            consulta.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLDataException(ex);
        }
    }
}

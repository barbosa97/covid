/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid;

import Control.Controlador;
import Vista.Registro;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author andres
 */
public class COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Registro r = new Registro();
       new Controlador(r);
       r.setLocationRelativeTo(r);
       r.setVisible(true);
      
    }
    
}


package com.mycompany.holo_mundo_progra_iii;

import javax.swing.JOptionPane;

/**
 *
 * @author mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nombre;
        
        
        JOptionPane.showMessageDialog(null, "¡¡ HOLA MUNDO !!");
        nombre = JOptionPane.showInputDialog(" Dime tu nombre: ");
        JOptionPane.showMessageDialog(null, "Hola "+nombre+" Gracias por darme vida.");
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionasientosbus;

import java.util.Scanner;

/**
 *
 * @author mejia
 */
public class menu {
    
    public static int menu(){
        int opc;
        Scanner in=new Scanner (System.in);
        
         
            System.out.println("\n\n1. Reservar asientos.\n");
            System.out.println("2. Asientos libres.\n");
            System.out.println("3. Consulta de asiento.\n");
            System.out.println("4. Ver ultimos registros.\n");
            System.out.println("0. Salir\n");
            System.out.println("Elija una opcion: ");
            opc=in.nextInt();
            
        
       return opc;
    }
    
}


package com.mycompany.gestionasientosbus;

/**
 *
 * @author mejia
 */
public class mostrar {
    
      public static void mostrar(int plaza, String nombre){
        String tipo;
        
        
        if (plaza%2==0 || plaza==0) {
            tipo="Ventana";
            
        }else{
            tipo="Pasillo";
        }
        
        System.out.println("Asiento No.:  "+plaza);
        System.out.println("Ocupante: "+nombre);
        System.out.println("Tipo se asiento: "+ tipo);
        
    }
    
}


package com.mycompany.gestionasientosbus;

import java.util.Scanner;
import java.io.*;
import java.util.Stack;
import javax.swing.JOptionPane;


/**
 *
 * @author mejia
 */

public class main {
    

    public static void main(String[] args) {
    
    final int SILLAS=20;
    
    int opc, plaza,  LIBRE=0, OCUPADO=1;
    
    int[] asientos =new int[SILLAS];
    String[] nombre= new String[SILLAS];
    String tipo, doc="Datos.txt";
    
    Scanner in=new Scanner (System.in);
    Stack registros=new Stack();   
    
    
    
        
 //Inicializacion de asientos en libre 
 
        for (int i = 0; i < SILLAS; i++) {
            
            asientos[i]=LIBRE;
                       
        }
        
 //Sincronizacion con el archivo de texto
 
        File docu=new File(doc);
        
        try {
            BufferedReader read=new BufferedReader(new FileReader(docu));
            
            String lectura=read.readLine();
            
            while (lectura !=null) {
                
                plaza=Integer.parseInt(lectura);
                nombre[plaza]=read.readLine();
                asientos[plaza]=1;
                lectura=read.readLine();
                
            }
            read.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
 

        
 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     do{
       
       opc = menu.menu();
       
        switch(opc){
            
            case 1:
                 //Reserva de los asientos 
                
                System.out.println("\n\nIngrese el numero de asiento de 0 a "+SILLAS+" que desea reservar: " );
                do{
                plaza=in.nextInt();
                
                if (asientos[plaza]==LIBRE) {
                   
                    in.nextLine();
                    System.out.println("\n\nIngrese el nombre del ocupante: ");
                    nombre[plaza]=in.nextLine();  
                    System.out.println(" ASIENTO RESERVADO !! \n\n");
                    

                    
                    
                    
                }else{
                    System.out.println("El asiento ya esta ocupado elija otro asiento: ");
                    
                }
                }while(asientos[plaza]==OCUPADO);
                asientos[plaza]=OCUPADO;
                
                    mostrar.mostrar(plaza, nombre[plaza]);
                    archivo.modificar("Datos.txt", nombre[plaza], plaza );
                    archivo.estado("Estado.txt", plaza,asientos[plaza]);
                    registros.push(nombre[plaza]);
                    registros.push(plaza);
                
                break;
                
            case 2:
                
                System.out.println("\n\n***   ASIENTOS    ***");
                
                
                for (int i = 0; i < SILLAS; i++) {
                    
                    if (asientos[i]==LIBRE) {
                        System.out.println("Asiento no. "+i+"   Libre");
       
                    }else{
                        System.out.println("Asiento no. "+i+"   Ocupado");
                             
                    }
                }
                



            break;
            
            case 3:
                System.out.println("Ingrese el numero de asiento que desea consultar: ");
                plaza=in.nextInt();
                mostrar.mostrar( plaza, nombre[plaza]);
                in.nextLine();
             
            break;
             
            case 4:
                if (registros.empty()==false ) {
                    
                    System.out.println("++++++++   REGISTROS   ++++++++");
                    
                    while (registros.empty()==false) {
            
                        plaza=(int) registros.pop();
                            if (plaza%2==0 || plaza==0) {
                                tipo="Ventana";
                            } else {
                                tipo="Pasillo";
                            }
                            
                        System.out.println("Asiento no. "+plaza);
                        System.out.println("Ocupante: "+registros.pop());
                        System.out.println("Tipo: "+tipo);
            
          
            
                        System.out.println("\n");
                    
                    }
                    
                }else{
                    
                    System.out.println("No hay registros recientes !! ");
                    
                }
                
                
            break;
  
            case 0:
                System.exit(0);
                
            break;
            
            default:
                System.out.println("Ingrese un valor valido: ");
        }
        
      in.nextLine();
      
     }while(opc != 0);  
      
    }  

    }
        
    



    

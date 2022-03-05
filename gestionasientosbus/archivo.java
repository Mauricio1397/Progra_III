
package com.mycompany.gestionasientosbus;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author mejia
 */
public class archivo {
    
    public static void crear(String nombre){
        File archivo=new File(nombre);
        
        try {
            PrintWriter salida=new PrintWriter(archivo);
            salida.close();
            
            JOptionPane.showMessageDialog(null, "El archivo se creo con exito !!");
        } catch (FileNotFoundException ex) {
           
         JOptionPane.showMessageDialog(null,ex);
         
        }
        
    }
    
    public static void modificar(String nombre, String ocupante, int plaza){
        File archivo=new File(nombre);
        
        try {
            PrintWriter salida=new PrintWriter(new FileWriter(archivo, true));
            
            salida.println(plaza);
            salida.println(ocupante);
            
            salida.close();
            
           // JOptionPane.showMessageDialog(null, " Se agrego!!");
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    
    public static void estado(String nombre, int plaza, int estado){
        File archivo=new File(nombre);
        
        try {
            PrintWriter salida=new PrintWriter(new FileWriter(archivo, true));
            
            salida.println(plaza);
            salida.println(estado);
            salida.close();
            
           // JOptionPane.showMessageDialog(null, " Se agrego!!");
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    
    
    
    public static void leer(String nombre){
        File archivo=new File(nombre);
        
        try {
            BufferedReader read=new BufferedReader(new FileReader(archivo));
            String lectura=read.readLine();
            
            while (lectura !=null) {
                System.out.println(lectura);
                lectura=read.readLine();
                System.out.println(lectura+"\n");
                lectura=read.readLine();
            }
            read.close();
            
            
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
    public static void borrar(String nombre){
        
        File archivo=new File(nombre);
        archivo.delete();
        JOptionPane.showMessageDialog(null , "Archivo Eliminado");
        
    }
    
}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class ClsPersona implements lPersona{

    @Override
    public String getNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void llenar_informacion() {
       
    }

    @Override
    public void Cargar_informacion(String archivo) {
        leerArchivo();
    }

    @Override
    public void guardar_informacion(String archivo) {
        escritura();
    }
    static void leerArchivo(){
        File archivo = new File("C:\\Users\\USUARIO\\Documents\\interfaces\\prueba.txt");
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            
            int NoLinea=1;
            while (lectura != null){
                
                System.out.println("Linea:"+NoLinea+"  Lectura:"+lectura);
                lectura = entrada.readLine();
                NoLinea++; 
            }
            
            entrada.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException ex){
            System.out.println("Hay otro tipo de problema");
        }
    }
    static void escritura() {
          Scanner objeto= new Scanner (System.in);
        String nombre;
         try
        {
            String file = "C:\\Users\\USUARIO\\Documents\\interfaces\\prueba.txt";
            System.out.println("Ingresa el nombre de tu nuevo vendedor");
               nombre=objeto.nextLine( );
            String lineToAppend = nombre;    
            byte[] byteArr = lineToAppend.getBytes();
            Files.write(Paths.get(file), byteArr, StandardOpenOption.APPEND);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
     escritura();
        leerArchivo();
   
    
    }

    
    
}
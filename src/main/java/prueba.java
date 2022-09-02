
import java.io.File;
import java.io.FileNotFoundException;
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
public class prueba {
    public static void main(String[] args) {
        List<ClsVendedores> vendedores= new ArrayList<ClsVendedores>();
        String path="C:\\Users\\USUARIO\\Documents\\interfaces\\prueba.txt";
        
        File file= new File(path);
        try {
            Scanner scanner= new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author asha2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String csvFile = "usuarios.csv";
        BufferedReader br = null;
        String line = "";
        //Se define separador ","
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {                
            String[] datos = line.split(cvsSplitBy);
            for(int i=0;i<datos.length;i++){
                datos[i]=datos[i].replaceAll("^\"+|\"+$", "");
            }
            Usuarios usua= new Usuarios(datos[0],datos[1]);
            MisUsuarios.GuardarUsuario(usua);
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        if (br != null) {
        try {
            br.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        }
        }
        new Login().setVisible(true);
    }
    
}

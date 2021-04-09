/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asha2
 */
public class MisAlumnos {
    private static List<Alumno> alumnoslista = new ArrayList<Alumno>();
    
    public static void GuardarAlumno(Alumno alumno){
        alumnoslista.add(alumno);
        //System.out.println(contacto);
    }
   
    public void inicializaTabla(JTable tabla){
        Vector<String> titulos=new Vector<String>();
        Vector<Vector <Object>>data= new Vector<Vector <Object>>();
        titulos.add("Apellido Paterno");
        titulos.add("Apellido Materno");
        titulos.add("Nombre");
        titulos.add("Apellido");
        
        for(int i=0;i<alumnoslista.size();i++){
            Vector<Object> row=new Vector<Object>();
            row.add(alumnoslista.get(i).getPrimerApellido());
            row.add(alumnoslista.get(i).getSegundoApellido());
            row.add(alumnoslista.get(i).getNombre());
            row.add(alumnoslista.get(i).getMatricula());
            data.add(row);
        }
        
        DefaultTableModel modelo=new DefaultTableModel(data,titulos);
        tabla.setModel(modelo);
    }
   
}

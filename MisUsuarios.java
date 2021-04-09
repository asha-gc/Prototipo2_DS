/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asha2
 */
public class MisUsuarios {
    private static List<Usuarios> listausuarios = new ArrayList<Usuarios>();
    
    public static void GuardarUsuario(Usuarios usuario){
        listausuarios.add(usuario);
        //System.out.println(contacto);
    }
    
    public static boolean ComprobarArrayList(String usuario, String contrasenia){
        boolean login=false;
       for (int i=0;i<listausuarios.size();i++) {
            if(listausuarios.get(i).getUsuario().equals(usuario)){
                if(listausuarios.get(i).getContrasenia().equals(contrasenia)){
                    login=true;
                }
            }
        }
       return login;
    }
}

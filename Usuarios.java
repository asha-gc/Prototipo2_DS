/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author asha2
 */
public class Usuarios {
    private String usuario;
    private String contrasenia;

    public Usuarios(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    @Override
    public boolean equals (Object p) {
        return (this.usuario.equals(((Usuarios)p).usuario) && this.contrasenia==((Usuarios)p).contrasenia);
    }
    
}

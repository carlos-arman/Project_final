/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author ITCA
 */
public interface UsuarioDAO {
    public ArrayList<Usuario> startSesion(String usuario, String clave);
     public boolean guardarUsu(Usuario usuario);
}

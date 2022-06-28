/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexionDB;
import Factory.FactoryConexionDB;
import Model.Categoria;
import Model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ITCA
 */
public class UsuarioImplementar  implements UsuarioDAO{
    
    ConexionDB conn;
    
      public UsuarioImplementar() {
        //Definir a la base de datos que se conectará por defecto.
        //this.conn = FactoryConexionBD.open(FactoryConexionBD.MySQL);
    }
    @Override
    public ArrayList<Usuario> startSesion(String usuario, String clave) {
         this.conn = FactoryConexionDB.open(FactoryConexionDB.MySQL);
        StringBuilder miSQL = new StringBuilder();
        miSQL.append("SELECT * FROM tb_usuario WHERE BINARY correo = '").append(usuario);
        miSQL.append("' and clave = md5('").append(clave);
        miSQL.append("');");  
        System.out.println(miSQL);
        //ArrayList<Usuario> user = new ArrayList(); // crear el array de almacenamiento en cada fial los registros encontrados
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        try{
        //Se crea el objeto ResultSet implementando el método (consultaSQL) creado para la consulta.
            ResultSet resultadoSQL = this.conn.consultaSQL(miSQL.toString());
            while(resultadoSQL.next()){
                
                Usuario usuari = new Usuario();
                //Asignar cada campo consultado al atributo en la clase.
                usuari.setId(resultadoSQL.getInt("id"));
                usuari.setNombre(resultadoSQL.getString("nombre"));
                usuari.setApellido(resultadoSQL.getString("apellido"));
                usuari.setCorreo(resultadoSQL.getString("correo"));
                usuari.setUsuario(resultadoSQL.getString("usuario"));
                usuari.setClave(resultadoSQL.getString("clave"));
                usuari.setTipo(resultadoSQL.getInt("tipo"));
                usuari.setEstado(resultadoSQL.getInt("estado"));
                usuari.setPregunta(resultadoSQL.getString("pregunta"));
                usuari.setRespuesta(resultadoSQL.getString("respuesta"));
                usuari.setFecha(resultadoSQL.getString("fecha_registro"));
                lista.add(usuari); //Agregar al array cada registro encontrado.
                
                /*lista.add(new Usuario(usuario.setId(resultadoSQL.getInt("id")),
                        usuario.setNombre(resultadoSQL.getString("nombre")),
                        usuario.setApellido(resultadoSQL.getString("apellido")),
                        usuario.setCorreo(resultadoSQL.getString("correo")),
                        usuario.setUsuario(resultadoSQL.getString("usuario")),
                        usuario.setClave(resultadoSQL.getString("clave")),
                        usuario.setTipo(resultadoSQL.getInt("tipo")),
                        usuario.setEstado(resultadoSQL.getInt("estado")),
                        usuario.setPregunta(resultadoSQL.getString("pregunta")),
                        usuario.setRespuesta(resultadoSQL.getString("respuesta")),
                        usuario.setFecharegistro(resultadoSQL.getString("fecha_registro"))));*/       
            }
        }catch(Exception ex){
            
        }finally{
            this.conn.cerrarConexion();
        }
        
        return lista;
    }
    
}

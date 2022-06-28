/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Armando
 */
public class Usuario {

    int id;
    String nombre;
    String apellido;
    String correo;
    String usuario;
    String clave;
    int tipo;
    int estado;
    String pregunta;
    String respuesta;
    String fecha;

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    Connection cnn;
    Statement state;
    ResultSet result;

    public Usuario() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventario?zeroDateTimeBehavior=convertToNull", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public Usuario(int id, String nombre, String apellido, String correo, String usuario, String clave, int tipo, int estado, String pregunta, String respuesta, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.usuario = usuario;
        this.clave = clave;
        this.tipo = tipo;
        this.estado = estado;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.fecha = fecha;
    }
     public boolean InsertarDatos() {
        try {
            String miQuery = "insert into tb_usuario values('" + nombre + "','" + apellido + "','" + correo + "','" + usuario + "'," + clave + "','" + tipo + "','" + estado + "','" + pregunta + "','" + respuesta + "','" + fecha + "');";
            int es = 0;
            state = cnn.createStatement();
            es = state.executeUpdate(miQuery);
            if (es == 1) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

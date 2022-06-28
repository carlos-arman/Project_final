/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Usuario;
/**
 *
 * @author Armando
 */
public class RecibirU extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String nombre = request.getParameter("txtNombreU");
        String apellido = request.getParameter("txtApellidoU");
        String correo = request.getParameter("txtCorreoU");
        String usuario = request.getParameter("txtUsuario");
        String  contra = request.getParameter("txtContra");
        String tipo = request.getParameter("txtTipoU");
        String estado = request.getParameter("txtEstadoU");
        String respuesta = request.getParameter("txtRespuestaU");
        String pregunta = request.getParameter("txtPreguntaU");
        String fecha = request.getParameter("txtFechaU");
        
        Usuario usu = new Usuario();
        
        usu.setNombre(nombre);
        usu.setApellido(apellido);
        usu.setCorreo(correo);
        usu.setUsuario(usuario);
        usu.setClave(contra);
        usu.setTipo(Integer.parseInt(tipo));
        usu.setEstado(Integer.parseInt(estado));
        usu.setRespuesta(respuesta);
        usu.setPregunta(pregunta);
        usu.setFecha(fecha);
        
        
        if(usu.InsertarDatos()==true){
            request.getRequestDispatcher("InicioSesion.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("ReistrarUsuario.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsuarioDAO;
import DAO.UsuarioImplementar;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class InisioS extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String email = request.getParameter("txtCorreoU");
        String clave = request.getParameter("txtContra");
        
          /*System.out.println("Usuario: "+user);
        System.out.println("Password: "+pass);*/
        
        //Crear la instancia de UsuarioDAO
        UsuarioDAO usuario = new UsuarioImplementar();
        
        //Creación de arraylist para cargar datos del método que consulta a la base de datos.
        ArrayList<Usuario> users = new ArrayList();
        
        //Creación de la variable de session. Esta permitira verificar si se ha iniciado sessión...
        HttpSession var_Session= request.getSession(true);
        
        //Paso los datos que recibe el método startSesion de la BD al arraylist para manipular dicha
        //información con los métodos predeterminados de un Arraylist. 
        users = usuario.startSesion(email, clave);
        
        //Compruebo o verifico si hay datos en el arrayList. Si hay datos es porque se encontró info en la BD.
        if(users.size()>0){
            
            //System.out.println("Si hay datos jojo...");
            String name_full = users.get(0).getNombre() + " " + users.get(0).getApellido();
            
            //Con el valor que recibo en la variable tipo_user se puede realizar un acceso a diferentes vistas
            //Por ejemplo: Si tipo = 0, que vaya a la vista menu1.jsp. Si tipo = 1, que vaya a la vista menu2.jsp...
            int tipo_user = users.get(0).getTipo();
            String name_user = users.get(0).getUsuario();
            String email_user = users.get(0).getCorreo();
            
           
            var_Session.setAttribute("sessionNombres", name_full);
            
            //request.getSession().setAttribute("sessionNombres", name_full);      //asigancion de valores de la session
            var_Session.setAttribute("sessionTipo", String.valueOf(tipo_user));
            var_Session.setAttribute("sessionUsuario", name_user);
            var_Session.setAttribute("sessionEmail", email_user);
            
            //Seteo en la variable de sesión lista, el contenido del arrayList. Los datos contenidos
            //en el arrayList los obtengo de la consulta realizada a la base de datos.
            var_Session.setAttribute("lista", users); //lista es el nombre de la variable de sesión.
           
            //request.getRequestDispatcher("mostrarusuario.jsp").forward(request, response);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/principal.jsp");
            dispatcher.forward(request, response);
            //response.sendRedirect("principal.jsp");
        }else{
            //System.out.println("No se encontrarón resultados para la busqueda especificada.");
            response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
            //Apunto al servlet que le llame Login pero lo llamo por el parametro url-pattern.
            //Eso se puede verificar en: WEB-INF/web.xml.
            String url = "sesion";   
                        out.println("<script>valor=confirm(\"Error. Usuario o Clave Incorrecto. " +"\\nNombre de Usuario: "  + usuario + " \\n\\nClic en aceptar para volver a intentarlo. \");valor;"
                        + "if (valor==true){"
                        + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='"+ url + "';"
                        + "}"
                        + "</script>");
                }
            }
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

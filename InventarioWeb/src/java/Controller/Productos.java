/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProductosDAO;
import DAO.ProductoDAOImplementar;
import Model.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author zc102
 */
public class Productos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        
    }

        
protected void listaProducto(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ProductosDAO producto = new ProductoDAOImplementar();
        HttpSession sesion = request.getSession(true);
        sesion.setAttribute("lista", producto.Lista());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/listarProductos.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
         String estado = request.getParameter("opcion");
         String id_pro = request.getParameter("id");
         String nombre_pro = request.getParameter("nombre");
         String stock_pro = request.getParameter("stock");
         String precio_pro = request.getParameter("precio");
         String unidadM = request.getParameter("unidad");
         String estado_pro = request.getParameter("estado");
         
         
         /*
         System.out.println("La opcion es: " + estado);
         System.out.println("El ID es: " + id_cat);
         System.out.println("El nombre es: " + nombre_cat);
         System.out.println("El estado es. " + estado_cat);
         */
    
         if(estado.equals("listar")){
             this.listaProducto(request, response);
         }else if(estado.equals("editar")){
             System.out.println("Editando Producto....");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/EditCat.jsp?id="+id_pro+"&&nombre="+nombre_pro+"&&estado="+estado_pro);
             dispatcher.forward(request, response);
         }else if(estado.equals("eliminar")){
             System.out.println("Baja de Producto...");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/eliminarProducto.jsp?id="+id_pro+"&&nombre="+nombre_pro);
             dispatcher.forward(request, response);
         }else if(estado.equals("crear")){
             System.out.println("Crear Producto...");
             String pagina = "/Vistas-Categorias/crearProducto.jsp";
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
             dispatcher.forward(request, response);
         }else{
             
         }
         
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Producto producto = new Producto();
        
        
        producto.setId_producto(Integer.parseInt(request.getParameter("id_producto")));
        producto.setNom_producto(request.getParameter("txtNom_producto"));
        producto.setStock(Integer.parseInt(request.getParameter("txtStock")));
        producto.setPrecio(Integer.parseInt(request.getParameter("txtPrecio")));
        producto.setUnidadMedida(request.getParameter("txtUnidad"));
        producto.setEstado(Integer.parseInt(request.getParameter("txtEstado")));
       
      
        ProductosDAO guardarProducto = new ProductoDAOImplementar();
        guardarProducto.guardarPro(producto);
        this.listaProducto(request, response);
        
        
         
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

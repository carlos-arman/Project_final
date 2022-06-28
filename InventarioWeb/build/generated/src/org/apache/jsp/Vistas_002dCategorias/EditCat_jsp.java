package org.apache.jsp.Vistas_002dCategorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditCat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/pie.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

   
    String id_cat = request.getParameter("id");
    String nombre_cat = request.getParameter("nombre");
    String estado_cat = request.getParameter("estado");
    
    /*out.print("El ID de la categoria es: " + id_cat);
    out.print("El nombre de la categoria es: " + nombre_cat);
    out.print("El estado de la categoria es: " + estado_cat);*/
 
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<di>\r\n");
      out.write("    <div class = \"encabezado\">\r\n");
      out.write("        Sistema de Control de Inventario\r\n");
      out.write("        <a href=\"Index\" class=\"btn btn-primary btn-sm\" role=\"button\">Inicio</a>\r\n");
      out.write("        <a href=\"Categorias?opcion=listar\" class=\"btn btn-primary btn-sm\" role=\"button\">Categorias</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"contenido\">\r\n");
      out.write("\n");
      out.write("         <div class=\"col-auto bg-gray p-5 text-center\">\n");
      out.write("        <h1 class='text-center'>Información de Categoria</h1>\n");
      out.write("        <form action=\"actualizarCategoria\" method=\"post\">\n");
      out.write("        <div class=\"mb-3 row\">\n");
      out.write("            <label for=\"staticEmail\" class=\"col-sm-2 col-form-label\">ID Categoria:</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"text\" value='");
      out.print( id_cat );
      out.write("' name=\"id1\" id=\"id1\" readonly class=\"form-control-plaintext\" id=\"staticEmail\" placeholder=\"ID Categoria\">\n");
      out.write("              <input type=\"hidden\" value='");
      out.print( id_cat );
      out.write("' name=\"id\" id=\"id\" readonly class=\"form-control-plaintext\" id=\"staticEmail\" >\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <div class=\"mb-3 row\">\n");
      out.write("          <label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Nombre Categoria:</label>\n");
      out.write("          <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"text\" value='");
      out.print( nombre_cat );
      out.write("' name=\"nombre\" id=\"nombre\" class=\"form-control\" placeholder=\"Nombre Categoria\" required=\"true\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("          <div class=\"mb-3 row\">\n");
      out.write("          <label for=\"inputPassword\" class=\"col-sm-2 col-form-label\">Estado Categoria:</label>\n");
      out.write("          <div class=\"col-sm-10\">\n");
      out.write("              <input type=\"text\" value='");
      out.print( estado_cat );
      out.write("' name=\"estado\" id=\"estado\" class=\"form-control\" placeholder=\"Estado Categoria\" required=\"true\">\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          \n");
      out.write("          <div class=\"mb-3 row\">\n");
      out.write("          <button type=\"submit\" name=\"send\" class=\"btn btn-success\">Actualizar Categoria</button>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("          \n");
      out.write("          ");

            String dato = request.getParameter("aviso");
            if(dato!=null){
                //out.print("Registro Actualizado Correctamente");
                //System.out.println("End");
           
      out.write("\n");
      out.write("                   <div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("                   Registro Actualizado Correctamente!!\n");
      out.write("                 </div>\n");
      out.write("           ");
   
               }
           
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("         ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"pie\">\r\n");
      out.write("        &COPY; Armando Minero\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

package org.apache.jsp.Vistas_002dCategorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearCategoria_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vistas-Parciales/css-js.jspf");
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
      Model.Categoria Categoria = null;
      synchronized (session) {
        Categoria = (Model.Categoria) _jspx_page_context.getAttribute("Categoria", PageContext.SESSION_SCOPE);
        if (Categoria == null){
          Categoria = new Model.Categoria();
          _jspx_page_context.setAttribute("Categoria", Categoria, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Control de inventario</title>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/estilo-base.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap-theme.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap-theme.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/estilo-base.css\" rel=\"stylesheet\" type=\"text/css\"> \r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function regresar(url){\n");
      out.write("                location.href = url;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<di>\r\n");
      out.write("    <div class = \"encabezado\">\r\n");
      out.write("        Sistema de Control de Inventario\r\n");
      out.write("        <a href=\"Index\" class=\"btn btn-primary btn-sm\" role=\"button\">Inicio</a>\r\n");
      out.write("        <a href=\"Categorias?opcion=listar\" class=\"btn btn-primary btn-sm\" role=\"button\">Categorias</a>\r\n");
      out.write("        <a href=\"Productos.do?opcion=listar\" class=\"btn btn-primary btn-sm\" role=\"button\">Productos</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"contenido\">\r\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <h3>Mantenimiento Categorias</h3>\n");
      out.write("        <form class=\"form-horizontal\" id=\"frmCategoria\" name=\"frmCategoria\" action=\"");
      out.print( request.getContextPath() );
      out.write("/Categorias\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"id_categoria\" value=\"");
      out.print( Categoria.getId_categoria() );
      out.write("\"> \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtNomCategoria\" class=\"col-sm-2 control-label\">Nombre:</label>\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"txtNomCategoria\" value=\"");
      out.print( Categoria.getNom_categoria() );
      out.write("\">\n");
      out.write("                </div>>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"txtEstadoCategoria\" class=\"col-sm-2 control-label\">Estado:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                       <input type=\"text\" class=\"form-control\" name=\"txtEstadoCategoria\" value=\"");
      out.print( Categoria.getEstado_categoria() );
      out.write("\"> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success btn-sm\" name=\"btnGuardar\" value=\"Guardar\" />\n");
      out.write("                            <input type=\"button\" class=\"btn btn-danger btn-sm\" onclick=\"regresar('");
      out.print( request.getContextPath() );
      out.write("/Categorias?opcion=listar')\"\n");
      out.write("                                name=\"btnRegresar\" value=\"Regresar\" />   \n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("                            ");
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

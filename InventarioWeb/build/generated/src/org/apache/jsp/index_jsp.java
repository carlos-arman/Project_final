package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/./WEB-INF/Vistas-Parciales/pie.jspf");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Control de inventario</title>\r\n");
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
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("        salir();\r\n");
      out.write("    });\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("    function salir(){\r\n");
      out.write("        console.log(\"Entramos al método salir\");\r\n");
      out.write("        //INICIO:\r\n");
      out.write("        //document.getElementById('message').onclick = function() {\r\n");
      out.write("        $(\"#closesesion\").click(function(){\r\n");
      out.write("        swal({\r\n");
      out.write("         title: '¿Esta seguro de cerrar su sesion?',\r\n");
      out.write("         text: \"Puedes Iniciar Sesion Nuevamente Cuando lo Desee.\",\r\n");
      out.write("         type: 'warning',\r\n");
      out.write("         showCancelButton: true,\r\n");
      out.write("         confirmButtonColor: '#3085d6',\r\n");
      out.write("         cancelButtonColor: '#d33',\r\n");
      out.write("         confirmButtonText: 'Aceptar',\r\n");
      out.write("         cancelButtonText: 'Cancelar'\r\n");
      out.write("       }).then((result) => {\r\n");
      out.write("         if (result.value) {\r\n");
      out.write("           //swal('Congrats!','You are the winner!','success')\r\n");
      out.write("           location.href= \"salir\";\r\n");
      out.write("           //window.location = 'salir';\r\n");
      out.write("         }else{\r\n");
      out.write("           swal('EXCELENTE','Buena elección, continuas dentro del sistema.','success');\r\n");
      out.write("         }\r\n");
      out.write("       })\r\n");
      out.write("      });\r\n");
      out.write("      //FIN\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("     <nav class=\"navbar navbar-expand-lg\" style=\"background-color: #ffc107;\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("           <!--<a class=\"navbar-brand\" href=\"#\">Navbar</a>-->\r\n");
      out.write("              <img src=\"assets/img/inventario.png\" alt=\"\" width=\"30\" height=\"24\"><strong style=\"color: #fff;\">&nbsp;Inventario 2022</strong> \r\n");
      out.write("              \r\n");
      out.write("              <div class=\"collapse navbar-collapse d-grid gap-5 d-md-flex justify-content-md-end\" id=\"navbarNav\">\r\n");
      out.write("                <ul class=\"navbar-nav\">\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                      <a class=\"nav-link\" aria-current=\"page\" href=\"Index\">&nbsp;</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"Index\">Inicio</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"Categorias?opcion=listar\">Categorias</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"Producto.do?opcion=listar\">Productos</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                      Usuarios\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                      <li class=\"nav-item dropdown\"><a class=\"dropdown-item\" href=\"#\">Perfil</a></li>\r\n");
      out.write("                      <li class=\"nav-item dropdown\"><a class=\"dropdown-item\" href=\"#\">Seguridad</a></li>\r\n");
      out.write("                      <li class=\"nav-item dropdown\"><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                      <li class=\"nav-item dropdown\"><a class=\"dropdown-item\" href=\"javascript:void(0)\" id=\"closesesion\" name=\"closesesion\" onclick=\"salir();\">Cerrar</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Reportes</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  \r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"contenido\">");
      out.write("\r\n");
      out.write("        <h1>Resgistrar productos</h1>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"pie\">\r\n");
      out.write("        &COPY; Armando Minero\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

package org.apache.jsp.Vistas_002dCategorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      Model.Usuario Usuario = null;
      synchronized (session) {
        Usuario = (Model.Usuario) _jspx_page_context.getAttribute("Usuario", PageContext.SESSION_SCOPE);
        if (Usuario == null){
          Usuario = new Model.Usuario();
          _jspx_page_context.setAttribute("Usuario", Usuario, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <link href=\"./css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("        <div class=\"container register\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 register-left\">\n");
      out.write("                    <img src=\"https://image.ibb.co/n7oTvU/logo_white.png\" alt=\"\"/>\n");
      out.write("                    <h3>Bienvenido</h3>\n");
      out.write("                    <p>Espero tenga la mejor experiencia en este Proyecto!.</p>\n");
      out.write("                    <input type=\"submit\"  name=\"\" value=\"Login\"/><br/>\n");
      out.write("                    <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"InicioSesion.jsp\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">Login</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9 register-right\">\n");
      out.write("                    <ul class=\"nav nav-tabs nav-justified\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">Employee</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" id=\"profile-tab\" data-toggle=\"tab\" href=\"#profile\" role=\"tab\" aria-controls=\"profile\" aria-selected=\"false\">Hirer</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form action=\"");
      out.print( request.getContextPath());
      out.write("/Rusuario.do\" method=\"post\" >\n");
      out.write("                        <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("                                <h3 class=\"register-heading\">Ingrese sus Datos</h3>\n");
      out.write("                                <div class=\"row register-form\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input name=\"txtNombreU\" type=\"text\" class=\"form-control\" placeholder=\"Ingrese sus Nombre\" value=\"");
      out.print( Usuario.getNombre());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input name=\"txtApellidoU\" type=\"text\" class=\"form-control\" placeholder=\"Ingrese su Apellido *\" value=\"");
      out.print( Usuario.getApellido());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input name=\"txtCorreoU\" type=\"text\" class=\"form-control\" placeholder=\"Correo\" value=\"");
      out.print( Usuario.getCorreo());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"txtUsuario\" class=\"form-control\"  placeholder=\"Usuario\" value=\"");
      out.print( Usuario.getUsuario());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" name=\"txtContra\" class=\"form-control\"  placeholder=\"Password *\" value=\"");
      out.print( Usuario.getClave());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"txtTipoU\" class=\"form-control\"  placeholder=\"Tipo\" value=\"");
      out.print( Usuario.getTipo());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input name=\"txtEstadoU\" type=\"text\" class=\"form-control\"  placeholder=\"Estado\" value=\"\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <select name=\"txtPregunta\" class=\"form-control\">\n");
      out.write("                                                <option class=\"hidden\"  selected disabled>Seleccione su pregunta de seguridad</option>\n");
      out.write("                                                <option value=\"");
      out.print( Usuario.getPregunta());
      out.write("\">¿Cuál es tu fecha de nacimiento?</option>\n");
      out.write("                                                <option value=\"");
      out.print( Usuario.getPregunta());
      out.write("\">¿Cuál es su antiguo número de teléfono?</option>\n");
      out.write("                                                <option value=\"");
      out.print( Usuario.getPregunta());
      out.write("\">¿Cual es el nombre de tu mascota?</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input name=\"txtRespuestaU\" type=\"text\" class=\"form-control\"  placeholder=\"Respuesta\" value=\"");
      out.print( Usuario.getRespuesta());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input name=\"txtFechaU\" type=\"date\" class=\"form-control\"  placeholder=\"Fecha\" value=\"");
      out.print( Usuario.getFecha());
      out.write("\" />\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <input type=\"submit\" class=\"btnRegister\"  value=\"Register\"/>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </form>>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
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

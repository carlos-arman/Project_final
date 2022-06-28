package org.apache.jsp.Vistas_002dCategorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crearProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../css/estilo.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            label{\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <h1>Registro Producto</h1>\n");
      out.write("        \n");
      out.write("            <form method=\"post\" action=\"");
      out.print( request.getContextPath());
      out.write("/Productos\">\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"Nombre\" class=\"form-label\">Nombre del producto</label>\n");
      out.write("                    <input type=\"text\" name=\"txtNom_producto\" class=\"form-control\" id=\"txtNom_producto\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"Stock\" class=\"form-label\">Stock</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"txtStock\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"Stock\" class=\"form-label\">Precio</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtPrecio\" name=\"txtPrecio\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"UnidadMedida\" class=\"form-label\">Unidad de Medida</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtUnidadMedida\" name=\"txtUnidadMedida\">\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"mb-3\">\n");
      out.write("                    <label for=\"UnidadMedida\" class=\"form-label\">Estado</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"txtEstado\" name=\"txtEstado\">\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"pie\">\r\n");
      out.write("        &COPY; Armando Minero\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("        </div>\n");
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

<%-- 
    Document   : eliminarProducto
    Created on : Jun 25, 2022, 10:14:22 PM
    Author     : Armando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ////request.getContextPath()
    String id_pro = request.getParameter("id");
    String nombre_pro = request.getParameter("nombre");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <link href="swetalert/sweetalert.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <div class="col-auto bg-gray p-5 text-center">
            <h1>Baja de Categorias</h1>

            <h4>¿Realmente Desea Eliminar el Registro?</h4>
            <h5>ID Categoria: <%= id_pro%></h5>
            <h5>Nombre Categoria: <%= nombre_pro%></h5>
        </div>

        <!---->

        <div class="d-grid gap-5 d-md-flex justify-content-md-center">
            <a href="eliminarPro.do?respuesta=yes&&id=<%= id_pro%>" class="btn btn-primary btn-lg" role="button">Si / Aceptar</a>

            <a href="Categorias?opcion=listar" class="btn btn-secondary btn-lg" role="button">No / Cancelar</a>

        </div>

        <div class="row justify-content-center">
            <div class="col-4 bg-white">
                &nbsp;
            </div>
            <div class="col-4 bg-white">
                &nbsp;
            </div>
        </div>

        <script src="swetalert/sweetalert.js" type="text/javascript"></script>
        <script src="js/funcionesUsuario.js" type="text/javascript"></script>
        <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
    </body>
</html>

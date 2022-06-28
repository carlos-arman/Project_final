<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import = "Model.Categoria" %>

<jsp:useBean id = "lista" scope="session" class="java.util.List" />
<html>
    <head>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        
        <div style="width: 600px;">
            <a href="<%= request.getContextPath()%>/Categorias?opcion=crear" class="btn btn-success btn-sm glyphicon glyphicom-pencil" role="button"> Nueva Categoria</a>
            <h3>Listado de Categorias Registradas</h3>
            <table class="table table-striped">
                <tr>
                    <th>ID</th><th>NOMBRE</th><th>ESTADO</th><th>ACCION</th>
                </tr>
                <%
                    for(int i =0 ; i < lista.size(); i++){
                        Categoria categoria = new Categoria();
                        categoria = (Categoria)lista.get(i);
                %>
                <tr>
                    <td><%= categoria.getId_categoria()%></td>
                    <td><%= categoria.getNom_categoria()%></td>
                    <td><%= categoria.getEstado_categoria()%></td>
                    <td>
                        <a href="Categorias?opcion=editar&&id=<%= categoria.getId_categoria() %>&&nombre=<%= categoria.getNom_categoria() %>&&estado=<%= categoria.getEstado_categoria() %>" class="btn btn-info btn-sm glyphicon glyphicon-edit" role="button">Editar</a>
                        <a  href="Categorias?opcion=eliminar&&id=<%= categoria.getId_categoria()%>&&nombre=<%= categoria.getNom_categoria()%>" class="btn btn-danger btn-sm glyphicon glyphicon-remove"  role="button">Eliminar</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
                <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
<%-- 
    Document   : listarProductos
    Created on : Jun 23, 2022, 9:52:49 PM
    Author     : Armando
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "Model.Producto" %>
<!DOCTYPE html>
<jsp:useBean id = "lista" scope="session" class="java.util.List" />
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Categorias</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="Index">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Categorias?opcion=listar">Ver Categorias</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%= request.getContextPath()%>/Producto.do?opcion=crear">Crear Nuevo Producto</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>
        
        <style>
            .table-center{
                margin: auto;
                color: white;
                 

            }
            h3{
                text-align: center;
                padding: 20px;
                padding-top: 100px;
            }
            body{
                background-image: url(./image/fondo6.png);
            }
            table tr{

                text-align: center;
                background-color: white;
            }
            table{
                border-spacing: 0; 
                width: 500px;
            }

        </style>
        <div class="banner">
            <div>
                
            </div>
        </div>
        <h3>Listado de Productos Registrados</h3>
        <div class="table-center" style="width: 80%; size: 20px;">

            <table class="table  table-striped">
                <tr>
                    <th>Id</th>
                    <th>Nombre producto</th>
                    <th>Stock</th>
                    <th>Precio</th>
                    <th>Unidad de medida</th>
                    <th>Estado producto</th>
                    <th>Categoria</th>
                    <th>Operaciones</th>
                </tr>
                <%
                    for (int i = 0; i < lista.size(); i++) {
                        Producto pro = new Producto();
                        pro = (Producto) lista.get(i);
                %>
                <tr>
                    <td><%= pro.getId_producto()%></td>
                    <td><%= pro.getNom_producto()%></td>
                    <td><%= pro.getStock()%></td>
                    <td><%= pro.getPrecio()%></td>
                    <td><%= pro.getUnidadMedida()%></td>
                    <td><%= pro.getEstado()%></td>
                    <td><%= pro.getCategoria_id()%></td>
                    <td>
                        <a href="Producto.do?opcion=editar&&id=<%= pro.getId_producto()%>&&nombre=<%= pro.getNom_producto()%>&&estado=<%= pro.getEstado()%>" class="btn btn-info btn-sm glyphicon glyphicon-edit" role="button">Editar</a>
                        <a  href="Producto.do?opcion=eliminar&&id=<%= pro.getId_producto()%>&&nombre=<%= pro.getNom_producto()%>" class="btn btn-danger btn-sm glyphicon glyphicon-remove"  role="button">Eliminar</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        
    </body>
</html>

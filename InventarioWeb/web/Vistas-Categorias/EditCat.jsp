<%-- 
    Document   : EditCat
    Created on : Jun 21, 2022, 10:20:49 AM
    Author     : Armando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    String id_cat = request.getParameter("id");
    String nombre_cat = request.getParameter("nombre");
    String estado_cat = request.getParameter("estado");

    /*out.print("El ID de la categoria es: " + id_cat);
    out.print("El nombre de la categoria es: " + nombre_cat);
    out.print("El estado de la categoria es: " + estado_cat);*/
%>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <link href="swetalert/sweetalert.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <div class="col-auto bg-gray p-5 text-center">
            <h1 class='text-center'>Información de Categoria</h1>
            <form action="ActualizarCategoria.do" method="post">
                <div class="mb-3 row">
                    <label for="staticEmail" class="col-sm-2 col-form-label">ID Categoria:</label>
                    <div class="col-sm-10">
                        <input type="text" value='<%= id_cat%>' name="id1" id="id1" readonly class="form-control-plaintext" id="staticEmail" placeholder="ID Categoria">
                        <input type="hidden" value='<%= id_cat%>' name="id" id="id" readonly class="form-control-plaintext" id="staticEmail" >
                    </div>
                </div>

                <div class="mb-3 row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">Nombre Categoria:</label>
                    <div class="col-sm-10">
                        <input type="text" value='<%= nombre_cat%>' name="nombre" id="nombre" class="form-control" placeholder="Nombre Categoria" required="true">
                    </div>
                </div>

                <div class="mb-3 row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">Estado Categoria:</label>
                    <div class="col-sm-10">
                        <input type="text" value='<%= estado_cat%>' name="estado" id="estado" class="form-control" placeholder="Estado Categoria" required="true">
                    </div>
                </div>

                <div class="mb-3 row">
                    <button onclick="EventoAlert()" type="submit" name="send" class="btn btn-success">Actualizar Categoria</button>
                </div>
            </form>

            <script>
                function EventoAlert() {
                    Swal.fire({
                        position: 'top-end',
                        icon: 'success',
                        title: 'Your work has been saved',
                        showConfirmButton: false,
                        timer: 1500
                    })
                }
            </script>

        </div>
        <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>

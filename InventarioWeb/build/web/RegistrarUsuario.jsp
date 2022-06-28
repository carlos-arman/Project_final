

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <body>
    <center>
        <h1> Registro de personas </h1>

        <form action="recibir_SA.do" method="POST">

            <h3 class="register-heading">Ingrese sus Datos</h3>
            <div class="row register-form">
                <div class="col-md-6">
                    <div class="form-group">
                        <input name="txtNombreU" type="text" class="form-control" placeholder="Ingrese sus Nombre" value="" />
                    </div>
                    <div class="form-group">
                        <input name="txtApellidoU" type="text" class="form-control" placeholder="Ingrese su Apellido *" value="" />
                    </div>
                    <div class="form-group">
                        <input name="txtCorreoU" type="text" class="form-control" placeholder="Correo" value="" />
                    </div>
                    <div class="form-group">
                        <input type="text" name="txtUsuario" class="form-control"  placeholder="Usuario" value="" />
                    </div>
                    <div class="form-group">
                        <input type="password" name="txtContra" class="form-control"  placeholder="Password *" value="" />
                    </div>
                    <div class="form-group">
                        <input type="text" name="txtTipoU" class="form-control"  placeholder="Tipo" value="" />
                    </div>


                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <input name="txtEstadoU" type="text" class="form-control"  placeholder="Estado" value="" />
                    </div>
                    
                    <div class="form-group">
                        <input name="txtRespuestaU" type="text" class="form-control"  placeholder="Respuesta" value="" />
                    </div>
                    <div class="form-group">
                        <input name="txtFechaU" type="date" class="form-control"  placeholder="Fecha" value="" />
                    </div>

                    <button type="submit" class="btn btn-primary"> Registrar </button>

                </div>
            </div>

        </form>
    </center>
</body>
</html>
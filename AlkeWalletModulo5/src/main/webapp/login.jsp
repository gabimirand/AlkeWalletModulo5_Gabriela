<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="css/styles.css">    
    <script src="/js/login.js"></script>
    <title>Login</title>


</head>
<body>

    <div class="container wallet">
            <h1>Inicia sesión</h1>
            <p>Ingresa a tu billetera virtual </p>
            
            
                <!-- FORMULARIO DE INICIO DE SESIÓN -->
          <form class="login-form" id="login-form" action="login" method="post">
              <div class="form-group">
                <label for="usuario">Usuario:</label>
                <input type="email" class="form-control" id="usuario" placeholder="Ingresa tu correo" required>
              </div>
              <br>
              <div class="form-group">
                <label for="contrasena">Contraseña:</label>
                <input type="password" class="form-control" id="contrasena" placeholder="Ingresa tu contraseña" required>
                <p>Tus credenciales de acceso son: gabriela@gmail.com - Contraseña:12345</p>
              </div>
              <br>
              <button type="submit" class="btn btn-primary" value="entrar" id="submit">Inicia sesión</button>              
            </form>
           </div>
   
    
   


 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>          
</body>
</html>
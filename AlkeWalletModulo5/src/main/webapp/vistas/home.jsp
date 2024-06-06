<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="model.Usuario"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="css/styles.css">    
    <title>Home</title>
</head>
<body>
    <h1>Bienvenido a la Wallet</h1>    
    <p> Accediste con el Usuario: gabriela@gmail.com</p>
    <br>
    
    
    <div>
    <%
    List<Usuario> lista = (List) request.getAttribute("usuario");
    if (lista != null && !lista.isEmpty()) {
        out.print("Hay un total de " + lista.size() + " cuenta(s) asociada(s) al usuario.");
    } else {
        out.print("No hay cuentas asociadas al usuario.");
    }
    %>
        
            <!-- FORMULARIO PARA REALIZAR DEPOSITO -->
    
    <table class="table table-striped table-hover">
        <thead class="table-light">
            <tr>
                <th>ID</th>
                <th>Nombre de Usuario</th>
                <th>Saldo</th>
            </tr>
        </thead>
        <tbody>
            <%
            if (lista != null) {
                for (Usuario usuario : lista) {
            %>
            <tr>
                <td><%= usuario.getUser_id() %></td>
                <td><%= usuario.getNombre_usuario() %></td>
                <td><%= usuario.getSaldo() %></td>
            </tr>
            <%
                }
            }
            %>
        </tbody>
    </table>
    </div>
    <br>
    
    <!-- FORMULARIO PARA REALIZAR DEPOSITO -->
     <h3>Realizar Depósito</h3> 
    <form action="deposito" method="post">
        <label for="cantidad">Cantidad a depositar:</label>
        <input type="number" id="cantidad" name="cantidad" />
        <button type="submit">Depositar</button>
    </form>
    <br>
        <!-- FORMULARIO PARA REALIZAR RETIRO -->
    <h3>Realizar Retiro</h3>
    <form action="retiro" method="post">
        <label for="cantidad">Cantidad a retirar:</label>
        <input type="number" id="cantidad" name="cantidad" />
        <button type="submit">Retirar</button>
    </form>
   
   
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>          
    
</body>
</html>

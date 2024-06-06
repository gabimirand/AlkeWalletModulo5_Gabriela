package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexionBD.ConexionBD;
import dao.DaoLogin;
import dao.DaoUsuario;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        
	        //CONEXIÓN CON BASE DE DATOS
	        ConexionBD conexionBD = new ConexionBD();
	    	Connection conexion = conexionBD.establecerConexion();
	    	
	        //OBTENCIÓN DE PARÁMETROS LOGIN
	        String usuario = request.getParameter("usuario");
	        String contrasena = request.getParameter("contrasena");
	        
	        //INSTANCIA CLASE DAOLOGIN
	        DaoLogin daoLogin = new DaoLogin(conexion);
	        
	        //AUTENTICACIÓN USUARIO Y CONTRASEÑA
	    	boolean result = daoLogin.validarLogin(usuario, contrasena);
	    	System.out.println(result);
	    	
	    	if(result) {
	    		DaoUsuario daoUsuario = new DaoUsuario(conexion);
	            request.setAttribute("usuario", daoUsuario.obtenerTodos());
	            RequestDispatcher rd = request.getRequestDispatcher("vistas/home.jsp");
	            rd.forward(request, response);
	        } else {
	            out.println("<script type=\"text/javascript\">");
	            out.println("alert('Usuario y/o clave incorrectos');");
	            out.println("location='login.jsp';");
	            out.println("</script>");
	        }
	    }


}




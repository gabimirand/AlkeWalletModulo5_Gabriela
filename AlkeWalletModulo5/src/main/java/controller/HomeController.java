package controller;

import dao.DaoUsuario;
import model.Usuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conexionBD.ConexionBD;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");  
        response.getWriter(); 
    	
        //INSTANCIA DE LA BASE DE DATOS
        ConexionBD conexionBD = new ConexionBD();
    	Connection conexion = conexionBD.establecerConexion();

    	//INSTANCIA DE CLASE DAO USUARIO
    	DaoUsuario daoUsuario = new DaoUsuario(conexion);
    	List<Usuario> listaUsuarios = daoUsuario.obtenerTodos();  //LLAMAR MÉTODO PARA OBTENER LISTA
		request.setAttribute("cuenta", daoUsuario.obtenerTodos()); 

        RequestDispatcher dispatcher = request.getRequestDispatcher("vistas/home.jsp");
        dispatcher.forward(request, response);
    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }
}

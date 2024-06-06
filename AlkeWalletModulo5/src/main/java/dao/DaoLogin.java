package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoLogin {

	private Connection conexion;

	//CONSTRUCTOR
	public DaoLogin(Connection conexion) {
		this.conexion = conexion;
	}

	//MÉTODO PARA VALIDAR LOGIN
	public boolean validarLogin(String usuario, String contrasena) {
	    String consulta = "SELECT usuario, contrasena FROM usuario WHERE usuario = ? and contrasena = ?";
	    try {
	    	PreparedStatement ps = conexion.prepareStatement(consulta);
	        ps.setString(1, usuario);
	        ps.setString(2, contrasena);
	        ResultSet rs = ps.executeQuery();
	        if (rs.next()) {
	        	return true;
	        }
	    } catch (SQLException e) { //Excepción en caso de error
	        System.err.println("Error al consultar: " + e.getMessage());
	    }
	    
		return false;
	}

}


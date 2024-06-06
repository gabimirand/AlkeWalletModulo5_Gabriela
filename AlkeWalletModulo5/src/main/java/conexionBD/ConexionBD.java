package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
	//ATRIBUTOS
    private String url = "jdbc:mysql://localhost:3306/alkewallet_gabriela";
    private String usuario = "root";
    private String pass = "";

    //MÉTODO PARA ESTABLECER CONEXIÓN CON BASE DE DATOS
	public Connection establecerConexion() {
	       try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            return DriverManager.getConnection(url, usuario, pass);
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	}
}

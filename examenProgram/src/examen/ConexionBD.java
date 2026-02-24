package examen;

import java.sql.*;

public class ConexionBD {

	private static Connection conex;
	
	public static Connection conectarConBD() {
		
		String datos [] = Programa.recogerDatos();
		
		conex = null;
		
		try {
			conex = DriverManager.getConnection(datos[0], datos[1], datos[2]);
			
		} catch (SQLException errorBD) {
			System.out.println("No se pudo conectar con la base de datos");
		}
		
		return (conex);
	}
	
	public static void cerrarConexion() {
		
		try {
			conex.close();
		} catch (SQLException errorCierreBD) {
			System.out.println("Error al cerrar la conexión con la base de datos");
		}
	}
}

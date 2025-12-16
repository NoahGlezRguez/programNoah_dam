package probandoJavaDBConnection;

import java.sql.*;

public class MainJDBCProgram {

	public static void main(String[] args) {
		
		String empleados_bd = "Select * from empleado";
		String rutaConexion_bd = "jdbc:mysql://localhost:33060/empresa_dam";
		String usuario = "root";
		String clave = "elorrieta";
		
		Connection	conexion = null;
		Statement	sentencia = null;
		ResultSet	resultados = null;
		
		//conexion
		try {
			
			conexion = DriverManager.getConnection(rutaConexion_bd, usuario, clave);
			
			sentencia = conexion.createStatement();
			
			resultados = sentencia.executeQuery(empleados_bd);
			
			//recorremos los resultados
			System.out.println("Mostrando los resultados:");
			while (resultados.next()) {
				
				System.out.printf("\t- Número del empleado: %s\n", resultados.getString("NumEmp"));
				System.out.printf("\t- Nombre del empleado: %s\n", resultados.getString("NomEmp"));
				System.out.printf("\t- Puesto del empleado: %s\n", resultados.getString("Puesto"));
				System.out.printf("\t- Nombre del empleado: %s\n", resultados.getString("NumEmpJefe"));
				System.out.printf("\t- Fecha de ingreso del empleado: %s\n", resultados.getString("FecIngreso"));
				System.out.printf("\t- Salario del empleado: %s\n", resultados.getString("Salario"));
				System.out.printf("\t- Comisión del empleado: %s\n", resultados.getString("Comision"));
				System.out.printf("\t- Nº del departamento del empleado: %s\n\n\n", resultados.getString("NumDep"));
			}
			
			
			
			
		}catch(SQLException excpsql){
			System.out.println("error, no se pudo hacer algo");
		}
		
		finally {System.out.println();}
	}

}

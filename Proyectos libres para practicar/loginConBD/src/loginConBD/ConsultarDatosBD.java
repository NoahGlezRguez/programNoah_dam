package loginConBD;

import java.io.*;
import java.sql.*;


/**
 * Esta clase tiene los métodos necesarios para consultar datos de la base de datos del cine, incluido
 * el que realiza la conexión con la base de datos, necesaria para realizar las consultas. 
 */
public class ConsultarDatosBD {

	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*
	 * conectar con la bbdd
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	
	/**
	 * Este método llama al método datos para obtener la información necesaria para
	 * realizar una conexión con la base de datos del cine. Si hubiera algún error
	 * en el proceso, lo mostrará en la terminal.
	 * @return Devuelve la conexión si se ha realizado con éxito, null en caso contrario.
	 */
	public static Connection conectarConBD() {
		Connection	conexion = null;
		String data[] = datos();
		
		try {									
			conexion = DriverManager.getConnection(data[0], data[1], data[2]);
		} catch (SQLException excpsql) {
			System.out.println("SQLException: " + excpsql.getMessage());
			System.out.println("SQLState: " + excpsql.getSQLState());
			System.out.println("VendorError: " + excpsql.getErrorCode());
		}
		return (conexion);
	}
	
	/**
	 * <p>Este método lee los datos del fichero <b>ipConfig.txt</b>
	 * y los guarda en un array de la siguiente forma:</p></br>
	 * <ol start="0">
	 * <li>jdbc:mysql://ip:puerto/DatabaseName</li>
	 * <li>user</li>
	 * <li>password</li>
	 * </ol>
	 * 
	 * Para modificar los datos se debe actualizar solo el contenido que está
	 * después de '=' en ese fichero. El formato de estos datos es esencial
	 * para que funcione, no debería contener nada más, ni un salto de línea
	 * extra. De contener algo más, no podrá realizarse la conexión.</br>
	 *  
	 * @return <b>String array </b> contiene la ruta, el usuario y la password
	 * necesarios para la conexión con la base de datos
	 */
	private static String [] datos(){
		
		String confi[] = new String[3];
		FileReader reader = null;
		BufferedReader buffer = null;
		String ruta = "src/loginConBD/ipConfig.txt";
		int cont = 0;
		
		try {
			
			reader = new FileReader(ruta);
			buffer = new BufferedReader(reader);
			String datos = "";
			
			while((datos = buffer.readLine()) != null) {				
				confi[cont] = datos.substring(datos.indexOf('=')+1);
				cont++;
			}

		}catch(FileNotFoundException e) {
			
			MostrarMsg.errores(16);
			
		} catch (IOException  e2){
			MostrarMsg.errores(17);
		}
		
		finally {			
			try {				
				buffer.close();				
			}catch(IOException e) {
				MostrarMsg.errores(17);
			}
		}
		return confi;	
	}

	/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*
	 * consulta de datos
	 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
	
	
	
	
	
	/**
	 * <b>validador con la DB</b>
	 * 
	 * @param String cadena a validar, String tipo de dato
	 *               <p>
	 *               Este método se conecta con la base de datos y valida que el
	 *               dato introducido no exista para evitar errores en los campos
	 *               "unique"
	 *               </p>
	 * @return boolean true = válido, false = inválido
	 */
	public static boolean validarExistencia(String cadena, String atributo) {

		boolean valido = false;
		Connection conexion = null;
		PreparedStatement sentencia = null;
		ResultSet result = null;
		String consulta = """
					select %s
					from cliente
					where %s = ?
				""".formatted(atributo, atributo);

		try {

			conexion = conectarConBD();
			sentencia = conexion.prepareStatement(consulta);
			
			
			sentencia.setString(1, cadena);
			
			result = sentencia.executeQuery();

			if (result.next()) {

				valido = true;
				MostrarMsg.errores(5);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (NullPointerException e2) {
			System.err.println(e2.getMessage());
		} finally {
			
			try {
				if (result != null)
					result.close();
				if (sentencia != null)
					sentencia.close();
				if (conexion != null)
					conexion.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return valido;

	}

}

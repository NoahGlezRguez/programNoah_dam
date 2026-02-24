package examen;

import java.io.*;
import java.sql.*;

public class Programa {

	public static void main (String args[]) {
		Cine cines[] = new Cine[2];
		Sala salas[] = new Sala[8];
		Pelicula pelis[] = new Pelicula[24];
		
		cines = consultarCines();
		salas = consultarSalas();
		pelis = consultarPeliculas();
		
		mostrarDatos(cines, salas, pelis);
	}
	
	public static String [] recogerDatos() {
		String ruta = null;
		String user = null;
		String pw = null;
		
		FileReader fichero = null;
		BufferedReader buffer = null;
		String linea = "inicial";
		
		String datos [] = null;
		try {
			fichero = new FileReader("src/examen/config.properties");
			buffer = new BufferedReader(fichero);
			try {
				linea = buffer.readLine();
				if (linea != null) 
					ruta = linea.substring(linea.indexOf("=") + 1);
				
				linea = buffer.readLine();
				if (linea != null)
					user = linea.substring(linea.indexOf("=") + 1);
								
				linea = buffer.readLine();
				if (linea != null)
					pw = linea.substring(linea.indexOf("=") + 1);
				
				if (ruta != null && user != null && pw != null) {
					datos = new String[3];
					datos[0] = ruta;
					datos[1] = user;
					datos[2] = pw;
				}
					
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			buffer.close();
			fichero.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (datos);
	}
	
	public static Cine[] consultarCines() {
		
		Connection conexionBD = null;
		conexionBD = ConexionBD.conectarConBD();
		
		Statement sentencia = null;
		ResultSet result = null;
		
		Cine cines[] = new Cine[2];
		
		String consulta = """
				select * from cine
				""";
		if (conexionBD != null) {
			try {
				sentencia = conexionBD.createStatement();
				result = sentencia.executeQuery(consulta);
				
				result.next();
				cines[0] = new Cine();
				cines[0].setId(result.getInt("id"));
				cines[0].setNombre(result.getString("nombre"));
				cines[0].setCiudad(result.getString("ciudad"));
				
				result.next();
				cines[1] = new Cine();
				cines[1].setId(result.getInt("id"));
				cines[1].setNombre(result.getString("nombre"));
				cines[1].setCiudad(result.getString("ciudad"));
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					result.close();
					sentencia.close();
				} catch (SQLException error) {
					System.out.println("hubo un error al cerrar variables de BD");
				}
			}
		}
		
		ConexionBD.cerrarConexion();
		return (cines);
	}
	
	public static Sala[] consultarSalas() {
		Connection conexionBD = null;
		
		conexionBD = ConexionBD.conectarConBD();
		
		Statement sentencia = null;
		ResultSet result = null;
		
		String consulta = """
				select * from sala
				""";
		
		Sala salas[] = new Sala[8];
		
		if (conexionBD != null) {
			try {
				sentencia = conexionBD.createStatement();
				result = sentencia.executeQuery(consulta);
				
				result.next();
				salas[0] = new Sala();
				salas[0].setId(result.getInt("id"));
				salas[0].setNumero(result.getInt("numero"));
				salas[0].setCapacidad(result.getInt("capacidad"));
				salas[0].setId_cine(1);
				
				result.next();
				salas[1] = new Sala();
				salas[1].setId(result.getInt("id"));
				salas[1].setNumero(result.getInt("numero"));
				salas[1].setCapacidad(result.getInt("capacidad"));
				salas[1].setId_cine(1);
				
				result.next();
				salas[2] = new Sala();
				salas[2].setId(result.getInt("id"));
				salas[2].setNumero(result.getInt("numero"));
				salas[2].setCapacidad(result.getInt("capacidad"));
				salas[2].setId_cine(1);
			
				result.next();
				salas[3] = new Sala();
				salas[3].setId(result.getInt("id"));
				salas[3].setNumero(result.getInt("numero"));
				salas[3].setCapacidad(result.getInt("capacidad"));
				salas[3].setId_cine(1);
				
				result.next();
				salas[4] = new Sala();
				salas[4].setId(result.getInt("id"));
				salas[4].setNumero(result.getInt("numero"));
				salas[4].setCapacidad(result.getInt("capacidad"));
				salas[4].setId_cine(2);
				
				result.next();
				salas[5] = new Sala();
				salas[5].setId(result.getInt("id"));
				salas[5].setNumero(result.getInt("numero"));
				salas[5].setCapacidad(result.getInt("capacidad"));
				salas[5].setId_cine(2);
				
				result.next();
				salas[6] = new Sala();
				salas[6].setId(result.getInt("id"));
				salas[6].setNumero(result.getInt("numero"));
				salas[6].setCapacidad(result.getInt("capacidad"));
				salas[6].setId_cine(2);
			
				result.next();
				salas[7] = new Sala();
				salas[7].setId(result.getInt("id"));
				salas[7].setNumero(result.getInt("numero"));
				salas[7].setCapacidad(result.getInt("capacidad"));
				salas[7].setId_cine(2);
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					result.close();
					sentencia.close();
				} catch (SQLException error) {
					System.out.println("hubo un error al cerrar variables de BD");
				}
			}
		}

		ConexionBD.cerrarConexion();
		return (salas);
	}
	
	public static Pelicula[] consultarPeliculas() {
		Connection conexionBD = null;
		
		conexionBD = ConexionBD.conectarConBD();
		
		Statement sentencia = null;
		ResultSet result = null;
		
		String consulta = """
				select * from pelicula
				""";
		Pelicula pelis[] = new Pelicula[24];
		
		if (conexionBD != null) {
			try {
				sentencia = conexionBD.createStatement();
				result = sentencia.executeQuery(consulta);
				
				for (int i = 0; i < 3; i++) {
					result.next();
					pelis[i] = new Pelicula();
					pelis[i].setId(result.getInt("id"));
					pelis[i].setTitulo(result.getString("titulo"));
					pelis[i].setDuracion(result.getInt("duracion"));
					pelis[i].setGenero(result.getString("genero"));
					pelis[i].setId_sala(result.getInt("id_sala"));
				}
				for (int i = 3; i < 6; i++) {
					result.next();
					pelis[i] = new Pelicula();
					pelis[i].setId(result.getInt("id"));
					pelis[i].setTitulo(result.getString("titulo"));
					pelis[i].setDuracion(result.getInt("duracion"));
					pelis[i].setGenero(result.getString("genero"));
					pelis[i].setId_sala(result.getInt("id_sala"));
				}
				for (int i = 6; i < 9; i++) {
					result.next();
					pelis[i] = new Pelicula();
					pelis[i].setId(result.getInt("id"));
					pelis[i].setTitulo(result.getString("titulo"));
					pelis[i].setDuracion(result.getInt("duracion"));
					pelis[i].setGenero(result.getString("genero"));
					pelis[i].setId_sala(result.getInt("id_sala"));
				}
				for (int i = 9; i < 12; i++) {
					result.next();
					pelis[i] = new Pelicula();
					pelis[i].setId(result.getInt("id"));
					pelis[i].setTitulo(result.getString("titulo"));
					pelis[i].setDuracion(result.getInt("duracion"));
					pelis[i].setGenero(result.getString("genero"));
					pelis[i].setId_sala(result.getInt("id_sala"));
				}
				for (int i = 12; i < 15; i++) {
					result.next();
					pelis[i] = new Pelicula();
					pelis[i].setId(result.getInt("id"));
					pelis[i].setTitulo(result.getString("titulo"));
					pelis[i].setDuracion(result.getInt("duracion"));
					pelis[i].setGenero(result.getString("genero"));
					pelis[i].setId_sala(result.getInt("id_sala"));
				}
				for (int i = 15; i < 18; i++) {
					result.next();
					pelis[i] = new Pelicula();
					pelis[i].setId(result.getInt("id"));
					pelis[i].setTitulo(result.getString("titulo"));
					pelis[i].setDuracion(result.getInt("duracion"));
					pelis[i].setGenero(result.getString("genero"));
					pelis[i].setId_sala(result.getInt("id_sala"));
				}
				for (int i = 18; i < 21; i++) {
					result.next();
					pelis[i] = new Pelicula();
					pelis[i].setId(result.getInt("id"));
					pelis[i].setTitulo(result.getString("titulo"));
					pelis[i].setDuracion(result.getInt("duracion"));
					pelis[i].setGenero(result.getString("genero"));
					pelis[i].setId_sala(result.getInt("id_sala"));
				}
				for (int i = 21; i < 24; i++) {
					result.next();
					pelis[i] = new Pelicula();
					pelis[i].setId(result.getInt("id"));
					pelis[i].setTitulo(result.getString("titulo"));
					pelis[i].setDuracion(result.getInt("duracion"));
					pelis[i].setGenero(result.getString("genero"));
					pelis[i].setId_sala(result.getInt("id_sala"));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					result.close();
					sentencia.close();
				} catch (SQLException error) {
					System.out.println("hubo un error al cerrar variables de BD");
				}
			}
		}
		ConexionBD.cerrarConexion();
		return (pelis);
	}
	
	public static void mostrarDatos(Cine cines[], Sala salas[], Pelicula pelis[]) {
		for (int i = 0; i < 2; i++) {
			System.out.println(cines[i].toString());
			if (i == 0) {
				for (int j = 0; j < 4; j++) {
					System.out.println(salas[j].toString());
					if (j == 0) {
						for (int k = 0; k < 3; k++) {
							System.out.println(pelis[k].toString());
						}
					}
					if (j == 1) {
						for (int k = 3; k < 6; k++) {
							System.out.println(pelis[k].toString());	
						}
					}
					if (j == 2) {
						for (int k = 6; k < 9; k++) {
							System.out.println(pelis[k].toString());
						}
					}
					if (j == 3) {
						for (int k = 9; k < 12; k++) {
							System.out.println(pelis[k].toString());
						}
					}
					System.out.println();
				}
			}
			else {
				for (int j = 4; j < 8; j++) {
					System.out.println(salas[j].toString());
					if (j == 4) {
						for (int k = 12; k < 15; k++) {
							System.out.println(pelis[k].toString());
						}
					}
					if (j == 5) {
						for (int k = 15; k < 18; k++) {
							System.out.println(pelis[k].toString());	
						}
					}
					if (j == 6) {
						for (int k = 18; k < 21; k++) {
							System.out.println(pelis[k].toString());
						}
					}
					if (j == 7) {
						for (int k = 21; k < 24; k++) {
							System.out.println(pelis[k].toString());
						}
					}
					System.out.println();
				}
			}
		}
	}
}

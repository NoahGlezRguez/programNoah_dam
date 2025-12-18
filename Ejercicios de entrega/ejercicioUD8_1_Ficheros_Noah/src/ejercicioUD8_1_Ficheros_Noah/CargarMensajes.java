package ejercicioUD8_1_Ficheros_Noah;

import java.io.*;
import java.util.Scanner;

public class CargarMensajes {

	
	
	public static Mensaje[] recuperarDatos(File ficheromsg) {
		
		Scanner lectorFichero = null;
		Mensaje mensajes[] = null;	
		int		numMsg = 0;
		
		try {
			lectorFichero = new Scanner(ficheromsg);
		} catch (FileNotFoundException error) {
			
			System.out.println("\n\t----- Error: no se pudo abrir el fichero señalado. -----\n");
		}
		
		lectorFichero.close();
		
		return(mensajes);
	}
	 
	
}

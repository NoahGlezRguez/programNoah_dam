package ejercicioUD8_1_Ficheros_Noah;

import java.io.*;

public class CargarMensajes {

	
	
	public static Mensaje[] recuperarDatos(String rutaFichero) {
		
		FileReader		lector;
		BufferedReader	bufLector;
		String			msg;
		
		Mensaje mensajes[] = null;
		int		numMensajes =  0, idx = 0;
		String	lineasFichero[];
		
		try {
			lector = new FileReader(rutaFichero);
			bufLector = new BufferedReader(lector);
			msg = bufLector.readLine();
		
			
			while (msg != null) {
				numMensajes++;
				msg = bufLector.readLine();
			}
			bufLector.close();
			lector.close();
			
		} catch (IOException error) {
			
			System.out.println("\n\t----- Error: no se pudo leer el fichero señalado. -----\n");
		}
		
		lineasFichero = new String[numMensajes];
		
			
		try {
			lector = new FileReader(rutaFichero);
			bufLector = new BufferedReader(lector);
			msg = bufLector.readLine();
		
			
			while (msg != null) {
				lineasFichero[idx] = msg;
				idx++;
				msg = bufLector.readLine();
			}
			bufLector.close();
			lector.close();
			
		} catch (IOException error) {
			
			System.out.println("\n\t----- Error: no se pudo leer el fichero señalado. -----\n");
		}
		
		if (numMensajes > 0) {
			
			mensajes = new Mensaje[numMensajes];
			mensajes = transformarLineas(lineasFichero, mensajes);
			
		}
		
		return(mensajes);
	}
	 
	private static Mensaje[] transformarLineas(String lineasFichero[], Mensaje mensajes[]) {
		
	
		String remitente = "";
		String destinatario = "";
		String fecha = "";
		String hora = "";
		String asunto = "";
		String contenido = "";
		
		String datos[] = {remitente, destinatario, fecha, hora, asunto, contenido};
		
		for (int i = 0; i < mensajes.length; i++) {
			for (int j = 0; j < lineasFichero[i].length(); j++) {
				for (int k = 0; k < datos.length; k++) {
					if(lineasFichero[i].charAt(j) == '\t') {
						j++;
						while (lineasFichero[i].charAt(j) != '\t' && lineasFichero[i].charAt(j) != '\n')
							datos[k] += lineasFichero[i].charAt(j);
					}
				}
			}
			mensajes[i] = new Mensaje(remitente, destinatario, fecha, hora, asunto, contenido);
		}
		
		return (mensajes);
	}
}

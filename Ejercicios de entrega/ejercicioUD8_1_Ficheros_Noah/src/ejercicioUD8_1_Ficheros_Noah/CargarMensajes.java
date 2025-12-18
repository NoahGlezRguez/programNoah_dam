package ejercicioUD8_1_Ficheros_Noah;

import java.io.*;

public class CargarMensajes {

	
	
	public static Mensaje[] recuperarDatos(Mensaje mensajes[], String rutaFichero) {
		
		FileReader		lector;
		BufferedReader	bufLector;
		String			msg;
		
		Mensaje msgsFichero[] = null;
		int		numMensajes =  0, idx = 0;
		String	lineasFichero[];
		Mensaje mensajesTotalesMemoria[];
		int		numTotalMsg = 0;
		
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
			
			msgsFichero = new Mensaje[numMensajes];
			msgsFichero = transformarLineas(lineasFichero, msgsFichero);	
		}
		if (mensajes == null)
			return(msgsFichero);
		
		else if (msgsFichero == null)
			return (mensajes);
		
		else {
			numTotalMsg += numMensajes;
			numTotalMsg += mensajes.length;
		}
		mensajesTotalesMemoria = new Mensaje[numTotalMsg];
		idx = 0;
		for (int i = 0; i < mensajes.length; i++) 
			mensajesTotalesMemoria[idx++] = mensajes[i];
			
		for (int i = 0; i < msgsFichero.length; i++)
				mensajesTotalesMemoria[idx++] = msgsFichero[i];
		
		return (mensajesTotalesMemoria);
	}
	 
	private static Mensaje[] transformarLineas(String lineasFichero[], Mensaje mensajes[]) {
		
		String datos[] = {"", "", "", "", "", ""};
		
		for (int i = 0; i < mensajes.length; i++) {
			for (int j = 0; j < lineasFichero[i].length(); j++) {
				for (int k = 0; k < datos.length; k++) {
					if(lineasFichero[i].charAt(j) == '\t') {
						j++;
						while (j < lineasFichero[i].length() && lineasFichero[i].charAt(j) != '\t' && lineasFichero[i].charAt(j) != '\n') {
							datos[k] += lineasFichero[i].charAt(j);
							j++;
						}
					}
				}
			}
			mensajes[i] = new Mensaje(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
			for ( int j = 0; j < datos.length; j++)
				datos[j] = "";
		}
		
		return (mensajes);
	}
}

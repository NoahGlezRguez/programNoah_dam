package ejercicioUD8_1_Ficheros_Noah;

import java.io.*;

public class GuardarMensajes {

	public static void guardarEnFichero(Mensaje mensajes[], String rutaFichero) {
		
		FileWriter writer = null;
		
		try {
			
			writer = new FileWriter(rutaFichero, false);
			
			for (int i = 0; i < mensajes.length; i++) {
				
				writer.write("\t");
				writer.write(mensajes[i].getRemitente());
				writer.write("\t");
				writer.write(mensajes[i].getDestinatario());
				writer.write("\t");
				writer.write(mensajes[i].getFecha());
				writer.write("\t");
				writer.write(mensajes[i].getHora());
				writer.write("\t");
				writer.write(mensajes[i].getAsunto());
				writer.write("\t");
				writer.write(mensajes[i].getContenido());
				writer.write("\n");
			}
			writer.close();
			
		} catch (IOException error) {
			System.out.println("\n\t----- Error: no se pudo escribir en el archivo señalado. -----\n");
		}
	}
}

package ejercicioUD8_1_Ficheros_Noah;

import java.io.*;

/**
 * Contiene el método necesario para volcar el array que hay en memoria con los mensajes en un fichero seleccionado.
 */
public class GuardarMensajes {

	/**
	 * Vuelca el array que hay en memoria con los mensajes, que recibe por parámetro, en un fichero seleccionado cuya ruta
	 * recibe por parámetro..
	 * 
	 * @param mensajes - array de mensajes
	 * @param rutaFichero - ruta del fichero donde se debe volcar todos los mensajes con un formato concreto
	 */
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

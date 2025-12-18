package ejercicioUD8_1_Ficheros_Noah;

/**
 * Esta clase gestiona los métodos necesarios para añadir un mensaje. Analiza si había mensajes cargados o no.
 * Luego solicita al usuario que ingrese los valores del nuevo mensaje que se desea añadir.
 */
public class NuevoMensaje {

	/**
	 * Recibe por parámetros un array de objetos Mensaje y añade uno nuevo tras pedir los datos
	 * al usuario a través del teclado. Si el array estuviera vacío (es null) se crea uno de un
	 * solo item. En caso de que ya tuviera items, se crea un array con un espacio más, se copian
	 * los valores que tenía el original, se añade el nuevo mensaje en la última posición, y se
	 * pregunta al usuario para que decida si quiere añadirlo o desea cancelar la operación.
	 * Si desea añadir, se devuelve el array actualizado, en caso contrario se devuelve el
	 * original.
	 * 
	 * @param mensajes - array con los mensajes (o null si no tiene)
	 * @return array original si ha cancelado, array nuevo con datos actualizados en caso contrario
	 */
	public static Mensaje[] añadirMensaje(Mensaje mensajes[]) {
		
		Mensaje mensajesActualizados[] = null;
		int		añadir;
		
		if (mensajes == null) {
			mensajesActualizados = new Mensaje[1];
			mensajesActualizados[0] = new Mensaje();
			mensajesActualizados[0] = pedirMensaje();
		}
		else {
			mensajesActualizados = new Mensaje[mensajes.length + 1];
			copiarMensajes(mensajes, mensajesActualizados);
			mensajesActualizados[mensajes.length] = new Mensaje();
			mensajesActualizados[mensajes.length] = pedirMensaje();
		}
		añadir = MetodAux.menuOpciones("¿Desea añadir definitivamente este nuevo mensaje?", null, "Selecciona tu respuesta");
		if (añadir == 0) {
			System.out.println("\n\tAñadiendo mensaje...\n");
			return(mensajesActualizados);
		}
		else {
			System.out.println("\n\tCancelando operación...\n");
			return(mensajes);
		}	
	}
	
	/**
	 * 
	 * 
	 * @param mensajes
	 * @param mensajesActualizados
	 */
	public static void copiarMensajes(Mensaje mensajes[], Mensaje mensajesActualizados[]) {
		
		for (int i = 0; i < mensajes.length; i++) {
			mensajesActualizados[i] = new Mensaje();
			mensajesActualizados[i] = mensajes[i];
		}
	}
		
	/**
	 * 
	 * @param mensajeNuevo
	 */
	public static Mensaje pedirMensaje() {
		
		Mensaje msg = new Mensaje();
		pedirDato(0);
		msg.setRemitente(MainFicheros.teclado.nextLine().trim());
		pedirDato(1);
		msg.setDestinatario(MainFicheros.teclado.nextLine().trim());
		pedirDato(2);
		msg.setFecha(MainFicheros.teclado.nextLine().trim());
		pedirDato(3);
		msg.setHora(MainFicheros.teclado.nextLine().trim());
		pedirDato(4);
		msg.setAsunto(MainFicheros.teclado.nextLine().trim());
		pedirDato(5);
		msg.setContenido(MainFicheros.teclado.nextLine().trim());

		return (msg);
	}
	
	/**
	 * 
	 * @param indice
	 */
	public static void pedirDato(int indice) {
		
		String datos[] = {"remitente", "destinatario", "fecha", "hora", "asunto", "contenido"};		
		
		System.out.printf("\n\t- Ingrese %s: ", datos[indice]);
	}
}

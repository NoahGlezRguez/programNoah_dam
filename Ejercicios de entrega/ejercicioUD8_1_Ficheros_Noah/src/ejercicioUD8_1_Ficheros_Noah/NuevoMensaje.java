package ejercicioUD8_1_Ficheros_Noah;

/**
 * Esta clase gestiona los métodos necesarios para añadir un mensaje. Analiza si había mensajes cargados o no.
 * Luego solicita al usuario que ingrese los valores del nuevo mensaje que se desea añadir.
 */
public class NuevoMensaje {

	/**
	 * 
	 * @param mensajes
	 * @return
	 */
	public static Mensaje[] añadirMensaje(Mensaje mensajes[]) {
		
		Mensaje mensajesActualizados[] = null;
		int		añadir;
		
		if (mensajes == null) {
			mensajes = new Mensaje[1];
			mensajes[0] = new Mensaje();
			pedirMensaje(mensajes[0]);
		}
		else {
			mensajesActualizados = new Mensaje[mensajes.length + 1];
			copiarMensajes(mensajes, mensajesActualizados);
			mensajesActualizados[mensajes.length] = new Mensaje();
			pedirMensaje(mensajesActualizados[mensajes.length]);
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
	public static void pedirMensaje(Mensaje mensajeNuevo) {
		
		pedirDato(0);
		mensajeNuevo.setRemitente(MainFicheros.teclado.nextLine().trim());
		pedirDato(1);
		mensajeNuevo.setDestinatario(MainFicheros.teclado.nextLine().trim());
		pedirDato(2);
		mensajeNuevo.setFecha(MainFicheros.teclado.nextLine().trim());
		pedirDato(3);
		mensajeNuevo.setHora(MainFicheros.teclado.nextLine().trim());
		pedirDato(4);
		mensajeNuevo.setAsunto(MainFicheros.teclado.nextLine().trim());
		pedirDato(5);
		mensajeNuevo.setContenido(MainFicheros.teclado.nextLine().trim());

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

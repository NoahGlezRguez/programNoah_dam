package ejercicioUD8_1_Ficheros_Noah;

public class NuevoMensaje {

	public static void añadirMensaje(Mensaje mensajes[]) {
		
		Mensaje mensajesActualizados[] = null;
		
		if (mensajes == null) {
			mensajes = new Mensaje[1];
			pedirMensaje(mensajes[0]);
		}
		else {
			mensajesActualizados = new Mensaje[mensajes.length + 1];
			copiarMensajes(mensajes, mensajesActualizados);
			mensajesActualizados[mensajes.length] = new Mensaje();
			pedirMensaje(mensajesActualizados[mensajes.length]);
		}
	}
	
	public static void copiarMensajes(Mensaje mensajes[], Mensaje mensajesActualizados[]) {
		
		for (int i = 0; i < mensajes.length; i++) {
			mensajesActualizados[i] = new Mensaje();
			mensajesActualizados[i] = mensajes[i];
		}

	}
			
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
	

	public static void pedirDato(int indice) {
		
		String datos[] = {"remitente", "destinatario", "fecha", "hora", "asunto", "contenido"};		
		
		System.out.printf("\n\t- Ingrese %-15s: ", datos[indice]);
	}
}

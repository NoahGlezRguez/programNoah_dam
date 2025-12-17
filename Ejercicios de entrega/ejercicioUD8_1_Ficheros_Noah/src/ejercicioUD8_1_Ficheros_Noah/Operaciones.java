package ejercicioUD8_1_Ficheros_Noah;

public class Operaciones {

	
	public static Mensaje pedirMensaje(Mensaje mensajeNuevo) {
		
		
		mensajeNuevo.setRemitente(pedirDato(0));
		mensajeNuevo.destinatario = pedirDato(1);
		mensajeNuevo.fecha = pedirDato(2);
		mensajeNuevo.hora = pedirDato(3);
		mensajeNuevo.asunto = pedirDato(4);
		mensajeNuevo.contenido = pedirDato(5);
		
		return (mensajeNuevo);
	}
	

	public static String pedirDato(int dato) {
		
		String datos[] = {"remitente", "destinatario", "fecha", "hora", "asunto", "contenido"};		
		
		/*Mensaje.remitente = pedirDato("remitente");
		Mensaje.destinatario = pedirDato("destinatario");
		Mensaje.fecha = pedirDato("fecha");
		Mensaje.hora = pedirDato("hora");
		Mensaje.asunto = pedirDato("asunto");
		Mensaje.contenido = pedirDato("contenido");*/
		return ("");
	}
}

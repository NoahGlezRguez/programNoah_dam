package ejercicioUD8_1_Ficheros_Noah;

public class Mensaje {

	private static String	remitente = null;
	private static String	destinatario = null;
	private static String	fecha = null;
	private static String	hora = null;
	private static String	asunto = null;
	private static String	contenido = null;
	
	
	public Mensaje() {
		
	}
		
	public static String getRemitente() {
		return remitente;
	}


	public static void setRemitente(String remitente) {
		Mensaje.remitente = remitente;
	}


	public static String getDestinatario() {
		return destinatario;
	}


	public static void setDestinatario(String destinatario) {
		Mensaje.destinatario = destinatario;
	}


	public static String getFecha() {
		return fecha;
	}


	public static void setFecha(String fecha) {
		Mensaje.fecha = fecha;
	}


	public static String getHora() {
		return hora;
	}


	public static void setHora(String hora) {
		Mensaje.hora = hora;
	}


	public static String getAsunto() {
		return asunto;
	}


	public static void setAsunto(String asunto) {
		Mensaje.asunto = asunto;
	}


	public static String getContenido() {
		return contenido;
	}


	public static void setContenido(String contenido) {
		Mensaje.contenido = contenido;
	}

}

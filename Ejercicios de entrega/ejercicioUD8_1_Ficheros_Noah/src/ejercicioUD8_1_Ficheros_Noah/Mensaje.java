package ejercicioUD8_1_Ficheros_Noah;

/**
 * Para crear objetos Mensaje, con atributos y métodos para gestionar la información que contiene.
 */
public class Mensaje {

	private String	remitente = null;
	private String	destinatario = null;
	private String	fecha = null;
	private String	hora = null;
	private String	asunto = null;
	private String	contenido = null;
	
	
	public Mensaje(String	remitente, String destinatario, String fecha, String hora, String asunto, String contenido) {
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.fecha = fecha; 
		this.hora = hora;
		this.asunto = asunto;
		this.contenido = contenido;
	}
	
	public Mensaje() {
		
	}
	public void imprimirMensaje() {
		System.out.printf("%15s%15s%20s%10s%40s\t%40s\n", remitente, destinatario, fecha, hora, asunto, contenido);
	}
	
	public String getRemitente() {
		return remitente;
	}


	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}


	public String getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getAsunto() {
		return asunto;
	}


	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}

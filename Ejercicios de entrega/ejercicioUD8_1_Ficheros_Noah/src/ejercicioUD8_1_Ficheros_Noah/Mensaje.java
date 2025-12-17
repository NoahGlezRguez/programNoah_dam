package ejercicioUD8_1_Ficheros_Noah;

public class Mensaje {

	private String	remitente = null;
	private String	destinatario = null;
	private String	fecha = null;
	private String	hora = null;
	private String	asunto = null;
	private String	contenido = null;
	
	
	public Mensaje() {
		
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

package ejercicio;

public class Multimedia {
	String titulo;
	String autor;
	Formato formato;
	int duracion;
	
	
	public Multimedia() {
		
	}
	
	private enum Formato{
		WAV,
		MP3,
		MIDI,
		AVI,
		MOV,
		MPG,
		CDAUDIO,
		DVD
	}
	
}

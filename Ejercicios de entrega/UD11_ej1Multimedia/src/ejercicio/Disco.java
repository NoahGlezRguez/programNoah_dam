package ejercicio;

public class Disco extends Multimedia {
	
	Genero genero;
	
	public Disco(String titulo, String autor, Genero genero, Formato formato, int duracion) {
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		
		String info = super.toString().concat("Genero del disco = ".concat(String.valueOf(genero)));
		
		return (info);
	}

	
	
}

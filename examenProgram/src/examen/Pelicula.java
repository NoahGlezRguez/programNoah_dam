package examen;

public class Pelicula {

	int		id;
	String	titulo;
	int		duracion;
	String	genero;
	int		id_sala;
	
	public Pelicula() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getId_sala() {
		return id_sala;
	}

	public void setId_sala(int id_sala) {
		this.id_sala = id_sala;
	}

	@Override
	public String toString() {
		return String.format("\t\t- Película %s: '%s', %s minutos, genero %s, id_sala %s", id, titulo, duracion,
				genero, id_sala);
	}
	
	
}

package ejercicio;

public class Multimedia {
	String titulo;
	String autor;
	Formato formato;
	int duracion;
	
	public Multimedia(String titulo, String autor, Formato formato, int duracion) {
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}


	/*****************************************************************************************************/
	/*			(～￣▽￣)～			|	GETTERS Y SETTERS	|			～(￣▽￣～)						 */
	/*								v						v											 */
	/*****************************************************************************************************/
	
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	/*****************************************************************************************************/
	/*							^	FIN	GETTERS Y SETTERS	^	(❁´◡`❁)									 */
	/*							|							|											 */
	/*****************************************************************************************************/

	@Override
	public String toString() {
		return String.format("Multimedia: titulo = %s, autor = %s, formato = %s, duracion = %s.\n", titulo, autor, formato,
				duracion);
	}

	@Override
	public boolean equals(Object elOtro) {
		
		boolean resultado = false;
		
		if (this == elOtro) {
			resultado = true;
		}
		else if (elOtro == null) {
			resultado = false;
		}
		else if (getClass() != elOtro.getClass()) {
			resultado = false;
		}
		else {
			Multimedia other = (Multimedia) elOtro;
			resultado = ((this.titulo.equals(other.getTitulo())) && (this.autor.equals(other.getAutor())));
		}
		
		return (resultado);
	}
}

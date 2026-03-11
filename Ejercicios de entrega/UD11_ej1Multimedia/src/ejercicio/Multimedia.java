package ejercicio;

import java.util.Objects;

public class Multimedia {
	String titulo;
	String autor;
	Formato formato;
	int duracion;
	
	
	public Multimedia() {
		
	}


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


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Formato getFormato() {
		return formato;
	}


	public void setFormato(Formato formato) {
		this.formato = formato;
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
		return String.format("Multimedia [titulo = %s, autor = %s, formato = %s, duracion = %s]", titulo, autor, formato,
				duracion);
	}


	@Override
	public int hashCode() {
		return Objects.hash(autor, titulo);
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

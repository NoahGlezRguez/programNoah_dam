package ejercicio;

public class ListaMultimedia {

	private Multimedia[] lista;
	private int contador;
	
	public ListaMultimedia() {
		
	}


	public ListaMultimedia(int numero) {
		
		lista = new Multimedia[numero];
		contador = 0;
		
	}
	
	/**
	 * Devuelve la cantidad de objetos Multimedia que existen dentro de la lista
	 * @return int 
	 */
	public int size() {
		return (contador);
	}
	
	public boolean add(Multimedia objeto) {
		boolean hayEspacio = false;
		
		if (contador < lista.length) {
			hayEspacio = true;
			lista[contador++] = objeto;
		}
		
		return (hayEspacio);
	}
	
	public Multimedia localizarObj(int indice) {

		Multimedia objetoIndicado = null;
		
		if (indice >= 0 || indice < contador) {
			objetoIndicado = lista[indice];
		}
		
		return (objetoIndicado);
	}
}


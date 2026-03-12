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
	
	public boolean add(Multimedia m) {
		boolean hayEspacio = false;
		
		if (contador < lista.length) {
			hayEspacio = true;
			lista[contador++] = m;
		}
		
		return (hayEspacio);
	}
	
	public Multimedia localizarObj(int position) {

		Multimedia objetoIndicado = null;
		
		if (position >= 0 || position < contador) {
			objetoIndicado = lista[position];
		}
		
		return (objetoIndicado);
	}

	@Override
	public String toString() {
		
		String info = "";
		
		for (int i = 0; i < contador; i++) {
			info += lista[i].toString();
		}
		
		return (info);
	}
	
	
}


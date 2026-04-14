package pojo;

import java.util.ArrayList;
import java.util.Iterator;

public class CListaTfnos {
	
	private ArrayList<CPersona> listaPersonas;
	
	public CListaTfnos() {
		listaPersonas = new ArrayList<>(100);
	}
	
	/**
	 * Agrega una nueva persona a la lista de personas 
	 * @param objeto - es la persona agregada
	 */
	public void anadir(CPersona objeto) {
		listaPersonas.add(objeto);
	}
	
	/**
	 * Busca la persona a la que corresponde el tfno recibido y elimina a dicha persona
	 * de la agenda
	 * @param tel - telefono por el cual se busca a la persona
	 * @return true si se ha eliminado, false en caso contrario
	 */
	public boolean eliminar(String tel) {
		
		boolean borrado = false;
		Iterator<CPersona> itePersona = listaPersonas.iterator();
		
		while (itePersona.hasNext() && !borrado) {
			if (itePersona.next().getTelefono().equals(tel)) {
				itePersona.remove();
				borrado = true;
			}
		}
		
		return (borrado);
	}
	
	/**
	 * Se busca el indice que corresponde a una persona de la agenda, en caso de que este.<br>
	 * @param nombre - nombre por el que se busca a la persona de la agenda
	 * @return -1 si no lo encuentra, o el indice en caso de encontrarlo
	 */
	public int buscar(String nombre) {
		
		int idx = -1;
		CPersona persona;
		Iterator<CPersona> itePersona = listaPersonas.iterator();
		
		while (itePersona.hasNext() && idx == -1) {
			persona = itePersona.next();
			
			if (persona.getNombre().equals(nombre)) {
				idx = listaPersonas.indexOf(persona);
			}
		}
		
		return (idx);
	}
	
	/**
	 * Devuelve los datos de la agenda de la posicion indicada. Si está fuera de los límites <br>
	 * mostrará un error y devolverá null.
	 * @param i - indice que se desea consultar
	 * @return - registro de la persona o null en caso de error
	 */
	public CPersona registro(int i) {
		CPersona persona = null;
		
		if (listaPersonas.isEmpty() && i < listaPersonas.size()) {
			persona = listaPersonas.get(i);
		}
		else {
			System.err.println("Error: fuera de los límites.");
		}
		
		return (persona);
	}
	
	/**
	 * Indica el tamaño de la agenda.
	 * @return nº de personas que hay actualmente en la agenda de tfnos
	 */
	public int longitud() {
		return(listaPersonas.size());
	}
	
	/**
	 * Muestra por pantalla los datos de las personas que hay en la agenda.<br>
	 * Si no hubiera personas en la agenda, lo indica por pantalla.
	 */
	public void mostrarLista() {
		Iterator<CPersona> itePersona = listaPersonas.iterator();
		
		if (!listaPersonas.isEmpty()) {
			while (itePersona.hasNext()) {
				System.out.println(itePersona.next().toString());
			}
		}
		else {
			System.err.println("La agenda no tiene contactos ahora mismo.");
		}
	}
	
}

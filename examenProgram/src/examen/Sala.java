package examen;

public class Sala {
	int id;
	int numero;
	int capacidad;
	int id_cine;
	
	public Sala() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getId_cine() {
		return id_cine;
	}

	public void setId_cine(int id_cine) {
		this.id_cine = id_cine;
	}

	@Override
	public String toString() {
		return String.format("\t- Sala %s: nº %s, capacidad %s personas, id_cine %s", id, numero, capacidad, id_cine);
	}
	
	
}

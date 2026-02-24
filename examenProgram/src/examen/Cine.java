package examen;

public class Cine {
	int 	id;
	String 	nombre;
	String 	ciudad;
	
	public Cine(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return String.format("Cine nº %s: %s, localizado en %s", id, nombre, ciudad);
	}
	
	
}

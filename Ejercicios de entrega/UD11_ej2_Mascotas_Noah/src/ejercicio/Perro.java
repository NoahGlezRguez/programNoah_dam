package ejercicio;

import java.util.Date;

public class Perro extends Mascota {

	private String raza;
	private boolean pulgas;	
	
	public Perro(String nombre, int edad, boolean estado, Date fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}
	
	@Override
	public void muestra() {
		
	}

	@Override
	public void habla() {
		
	}
	
	@Override
	public String toString() {
		String pulgas;
		
		if (this.pulgas) {
			pulgas = "sí";
		}
		else {
			pulgas = "no";
		}
		return String.format("Raza: %s\nPulgas: %s\n", raza, pulgas);
	}
	
	
	
}

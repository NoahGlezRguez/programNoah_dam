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
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public boolean isPulgas() {
		return pulgas;
	}
	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}
	@Override
	public void muestra() {
		
	}

	@Override
	public void habla() {
		
	}
	
	
}

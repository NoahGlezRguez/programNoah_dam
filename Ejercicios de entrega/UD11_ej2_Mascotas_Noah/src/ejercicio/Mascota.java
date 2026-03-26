package ejercicio;

import java.util.Date;

public abstract class Mascota {
	private String nombre;
	private int edad;
	private boolean estado;
	private Date fechaNacimiento;
	
	public Mascota(String nombre, int edad, boolean estado, Date fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public abstract void muestra();
	
	public void cumpleanios() {
		
	}
	
	public void morir() {
		estado = false;
	}
	
	public abstract void habla();
	


	@Override
	public String toString() {
		
		String estado;
		
		if (this.estado) {
			estado = "vivo";
		}
		else {
			estado = "muerto";
		}
		
		return String.format("Nombre: %s\nEdad: %s\n Estado: %s\nFecha de nacimiento: %s\n",
				nombre, edad, estado,fechaNacimiento);
	}

}

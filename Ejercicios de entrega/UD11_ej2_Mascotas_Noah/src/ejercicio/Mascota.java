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
		
	}
	
	public abstract void habla();
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}

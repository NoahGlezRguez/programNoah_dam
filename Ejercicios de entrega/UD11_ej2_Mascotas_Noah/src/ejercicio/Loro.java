package ejercicio;

import java.util.Date;

public class Loro extends Ave{

	private String origen;
	private boolean habla;
	
	public Loro(String nombre, int edad, boolean estado, Date fechaNacimiento, String pico, boolean vuela,
			String origen, boolean habla) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}
	
	@Override
	public void volar() {
		
	}
	@Override
	public void muestra() {
		
	}
	@Override
	public void habla() {
		
	}
	
	public void saluda() {
		
	}
	@Override
	public String toString() {
		
		String habla;
		
		if (this.habla) {
			habla = "sí";
		}
		else {
			habla = "no";
		}
		return String.format("Origen: %s\nHabla: %s\n", origen, habla);
	}
	
	
}

package ejercicio;

import java.util.Date;

public class Canario extends Ave {
	private String color;
	private boolean canta;
		
	public Canario(String nombre, int edad, boolean estado, Date fechaNacimiento, String pico, boolean vuela,
			String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
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
	@Override
	public String toString() {
		
		String canta;
		
		if (this.canta) {
			canta = "sí";
		}
		else {
			canta = "no";
		}
		
		return String.format("Color: %s\nCanta: %s\n", color, canta);
	}
	
	
}

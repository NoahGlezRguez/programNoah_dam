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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isCanta() {
		return canta;
	}
	public void setCanta(boolean canta) {
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
	
	
}

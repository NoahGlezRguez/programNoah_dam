package ejercicio;

import java.util.Date;

public class Gato extends Mascota {

	private String color;
	private boolean peloLargo;

	public Gato(String nombre, int edad, boolean estado, Date fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPeloLargo() {
		return peloLargo;
	}
	
	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}
	@Override
	public void muestra() {
		
	}

	@Override
	public void habla() {
		
	}
	
	
}

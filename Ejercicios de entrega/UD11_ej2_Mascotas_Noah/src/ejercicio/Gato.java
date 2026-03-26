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

	@Override
	public void muestra() {
		
	}

	@Override
	public void habla() {
		
	}

	@Override
	public String toString() {
		
		String peloLargo;
		
		if (this.peloLargo) {
			peloLargo = "sí";
		}
		else {
			peloLargo = "no";
		}
		
		return String.format("Color: %s\nPelo largo: %s\n", color, peloLargo);
	}
	
	
}

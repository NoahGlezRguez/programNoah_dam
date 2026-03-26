package ejercicio;

import java.util.Date;

public abstract class Ave extends Mascota{

	private String pico;
	private boolean vuela;
	
	public Ave(String nombre, int edad, boolean estado, Date fechaNacimiento, String pico, boolean vuela) {
		super(nombre, edad, estado, fechaNacimiento);
		this.pico = pico;
		this.vuela = vuela;
		
	}

	public String getPico() {
		return pico;
	}

	public void setPico(String pico) {
		this.pico = pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	public abstract void volar();
}

package ejercicio;

public abstract class Ave extends Mascota{

	private String pico;
	private boolean vuela;
	
	public Ave(String nombre, int edad, boolean estado, String fechaNacimiento, String pico, boolean vuela) {
		super(nombre, edad, estado, fechaNacimiento);
		this.pico = pico;
		this.vuela = vuela;
		
	}

	@Override
	public String toString() {
		
		String vuela;
		
		if (this.vuela) {
			vuela = "sí";
		}
		else {
			vuela = "no";
		}
		
		return String.format(super.toString() + "\t- Pico: %s\n\t- Vuela: %s\n", pico, vuela);
	}

	public abstract void volar();
}

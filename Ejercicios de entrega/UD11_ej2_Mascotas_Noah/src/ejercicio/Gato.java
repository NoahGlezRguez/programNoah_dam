package ejercicio;

public class Gato extends Mascota {

	private String color;
	private boolean peloLargo;

	public Gato(String nombre, int edad, boolean estado, String fechaNacimiento, String color, boolean peloLargo) {
		super(nombre, edad, estado, fechaNacimiento);
		this.color = color;
		this.peloLargo = peloLargo;
	}

	@Override
	public void muestra() {
		System.out.println(toString());
	}

	@Override
	public void habla() {
		System.out.println("Grrrrmiaw, miaaaaaw");
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
		
		return ("Gato:\n" + super.toString() + String.format("\t- Color: %s\n\t- Pelo largo: %s\n", color, peloLargo));
	}
	
	
}

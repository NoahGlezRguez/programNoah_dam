package ejercicio;

public class Canario extends Ave {
	private String color;
	private boolean canta;
		
	public Canario(String nombre, int edad, boolean estado, String fechaNacimiento, String pico, boolean vuela,
			String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.color = color;
		this.canta = canta;
	}
	
	@Override
	public void volar() {
		System.out.println("...frrrrrr... frrrrrrrr..frr frrr.... *vuela*");
	}
	
	@Override
	public void muestra() {
		System.out.println(toString());
	}
	
	@Override
	public void habla() {
		System.out.println("fiufiiiiiiiiiii... fiufiiiiiiii... fiufiufiufiiiiii");
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
		
		return ("Canario:\n" + super.toString() + String.format("\t- Color: %s\n\t- Canta: %s\n", color, canta));
	}
	
	
}

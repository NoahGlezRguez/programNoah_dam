package ejercicio;

public class Loro extends Ave{

	private String origen;
	private boolean habla;
	
	public Loro(String nombre, int edad, boolean estado, String fechaNacimiento, String pico, boolean vuela,
			String origen, boolean habla) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}
	
	@Override
	public void volar() {
		System.out.println("...fffffiiiiiuuu....ffffiufffiufffffiuuuuu... *vuela*");
	}
	@Override
	public void muestra() {
		System.out.println(toString());
	}
	@Override
	public void habla() {
		System.out.println("aaaah dame esa galletaaaa");
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
		return ("Loro:\n" + super.toString() + String.format("\t- Origen: %s\n\t- Habla: %s\n", origen, habla));
	}
	
	
}

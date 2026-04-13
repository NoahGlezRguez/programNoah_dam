package parlanchin_Noah;

public class Perro extends Animal  implements Parlanchin{

	private String raza;
	private boolean pulgas;	
	
	public Perro() {
		
	}
	
	public Perro(String nombre, int edad, boolean estado, String fechaNacimiento, String raza, boolean pulgas) {
		super(nombre, edad, estado, fechaNacimiento);
		this.raza = raza;
		this.pulgas = pulgas;
	}
	
	@Override
	public void muestra() {
		System.out.println(toString());
	}

	@Override
	public void habla() {
		System.out.println("Wuf, wuf!");
	}
	
	@Override
	public String toString() {
		String pulgas;
		
		if (this.pulgas) {
			pulgas = "sí";
		}
		else {
			pulgas = "no";
		}
		return ("Perro:\n" + super.toString() + String.format("\t- Raza: %s\n\t- Pulgas: %s\n", raza, pulgas));
	}
	
	
	
}

package ejercicio;

public class Griego extends Guerrero {

	public Griego(String nombre, int edad, int fuerza) {
		super(nombre, edad, fuerza);
		
	}

	public Griego() {
		super("GriegoX", 20, 8);
	}
	
	@Override
	public boolean retirarse() {
		
		System.out.print(toString() + "RETIRADA");	

		return false;
	}

	@Override
	public String toString() {

		String datos = String.format("Griego: %s\nEdad:%s   Fuerza:%s\n", getNombre(),
				getEdad(), getFuerza());
		
		if (super.isHerido()) {
			datos += "Está herido ⇾ ";
		}
		else {
			datos += "No está herido ⇾ ";
		}
		
		return (datos);
	}
	
}

package ejercicio;

public class Troyano extends Guerrero{

	public Troyano(String nombre, int edad, int fuerza) {
		super(nombre, edad, fuerza);
	}
	
	public Troyano() {
		super("TroyanoX", 18, 10);
	}
	
	@Override
	public boolean retirarse() {
		
		System.out.print(toString() + "Los Guerreros Troyanos NUNCA se retiran!!!");	

		return false;
	}

	@Override
	public String toString() {

		String datos = String.format("Troyano: %s\nEdad:%s   Fuerza:%s\n", getNombre(),
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

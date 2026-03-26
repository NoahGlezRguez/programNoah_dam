package ejercicio;

public class Caballo {
	
	private int capacidad;
	private int ocupacion;
	private Guerrero[] ocupantes;
	

	public Caballo(int capacidad) {
		
		this.capacidad = capacidad;
		ocupantes = new Guerrero[capacidad];
	}
	
	public int buscar(String nombre) {
		
		int lugar = -1;
		
		for (int i = 0; i < ocupantes.length; i++) {
			if (ocupantes[i] != null) {
				if (nombre.equals(ocupantes[i].getNombre())) {
					lugar = i;
				}
			}
		}
		
		return (lugar);
	}
	
	public void mostrarGuerrero(int pos) {
		
		if (pos >= 0 && pos < ocupantes.length) {
			if (ocupantes[pos] != null) {
				ocupantes[pos].toString();				
			}
		}
		else {
			System.out.println("No es posible mostrar datos de ningún guerrero en la posición indicada\n");
		}
	}
	
	public void montarseEnCaballo(Guerrero guerrero) {
		
		boolean montadito = false;
		
		if (guerrero instanceof Troyano) {
			System.out.println("Guerrero Troyano " + guerrero.getNombre() + " intentando acceder al caballo!!!\n");
			guerrero.setMuerto(true);
		}
		else {
			if (ocupacion < capacidad) {
				System.out.println("Guerrero Griego " + guerrero.getNombre() + " montado en caballo\n");
				for (int i = 0; i < ocupantes.length; i++) {
					if (ocupantes[i] == null && !montadito) {
						ocupantes[i] = guerrero;
						montadito = true;
					}
				}
				ocupacion++;
			}
			else {
				System.out.println("Capacidad del caballo completa!\n");
			}
		}
	}
	
	public void mostrarCaballo() {
		
		System.out.println("""
				#####################################################################
				Capacidad del caballo:
				%d
				
				Ocupación actual:
				%d
				
				Listado de ocupantes actual:
				""".formatted(capacidad, ocupacion));
		for (int i = 0; i < ocupantes.length; i++) {
			if (ocupantes[i] != null) {
				System.out.println(ocupantes[i].toString() + "\n");
			}
		}
		System.out.println("#####################################################################\n");
	}
}

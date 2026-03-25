package ejercicio;

public abstract class Guerrero {

	private String nombre;
	private int edad;
	private int fuerza;
	private boolean herido;
	private boolean muerto;
	
	public Guerrero(String nombre, int edad, int fuerza) {
		
		if (edad < 0) {
			edad = 25;
		}
		else if (fuerza < 0) {
			fuerza = 5;
		}
		else if (nombre == null) {
			nombre = "Anónimo";
		}
		
		this.nombre = nombre;
		this.edad = edad;
		this.fuerza = fuerza;
		herido = false;
		muerto = false;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public boolean isHerido() {
		return herido;
	}

	public void setHerido(boolean herido) {
		this.herido = herido;
	}

	public boolean isMuerto() {
		return muerto;
	}

	public void setMuerto(boolean muerto) {
		this.muerto = muerto;
	}
	
	public abstract boolean retirarse();
	
	public static boolean comprobarEdad(int edad) {
		
		boolean puedeLuchar = false;
		
		if (edad > 14 && edad < 61) {
			puedeLuchar = true;
		}
		
		return (puedeLuchar);
	}
	
	public static boolean comprobarFuerza(int f) {
		
		boolean esFuerte = false;
		
		if (f > 0 && f < 11) {
			esFuerte = true;
		}
		
		return (esFuerte);
	}

}

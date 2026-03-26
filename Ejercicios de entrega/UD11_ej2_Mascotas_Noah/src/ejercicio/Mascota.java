package ejercicio;

public abstract class Mascota {
	private String nombre;
	private int edad;
	private boolean estado;
	private String fechaNacimiento;
	
	public Mascota(String nombre, int edad, boolean estado, String fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public abstract void muestra();
	
	public void cumpleanios() {
		System.out.println("El cumpleaños de " + nombre + "es el " + fechaNacimiento.substring(0, 5));
	}
	
	public void morir() {
		estado = false;
	}
	
	public abstract void habla();
	


	@Override
	public String toString() {
		
		String estado;
		
		if (this.estado) {
			estado = "vivo";
		}
		else {
			estado = "muerto";
		}
		
		return String.format("\t- Nombre: %s\n\t- Edad: %s\n\t- Estado: %s\t- \nFecha de nacimiento: %s\n",
				nombre, edad, estado,fechaNacimiento);
	}

}

package pojo;

public class CAsignatura {
	
	private String nombre;
	private double nota;
	
	public CAsignatura(String nombre) {
		this.nombre = nombre;
		nota = -1;
	}
	
	public CAsignatura(CAsignatura asignatura) {
		nombre = asignatura.getNombre();
		nota = asignatura.getNota();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		
		if (nota < 1 || nota > 10) {
			System.out.println("Error: fuera de rango válido (1-10).\nInténtalo de nuevo.");
		}
		else {
			this.nota = nota;
		}
		
	}
	
	public String toString(boolean sinNotas) {
		
		String nota;
		
		if (sinNotas) {
			nota = "%s: SIN NOTA PUESTA\n".formatted(nombre.toUpperCase(), this.nota);
		}
		else {
			nota = "%s: %2.f\n".formatted(nombre.toUpperCase(), this.nota);
		}
		
		
		return (nota);
	}
	
	
}

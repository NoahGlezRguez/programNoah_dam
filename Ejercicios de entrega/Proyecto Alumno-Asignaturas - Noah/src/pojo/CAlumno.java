package pojo;

import java.util.ArrayList;

public class CAlumno {
	
	private String DNI;
	private String nombre;
	private String direccion;
	private ArrayList<CAsignatura> listaAsignaturas = null;
	
	public CAlumno(String dNI, String nombre, String direccion) {
		
		DNI = dNI;
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaAsignaturas = new ArrayList<>(10);
	}
	
	public CAlumno(CAlumno alumno) {
		
		this.DNI = alumno.getDNI();
		this.nombre = alumno.getNombre();
		this.direccion =  alumno.getDireccion();
		this.listaAsignaturas = alumno.getListaAsignaturas();
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public ArrayList<CAsignatura> getListaAsignaturas() {
		return listaAsignaturas;
	}
	
	public void setListaAsignaturas(ArrayList<CAsignatura> listaAsignaturas) {
		this.listaAsignaturas = listaAsignaturas;
	}
	
	public CAsignatura obtenerAsignatura(int pos) {
		
		CAsignatura asig = null;
		
		if (listaAsignaturas != null && listaAsignaturas.size() > pos) {
			asig = listaAsignaturas.get(pos);
		}
		
		return (asig);
	}
	
	public void anadirAsignatura(CAsignatura asignatura) {
		listaAsignaturas.add(asignatura);
	}
	
	public int numeroAsignaturas() {
		return(listaAsignaturas.size());
	}
	
	public double obtenerNotaMedia() {
		double media = 0.00;
		double totalAsig = 0;
		
		for (int i = 0; i < listaAsignaturas.size(); i++) {
			
			if (listaAsignaturas.get(i).getNota() != -1) {
				media += listaAsignaturas.get(i).getNota();
				totalAsig++;
			}
		}
		
		media /= totalAsig;
		
		return (media);
	}
	
	private String obtenerNotas() {
		
		String notas = "";
		
		for (int i = 0; i < listaAsignaturas.size(); i++) {
			
			if (listaAsignaturas.get(i).getNota() == -1) {
				notas += listaAsignaturas.get(i).toString(true);
			}
			else {
				notas += listaAsignaturas.get(i).toString(false);
			}
			
		}
		
		return (notas);
	}
	
	@Override
	public String toString() {
		
		String notas = obtenerNotas();
		String output = null;
		
		if (numeroAsignaturas() > 0) {
			output = """
				DNI: %s Nombre: %s Dir: %s Nº asignaturas: %d
				%s
				Nota media: %s
				""".formatted(this.DNI, this.nombre, this.direccion, numeroAsignaturas(), notas, obtenerNotaMedia());
		}
		else {
			output = """
				DNI: %s Nombre: %s Dir: %s SIN ASIGNATURAS
				""".formatted(this.DNI, this.nombre, this.direccion);
		}
		
		return (output);
	}
	
	
}

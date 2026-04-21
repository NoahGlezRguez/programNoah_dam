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
		
		for (int i = 0; i < listaAsignaturas.size(); i++) {
			media += listaAsignaturas.get(i).getNota();
		}
		
		return (media);
	}
	
	@Override
	public String toString() {
		
		String notas = null;
		
		String output = """
				DNI: %s
				%s
				Nota media: %s
				""".formatted(this.DNI, obtenerNotas(), obtenerNotaMedia());
		
		
		return (output);
	}
	
	
}

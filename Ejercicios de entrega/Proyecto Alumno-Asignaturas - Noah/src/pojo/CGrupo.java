package pojo;

import java.util.ArrayList;

public class CGrupo {
	private String nombreGrupo;
	private ArrayList<CAlumno> alumnos = null;
	
	public CGrupo(String nombreGrupo) {
		
		alumnos = new ArrayList<CAlumno>(30);
		
		this.nombreGrupo = nombreGrupo;
	}
	
	public CAlumno alumno(int pos) {
		
		CAlumno alumno = null;
		
		if (pos >= 0 && alumnos.size() > 0) {
			alumno = alumnos.get(pos);
		}
		else {
			System.err.println("Error: Alumno no encontrado.");
		}
		
		return (alumno);
	}
	
	public CAlumno buscarPorNombre(String nombre) {
		
		CAlumno alu = null;
		
		if (alumnos.size() > 0) {
			for (int i = 0; i < alumnos.size(); i++) {
				if (alumnos.get(i).getNombre().equals(nombre)) {
					alu = alumnos.get(i);
				}
			}
		}
		
		return (alu);
	}
	
	public void anadirAlumno(CAlumno alum) {
		
		if (alumnos.size() < 30) {
			alumnos.add(alum);
		}
		else {
			System.err.println("Error: grupo lleno, no se pueden añadir más alumnos.");
		}
	}
	
	public void bajaAlumno(String nombre) {
		
		if (alumnos.size() > 0) {
			for (int i = 0; i < alumnos.size(); i++) {
				if (alumnos.get(i).getNombre().equals(nombre)) {
					alumnos.remove(i);
				}
			}
		} else {
			System.err.println("Error: no hay alumnos en este grupo, está vacío.");
		}
		
	}
	
	public int numeroAlumnos() {
		return (alumnos.size());
	}

	public String toString(boolean simplificado) {
		
		String result = "";
		
		if (simplificado) {
			result += "CGrupo:" + nombreGrupo + ", " + alumnos.size() + "alumnos.\n";
		}
		else {
			result += "CGrupo:" + nombreGrupo + ", alumnos:\n";
			for (int i = 0; i < alumnos.size(); i++) {
				result += alumnos.get(i).toString();
			}
		}
		
		return (result);
	}
	
	public boolean existe(String nombre) {
		
		boolean existe = false;
		
		if (alumnos.size() > 0) {
			for (int i = 0; i < alumnos.size(); i++) {
				if (alumnos.get(i).getNombre().equals(nombre)) {
					existe = true;
				}
			}
		}
		
		return (existe);
	}
	
}

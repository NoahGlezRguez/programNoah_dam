package pojo;

import java.util.Scanner;

public class CAplicacion {
	
	public static Scanner teclado = new Scanner(System.in);
	public static String entrada = "";
	public static CGrupo dam = new CGrupo("DAM");
	
	public static void main(String args[]) {

		menu();
	}
	
	private static void menu() {
		
		int opcion = -1;
		
		do {
			System.out.println("""
					Operaciones disponibles:
						1.- Matricular
						2.- Baja de alumno
						3.- Poner notas
						4.- Mostrar expediente
						5.- Mostrar datos de todo el grupo
						6.- Salir 
					""");
			
			System.out.print("Introduzca la operación que desea realizar: ");
			
			entrada = teclado.nextLine();
			
			try {
				opcion = Integer.parseInt(entrada);
				
				switch (opcion) {
					case 1:
						matricular();
						break;
					
					case 2:
						bajaAlumno();
						break;
					
					case 3:
						ponerNotas();
						break;
					
					case 4:
						mostrarExpediente();
						break;
					
					case 5:
						mostrarGrupo();
						break;
				}
				
			} catch (Exception error) {
				System.err.println("Error: debe ser una opción entre la 1 y la 6.");
			}

		} while (opcion != 6);
	}
	
	public static void matricular() {
		
		CAlumno alumNuevo;
		CAsignatura asigna;
		String datos[] = {"el DNI", "el nombre", "la dirección"};
		String respuestas[] = {"", "", ""};
		String asig = "";

		for (int i = 0; i < 3; i++) {
			pedirDato(datos[i]);
			respuestas[i] = teclado.nextLine();
		}
		
		alumNuevo = new CAlumno(respuestas[0], respuestas[1], respuestas[2]);
		
		do {
			entrada = ".";
			System.out.println("¿Desea matricular en una asignatura a este alumno?");
			System.out.println("\t(Introduce '1' para sí, cualquier otra cosa para no...)");
			entrada = teclado.nextLine().trim();
			if (entrada.equals("1")) {
				System.out.print("Introduce nombre de la asignatura: ");
				asig = teclado.nextLine();
				asigna = new CAsignatura(asig);
				alumNuevo.anadirAsignatura(asigna);
			}

		} while (entrada.equals("1"));
		 
		dam.anadirAlumno(alumNuevo);
	}
	
	public static void bajaAlumno() {
		System.out.print("Introduce el nombre del alumno que se va a dar de baja del curso: ");
		entrada = teclado.nextLine().trim();
		if (dam.existe(entrada)) {
			dam.bajaAlumno(entrada);
		} else {
			System.err.println("Error: alumno no encontrado.");
		}
	}
	
	public static void ponerNotas() {
		
		boolean esCorrecto = true;
		double nota;
		
		CAlumno alu = null;
		
		pedirDato("el nombre");
		entrada = teclado.nextLine().trim();
		if (dam.existe(entrada)) {
			
			alu = dam.buscarPorNombre(entrada);
			
			for (int i = 0; i < alu.getListaAsignaturas().size(); i++) {
				
				do {
					nota = -1;			
					System.out.print("Introduzca la nota de " +alu.getListaAsignaturas().get(i).getNombre() + ": ");
					entrada = teclado.nextLine();
					
					try {
						nota = Double.parseDouble(entrada);
					
					} catch (Exception error) {
						esCorrecto = false;
						System.err.println("Error: introduzca un valor numérico comprendido entre 1 y 10.");
					}
				} while (!esCorrecto);
				alu.getListaAsignaturas().get(i).setNota(nota);
			}
		}

	}
	
	public static void mostrarExpediente() {
		
		CAlumno alu = null;
		
		pedirDato("el nombre");
		entrada = teclado.nextLine();
		
		if (dam.existe(entrada)) {
			alu = dam.buscarPorNombre(entrada);
			System.out.println(alu.toString());
		}
		else {
			System.err.println("Error: alumno no encontrado.");
		}
	}
	
	public static void mostrarGrupo() {
		dam.toString(false);
	}
	
	public static void pedirDato(String dato) {
		System.out.print("Por favor, introduce %s: ".formatted(dato));
	}
	
}

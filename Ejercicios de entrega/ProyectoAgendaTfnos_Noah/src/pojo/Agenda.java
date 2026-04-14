package pojo;

import java.util.Scanner;

public class Agenda {

	private static Scanner teclado = new Scanner(System.in);
	private static String entrada;
	
	public static void main(String args[]) {
		
		int opc;
		CListaTfnos listatfnos = new CListaTfnos();
		
		do {
			opc = menu();
			
			switch (opc) {
				case 1:
					buscar(listatfnos);
					break;
				case 2:
					mostrarAgenda(listatfnos);
					break;
				case 3:
					anadir(listatfnos);
					break;
				case 4:
					eliminar(listatfnos);
					break;
			}
			
		} while (opc != 5);
	}
	
	private static int menu() {
		
		int opc = -1;
		boolean esCorrecto = false;
		
		do {
			mostrarMenu();
			
			entrada = teclado.nextLine();
			
			try {
				opc = Integer.parseInt(entrada);
				if (opc > 0 && opc < 6) {
					esCorrecto = true;
				}
				else {
					System.err.println("Opción inválida. Inténtalo de nuevo...");
				}
						
			} catch (Exception error) {
				System.err.println("Debe ser un nº. Inténtalo de nuevo...");
			}
			
		} while (!esCorrecto);
		
		return (opc);
	}
	
	private static void mostrarMenu() {
		String menu = """
				1.- Buscar
				2.- Mostrar agenda
				3.- Añadir
				4.- Eliminar
				5.- Salir
				
				Introduzca la operación deseada: """;
		System.out.print(menu);
	}

	public static void buscar(CListaTfnos listatfnos) {
		String nombre = null;
		boolean esCorrecto = false;
		int idx;
		
		do {
			System.out.print("Introduzca un nombre: ");
			entrada = teclado.nextLine().trim();
			if (!entrada.isBlank()) {
				nombre = entrada;
				esCorrecto = true;
			}
		} while (!esCorrecto);
		
		idx = listatfnos.buscar(nombre);
		
		if (idx != -1) {
			System.out.println("Nombre encontrado:");
			listatfnos.registro(idx);
		}
	}
	
	public static void mostrarAgenda(CListaTfnos listatfnos) {
		listatfnos.mostrarLista();
	}
	
	public static void anadir(CListaTfnos listatfnos) {
		
		CPersona persona;
		boolean esCorrecto = false;
		String datos[] = new String[3];
		String tipoDato[] = {"nombre", "email", "teléfono"};
		
		for (int  i = 0; i < 3; i++) {
			do {
				System.out.printf("Introduzca un %s: ", tipoDato[i]);
				entrada = teclado.nextLine().trim();
				if (!entrada.isBlank()) {
					datos[i] = entrada;
					esCorrecto = true;
				}
			} while (!esCorrecto);
		}
		
		persona = new CPersona(datos[0], datos[1], datos[2]);
		
		listatfnos.anadir(persona);
	}
	
	public static void eliminar(CListaTfnos listatfnos) {
		String tfno = null;
		boolean esCorrecto = false;
		
		do {
			System.out.print("Introduzca un teléfono: ");
			entrada = teclado.nextLine().trim();
			if (!entrada.isBlank()) {
				tfno = entrada;
				esCorrecto = true;
			}
		} while (!esCorrecto);
		
		listatfnos.eliminar(tfno);
	}
}

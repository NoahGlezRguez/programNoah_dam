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
	
	/**
	 * muestra el menu de operaciones disponibles de la agenda,<br>
	 * recoge y valida la opcion seleccionada por el usuario
	 * @return
	 */
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
	
	/**
	 * imprime el menu por pantalla
	 */
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

	/**
	 * se busca un contacto con el nombre ingresado por el usuario
	 * @param listatfnos - listado de telefonos
	 */
	public static void buscar(CListaTfnos listatfnos) {
		String nombre = null;
		boolean esCorrecto = false;
		int idx;
		CPersona persona;
		
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
			persona = listatfnos.registro(idx);
			System.out.println(persona.toString());
			;
		}
	}
	
	/**
	 * imprime por pantalla el listado de contactos que tiene la agenda
	 * @param listatfnos
	 */
	public static void mostrarAgenda(CListaTfnos listatfnos) {
		listatfnos.mostrarLista();
	}
	
	/**
	 * Agrega un nuevo contacto a la agenda
	 * @param listatfnos - la agenda
	 */
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
	
	/**
	 * Pide al usuario introducir un nº de teléfono y si existe en la agenda <br>
	 * lo elimina. En caso contrario, no hace nada.
	 * @param listatfnos
	 */
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

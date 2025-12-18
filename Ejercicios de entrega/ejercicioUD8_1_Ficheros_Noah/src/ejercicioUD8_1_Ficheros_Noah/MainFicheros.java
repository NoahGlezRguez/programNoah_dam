package ejercicioUD8_1_Ficheros_Noah;

//import java.io.*;
import java.util.Scanner;


public class MainFicheros {

	public static Scanner	teclado = new Scanner(System.in);
	public static String	entrada;
	
	public static void main(String[] args) {
		
		int	opc = 0;
		
		String	menu[] = {"Cargar Mensajes", "Guardar Mensajes", "Añadir mensaje", "Imprimir mensaje", "Salir"};
		Mensaje	mensajes[] = null;
		
		System.out.println();
		
		do {
			opc = MetodAux.menuOpciones("Operaciones disponibles", menu, "Seleccione la operación que desea realizar");

			MetodAux.pintarLinea("~", 71);
			
			switch (opc) {

				case 0:
					System.out.println("\n\tCargando datos...\n");
					//cargarMensajes(mensajes);
					/*1.- con arrays de objetos
					 * se mostrara numero total de mensajes cargados (se pueden cargar
					 * cada vez mas sin guardar ni nada)*/
					break;
				case 1:
					System.out.println("\n\tGuardando datos...\n");
					/* 2.- se guardan los ya cargados en el fichero mensajes.txt
					 * se mostrara mensaje de "Los mensajes en memoria han sido
					 * guardados en el fichero mensajes.txt"*/
					break;
				case 2:
					mensajes = NuevoMensaje.añadirMensaje(mensajes);
					break;
				case 3:
					if (mensajes == null)
						System.out.println("\n\t- No hay mensajes que mostrar...\n");
					else {
						System.out.println("\n\tImprimiendo mensajes...\n");
						System.out.printf("%15s%15s%10s%10s%20s%40s\n", "De", "Para", "Fecha", "Hora", "Asunto", "Contenido");
						for (int i = 0; i < mensajes.length; i++)
							mensajes[i].imprimirMensaje();
					}
					break;
			}
					
		} while(opc != 4);
		
		System.out.println("\t\t- Saliendo del programa...");
		
		teclado.close();
	
	}

}

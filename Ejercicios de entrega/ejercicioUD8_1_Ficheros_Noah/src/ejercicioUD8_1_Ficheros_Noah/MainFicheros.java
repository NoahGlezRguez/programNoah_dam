package ejercicioUD8_1_Ficheros_Noah;

import java.util.Scanner;

/**
 * Contiene el programa de ficheros
 */
public class MainFicheros {

	public static Scanner	teclado = new Scanner(System.in);
	public static String	entrada;
	
	/**
	 * Muestra un menú de varias operaciones para añadir, ver, guardar o cargar mensajes que hay en memoria
	 * o en un fichero.
	 * 
	 * @param args
	 */
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
					mensajes = CargarMensajes.recuperarDatos(mensajes, "mensajes.txt");
					break;
				case 1:
					System.out.println("\n\tGuardando datos...\n");
					GuardarMensajes.guardarEnFichero(mensajes, "mensajes.txt");
					mensajes = null;
					break;
				case 2:
					mensajes = NuevoMensaje.añadirMensaje(mensajes);
					break;
				case 3:
					if (mensajes == null)
						System.out.println("\n\t- No hay mensajes que mostrar...\n");
					else {
						System.out.println("\n\tImprimiendo mensajes...\n");
						System.out.printf("%15s%15s%20s%10s%40s%40s", "De", "Para", "Fecha", "Hora", "Asunto", "Contenido");
						MetodAux.pintarLinea("-", 170);
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

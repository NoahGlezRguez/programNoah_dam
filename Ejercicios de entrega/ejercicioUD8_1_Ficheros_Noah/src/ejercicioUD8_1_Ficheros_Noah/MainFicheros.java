package ejercicioUD8_1_Ficheros_Noah;

import java.io.*;
import java.util.Scanner;


public class MainFicheros {

	public static Scanner	teclado = new Scanner(System.in);
	public static String	entrada;
	
	public static void main(String[] args) {
		
		int	opc = 0;
		
		String	menu[] = {"Cargar Mensajes", "Guardar Mensajes", "Añadir mensaje", "Imprimir mensaje", "Salir"};
		
		
		System.out.println();
		
		do {
			opc = MetodAux.menuOpciones("Operaciones disponibles", menu, "Seleccione la operación que desea realizar");
			
			switch (opc) {
				case 0:
					MetodAux.pintarLinea("~", 71);
					System.out.println("\n\tCargando datos...\n");
					//EjecutarEjercicio1.ejercicio1();
					MetodAux.pintarLinea("~", 71);
					break;
				case 1:
					MetodAux.pintarLinea("~", 71);
					System.out.println("\n\tGuardando datos...\n");
					//EjecutarEjercicio2.ejercicio2();
					MetodAux.pintarLinea("~", 71);
					break;
				case 2:
					MetodAux.pintarLinea("~", 71);
					System.out.println("\n\tAñadiendo mensaje...\n");
					//EjecutarEjercicio1.ejercicio1();
					MetodAux.pintarLinea("~", 71);
					break;
				case 3:
					MetodAux.pintarLinea("~", 71);
					System.out.println("\n\tImprimiendo mensajes...\n");
					//EjecutarEjercicio2.ejercicio2();
					MetodAux.pintarLinea("~", 71);
					break;
					
			}
					
		} while(opc != 4);
		
		MetodAux.pintarLinea("~", 71);
		System.out.println("\t\t- Saliendo del programa...");
		
		teclado.close();
		
		
		/*
		 * 
		 * 1.- con arrays de objetos
		 * 		se mostrara numero total de mensajes cargados (se pueden cargar cada vez mas sin guardar ni nada)
		 * 
		 * 2.- se guardan los ya cargados en el fichero mensajes.txt
		 * 		se mostrara mensaje de "Los mensajes en memoria han sido guardados en el fichero mensajes.txt"
		 * 
		 * 3.- se pediran los siguientes datos:
		 * 		fecha, hora, de, para, asunto, contenido
		 * 		el mensaje se añade usando un objeto, en la memoria
		 * 
		 * 4.- imprimir los mensajes en una tabla con la siguiente estructura:
		 * 		de	para		fecha	hora		asunto	contenido
		 * 		Si no hubiera mas mensajes, se mostrara "No hay mensajes que mostrar"
		 * 
		 * */
	}

}

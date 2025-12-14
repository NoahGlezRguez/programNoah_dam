package ejercicioUD6_2_Objetos_entrega4_Noah;

import java.util.Scanner;

/* De los ejercicios de la entrega, se hace:
*	ejercicio 6 no,	 	por el windowbuilder
*	ejercicio 7 opcion 1 y 2 si
*	ejercicio 8 no 		por "forma visual" distinta de terminal, que sería windowbuilder tambien... */

/*
*	En el ejercicio 7, las opciones 1 y 2 son la de cargar datos alumnos y procesar dichos datos,
*	así que las de mostrar los datos de todos los alumnos o de alguno en concreto no se piden...
*	También se pide Test con JUnit para esta entrega.
*
*	Las otras opciones no se piden.
*/

public class MainObjetos4 {

	public static String entrada = "";
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		int		opcion = 0;
		String	operaciones[] = {"Fin", "Cargar datos alumnos", "Procesar los datos", "Mostrar datos de los alumnos", "Mostrar datos de un alumno"};
		Alumno	alumnos[] = null;
		
		do {
			opcion = AuxMetods.menuOpciones("Menú principal", operaciones, "Ingrese la operación que desea realizar");
			alumnos = ejecutarOperacion(opcion, alumnos);
		} while (opcion != 0);
		
		teclado.close();
	}

	private static Alumno[] ejecutarOperacion(int opcion, Alumno alumnos[]) {
		
		int		datos[] = new int[2];//no se muestra en las opciones 1 y 2, asi que tecnicamente no se usa
		
		switch (opcion) {
			case 1:
				alumnos = cargarDatosAlumnos();
				break;
			case 2:
				if (alumnos == null)
					System.out.println("Aún no hay datos cargados de ningún alumno...");
				else
					datos = procesarLosDatos(alumnos);
				break;
			case 3:
				System.out.println("Lo sentimos, esta operación no se encuentra operativa...");
				break;
			case 4:
				System.out.println("Lo sentimos, esta operación no se encuentra operativa...");
				break;
		}
		return (alumnos);
	}
	
	
	private static Alumno[] cargarDatosAlumnos() {
		
		Alumno alumnos[];
		String	nombre;
		String	sexo;
		int		edad;
		double	altura;
		double	peso;
		int		numAlumnos = -1;
		boolean	esCorrecto;
		
		do {
			esCorrecto = false;
		
			System.out.print("\n\t- Por favor, indica el nº de alumnos: ");
			entrada = teclado.nextLine().trim();
			
			if (!entrada.isBlank() && AuxMetods.checkSoloNumeroPositivoEntero(entrada)) {
				esCorrecto = true;
				numAlumnos = Integer.parseInt(entrada);
				if (numAlumnos <= 0)
					esCorrecto = false;
			}
		} while (!esCorrecto);
		
		alumnos = new Alumno[numAlumnos];
		
		for (int i = 0; i < alumnos.length; i++) {
			
			nombre = pedirString("el nombre", i + 1);
			sexo = pedirString("el sexo", i + 1);
			sexo = sexo.toUpperCase();
			if (!sexo.equals("M") && !sexo.equals("H"))
				sexo = "M";
			
			do {
				edad = pedirEntero("la edad", i + 1);
			} while (edad <= 0);
			
			do {
				altura = pedirDecimal("la altura", i + 1);
			} while (altura <= 0 || altura >= 2.5);
			
			do {
				peso = pedirDecimal("el peso", i + 1);
			} while (peso <= 0 || peso >= 150);
			
			alumnos[i] = new Alumno(nombre, sexo, edad, altura, peso);
		}
		return (alumnos);
	}
	
	private static int[] procesarLosDatos(Alumno alumnos[]) {
		int		edadH = 0, numHombres = 0, totalEdades = 0;
		int		altos = 0;
		String	sexo;
		for (int i = 0; i < alumnos.length; i++) {
			sexo = alumnos[i].getSexo();
			if (sexo == "H") {
				numHombres++;
				edadH += alumnos[i].getEdad();
			}
		}
	}
	
	/**
	 * Este método sirve para pedir por teclado un String, en este caso se especifica qué tipo de información
	 * se pide gracias al String que se recibe por parámetro, y los datos introducidos se revisa que no sen
	 * una cadena vacía.
	 * @param dato - tipo de dato que se desea que se introduzca
	 * @return valor - el String con el dato obtenido
	 */
	private static String pedirString(String dato, int numAlumno) {
		
		boolean esCorrecto = false;
		String	valor = "";
		do {
			esCorrecto = false;
			
			System.out.printf("\n\t- Por favor, ingresa %s del alumno %d: ", dato, numAlumno);
			entrada = teclado.nextLine().trim();
			if (!entrada.isBlank()) {
				esCorrecto = true;
				valor = entrada;
			}
		} while (!esCorrecto);
		
		return (valor);
	}
	
	/**
	 * Este método sirve para pedir por teclado un número entero, en este caso se especifica qué tipo de información
	 * se pide gracias al String que se recibe por parámetro, y los datos introducidos se revisa que no sen
	 * una cadena vacía y que efectivamente es un número entero.
	 * @param dato - tipo de dato que se desea que se introduzca
	 * @return valor - el int obtenido
	 */
	private static int pedirEntero(String dato, int numAlumno) {
		
		boolean esCorrecto = false;
		int valor = 0;
		
		do {
			esCorrecto = false;
		
			System.out.printf("\n\t- Por favor, ingresa %s de la persona: ", dato, numAlumno);
			entrada = teclado.nextLine().trim();
			if (!entrada.isBlank() && AuxMetods.checkSoloNumeroPositivoEntero(entrada)) {
				esCorrecto = true;
				valor = Integer.parseInt(entrada);
			}
		} while (!esCorrecto);
		
		return (valor);
		
	}
	
	/**
	 * Este método sirve para pedir por teclado un número decimal, en este caso se especifica qué tipo de información
	 * se pide gracias al String que se recibe por parámetro, y los datos introducidos se revisa que no sen
	 * una cadena vacía y que efectivamente es un número decimal correcto.
	 * @param dato - tipo de dato que se desea que se introduzca
	 * @return valor - el decimal obtenido
	 */
	private static double pedirDecimal(String dato, int numAlumno) {
		
		boolean esCorrecto = false;
		double	valor = 0;
		
		do {
			esCorrecto = false;
		
			System.out.printf("\n\t- Por favor, ingresa %s de la persona: ", dato, numAlumno);
			entrada = teclado.nextLine();
			
			if (!entrada.isBlank() && AuxMetods.checkSoloNumeroDecimal(entrada)) {
				esCorrecto = true;
				valor = Double.parseDouble(entrada);
			}
		} while (!esCorrecto);
		
		return (valor);
	}
}

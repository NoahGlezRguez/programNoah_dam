package ejercicioUD6_2_Objetos_entrega4_Noah_TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import ejercicioUD6_2_Objetos_entrega4_Noah.AuxMetods;

//solo testeo estos dos metodos porque son aquellos donde no interviene el teclado o son metodos publicos...
public class AuxMetodsTest {
	int numero;
	@Test
	public void testCheckSoloNumeroPositivoEntero() {
		
		String	aptos[] = {"123", "654", "+55",	"789456123456", "0"};	
		
		String	noAptos[] = {"textoTexto", "3.3", "", null};
		
		boolean		resultadoTesteo;
	
		for (int i = 0; i < noAptos.length; i++) {
			resultadoTesteo = AuxMetods.checkSoloNumeroPositivoEntero(noAptos[i]);
			if (resultadoTesteo == true) {
				fail("Admitió algo que no era un número entero");
				System.out.printf("%s\n", noAptos[i]);
			}
			
		}
		
		for (int i = 0; i < aptos.length; i++) {
			resultadoTesteo = AuxMetods.checkSoloNumeroPositivoEntero(aptos[i]);
			
			if (resultadoTesteo == false)
				fail("No admitió algo que era un número entero");
		}
		
	}

	//@Test no se testea porque es solamente imprimir
	/*void testPintarLinea() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testCheckSoloNumeroDecimal() {
		
		String	aptos[] = {"12.3", "-6.54", "+5.5",	"78945612.3456", "1", ".3", "2."};	
		
		String	noAptos[] = {"textoTexto", "3.3.", "", ".", "..", "11o", "", null};
		
		boolean		resultadoTesteo;
	
		for (int i = 0; i < noAptos.length; i++) {
			resultadoTesteo = AuxMetods.checkSoloNumeroDecimal(noAptos[i]);
			if (resultadoTesteo == true)
				fail("Admitió algo que no era un número decimal");
			
		}
		
		for (int i = 0; i < aptos.length; i++) {
			resultadoTesteo = AuxMetods.checkSoloNumeroDecimal(aptos[i]);
			
			if (resultadoTesteo == false)
				fail("No admitió algo que era un número decimal");
		}
	}

	//@Test no se testea por intervenir el teclado creo
	/*void testMenuOpciones() {
		fail("Not yet implemented");
	}*/

}

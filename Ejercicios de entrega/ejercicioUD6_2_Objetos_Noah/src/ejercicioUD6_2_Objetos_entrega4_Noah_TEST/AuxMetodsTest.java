package ejercicioUD6_2_Objetos_entrega4_Noah_TEST;

import static org.junit.Assert.*;

import org.junit.Test;

import ejercicioUD6_2_Objetos_entrega4_Noah.AuxMetods;

class AuxMetodsTest {
	int numero;
	@Test
	void testCheckSoloNumeroPositivoEntero() {
		
		String	aptos[] = {"123", "-654", "+55",	"789456123456"};	
		
		String	noAptos[] = {"textoTexto", "3.3", "", null};
		
		boolean		resultadoTesteo;
	
		for (int i = 0; i < noAptos.length; i++) {
			resultadoTesteo = AuxMetods.checkSoloNumeroPositivoEntero(noAptos[i]);
			if (resultadoTesteo == true)
				fail("Admitió algo que no era un número entero");
			
		}
		
		for (int i = 0; i < aptos.length; i++) {
			resultadoTesteo = AuxMetods.checkSoloNumeroPositivoEntero(aptos[i]);
			
			if (resultadoTesteo == false)
				fail("No admitió algo que era un número entero");
		}
		
		fail("Not yet implemented");
	}

	@Test
	void testPintarLinea() {
		fail("Not yet implemented");
	}

	@Test
	void testCheckSoloNumeroDecimal() {
		fail("Not yet implemented");
	}

	@Test
	void testMenuOpciones() {
		fail("Not yet implemented");
	}

}

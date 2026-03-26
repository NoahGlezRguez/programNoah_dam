package ejercicio;

public class GuerraTroya {

	public static void main(String[] args) {
		
		Caballo caballoSorpresa = new Caballo(20);

		Griego griegos[] = new Griego[3];
		
		for (int i = 0; i < griegos.length; i++) {
			griegos[i] = new Griego();
		}
		
		//no se dio datos asi que los creo por defecto y despues les asigno el nombre
		
		griegos[0].setNombre("Aquiles");
		griegos[1].setNombre("Agamenon");
		griegos[2].setNombre("Ajax");
		
		for (int i = 0; i < griegos.length; i++) {
			caballoSorpresa.montarseEnCaballo(griegos[i]);
		}
		
		caballoSorpresa.mostrarCaballo();
		
		Griego anonimous = new Griego();
		
		caballoSorpresa.montarseEnCaballo(anonimous);
		
		caballoSorpresa.mostrarCaballo();
		
		caballoSorpresa.mostrarGuerrero(caballoSorpresa.buscar("Agamenon"));
		
		caballoSorpresa.mostrarGuerrero(caballoSorpresa.buscar("Odiseo"));
		
		Troyano impostor = new Troyano();
		
		impostor.setNombre("Paris");
		
		caballoSorpresa.montarseEnCaballo(impostor);
		
	}

}

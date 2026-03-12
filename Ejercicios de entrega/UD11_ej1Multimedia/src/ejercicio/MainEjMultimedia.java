package ejercicio;

public class MainEjMultimedia {

	public static void main(String[] args) {
		
		//Parte 1
		/*
		ListaMultimedia multi = new ListaMultimedia(10);
		
		Pelicula peli1 = new Pelicula("Eliot Page", "Kristen Stewart", "Slay", "LP", Formato.mov, 120);
		Pelicula peli2 = new Pelicula("Susan Anderson", "Jason Momoa", "The puff", "Jay", Formato.avi, 145);
		Pelicula peli3 = new Pelicula("Luis Guaranga", "Jay", "Little Bitches", "Carmen", Formato.mov, 170);
		
		multi.add(peli1);
		multi.add(peli2);
		multi.add(peli3);
		
		System.out.println(multi.toString());*/
		
		//Parte 2
		ListaMultimedia multi2 = new ListaMultimedia(20);
		
		Disco disco1 = new Disco("Caja negra", "Carmen Boza", Genero.POP, Formato.cdAudio, 50);
		Disco disco2 = new Disco("Caribe Mix 2005", "The Machine", Genero.HIPHOP, Formato.wav, 40);
		Disco disco3 = new Disco("Techno Full Moon", "LDS", Genero.SOUNDTRACK, Formato.mp3, 75);
		
		multi2.add(disco1);
		multi2.add(disco2);
		multi2.add(disco3);
		
		System.out.println(multi2.toString());
		
		Disco disco4 = new Disco("Caja Negra", "Carmen Boza", null, null, 0);
		
	}

}

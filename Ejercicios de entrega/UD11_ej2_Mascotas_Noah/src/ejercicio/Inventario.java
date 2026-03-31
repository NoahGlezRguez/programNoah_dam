package ejercicio;

public class Inventario {
	
	public static void main(String[] args) {
		Perro miPerro = new Perro("Taia", 6, true, "22/08/2020", "Mestiza", false);
		Perro suPerro = new Perro("Bestia", 19, true, "10/03/2025", "Caniche Toy", true);
		
		Gato miGato = new Gato("Chi", 10, true, "15/08/2015", "Atigrada", false );
		Gato suGato = new Gato("Perlita", 2, true, "02/05/2026", "Blanca", true);
		
		Loro miLoro = new Loro("Terry", 20, false, "15/03/2006", "largo", false, "Brasil", true);
		Loro suLoro = new Loro("Daxter", 3, true, "20/09/2022", "redondo", true, "Amazonas", false);
		
		Canario miCanario = new Canario("Pipiolo", 2, true, "1/11/2023", "pequeño", true, "amarillo", true);
		Canario suCanario = new Canario("Tuchi", 0, true, "12/01/2026", "afilado", false, "amarillo anaranjado", false);
		
		Mascota animales[] =  new Mascota[8];
		
		animales[0] = miPerro;
		animales[1] = suPerro;
		animales[2] = miGato;
		animales[3] = suGato;
		animales[4] = miLoro;
		animales[5] = suLoro;
		animales[6] = miCanario;
		animales[7] = suCanario;
		
		for (int i = 0; i < animales.length; i++) {
			animales[i].muestra();
		}
		
		miPerro.habla();
		suGato.habla();
		suLoro.habla();
		miCanario.habla();

		miLoro.volar();
		miCanario.volar();
		suLoro.saluda();
		suPerro.morir();
		
		suPerro.muestra();
		
	}
	
	
}

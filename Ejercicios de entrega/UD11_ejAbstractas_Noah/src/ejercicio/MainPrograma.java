package ejercicio;

import java.util.ArrayList;

public class MainPrograma {

	public static void main(String[] args) {
		
		Planeta venus;
		Planeta marte;
		Planeta tierra;
		ArrayList<Satelite> satelites1 = new ArrayList<Satelite>();
		ArrayList<Satelite> satelites2 = new ArrayList<Satelite>();
		Satelite satelMondra;
		Satelite satelYakk;
		Satelite satelLunita;
		
		satelMondra = new Satelite(687.544, 78.87, 987, -290, 0.3, "Mondragax", 500, true, null);
		satelYakk = new Satelite(5.544, 800.87, 87, -20, 0.8, "Yakkio", 1500, true, null);
		satelLunita = new Satelite(544, 870, 97, -90, 0.7, "Lunita", 200, true, null);
		
		satelites1.add(satelMondra);
		satelites1.add(satelYakk);
		satelites2.add(satelLunita);
		
		venus = new Planeta(40000, 1234, 9876574, 400, 0.9, "Venus", 0.5, true, false, null);
		marte = new Planeta(378000, 196754, 99999974, 7000, 3.9, "Marte", 0.9, true, true, satelites1);
		tierra = new Planeta(4000, 14, 574, 40, 2.9, "La Tierra", 0.7, true, true, satelites2);
			
		satelMondra.planetaPadre = marte;
		satelYakk.planetaPadre = marte;
		satelLunita.planetaPadre = tierra;
		
		venus.muestra();
		marte.muestra();
		tierra.muestra();
	}

}

package ejercicio;

public class MiCoche {

	public static void main(String[] args) {
		
		Coche[] coches = new Coche[4];
		
		Sedan	coche1 = new Sedan(250, 85000, "negro", 4);
		Ford		coche2 = new Ford(180, 38000, "caqui", 2023, 2000);
		Ford		coche3 = new Ford(145, 26500, "naranja", 2020, 1500);
		Coche	coche4 = new Coche(360, 320000, "rojo");
		
		coches[0] = coche1;
		coches[1] = coche2;
		coches[2] = coche3;
		coches[3] = coche4;
		
		for (int i = 0; i < coches.length; i++) {
			System.out.println(coches[i].toString());
		}
	}

}

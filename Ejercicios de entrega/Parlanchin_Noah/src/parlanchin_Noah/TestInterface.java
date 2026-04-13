package parlanchin_Noah;

public class TestInterface {
	
	public static void main(String args[]) {
		
		Perro p1 = new Perro();
		Gato g1 = new Gato();
		Cucu c1 = new Cucu();
		
		p1.habla();
		g1.habla();
		c1.habla();
		
		System.out.println();
		
		hazleHablar(p1);
		hazleHablar(g1);
		hazleHablar(c1);
	}
	
	private static void hazleHablar(Parlanchin p) {
		p.habla();
	}
}

package ejercicio;

public class Camion extends Coche{

	private int peso;
	
	public Camion(int velocidad, double precio, String color, int peso) {
		super(velocidad, precio, color);
		this.peso = peso;
	}

	@Override
	public double getPrecio() {
		
		double descuento;
		double precio = super.getPrecio();
		
		if (peso > 2000) {
			descuento = 10;
		}
		else {
			descuento = 20;
		}
		precio -= (precio * (descuento/100.0));
				
		return (precio);
	}

	@Override
	public String toString() {
		return ("""
				Camión:
					- peso 		-> %d kg
					- precio	-> %.2f€
					- velocidad	-> %d km/h
				    	- color		-> %s
				""".formatted(peso, getPrecio(), getVelocidad(), getColor()));
	}

	
}

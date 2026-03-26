package ejercicio;

public class Sedan extends Coche {
	
	private int longitud;
	
	public Sedan(int velocidad, double precio, String color, int longitud) {
		super(velocidad, precio, color);
		this.longitud = longitud;
	}
	
	@Override
	public double getPrecio() {
		
		double descuento;
		double precio = super.getPrecio();
		
		if (longitud > 3) {
			descuento = 5;
		}
		else {
			descuento = 10;
		}
		
		precio -= (precio * (descuento/100.0));
				
		return (precio);
	}

	@Override
	public String toString() {
		return ("""
				Sedan:
					- longitud	-> %d m 
					- precio	-> %.2f€
					- velocidad	-> %d km/h
				    	- color		-> %s
				""".formatted(longitud, getPrecio(), getVelocidad(), getColor()));
	}
	
}

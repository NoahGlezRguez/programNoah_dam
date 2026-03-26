package ejercicio;

public class Ford extends Coche {

	private int anyo;
	private int descuentoFabricante;
	
	public Ford(int velocidad, double precio, String color, int anyo, int descuentoFabricante) {
		super(velocidad, precio, color);
		this.anyo = anyo;
		this.descuentoFabricante = descuentoFabricante;
	}
	
	@Override
	public double getPrecio() {
		
		return (super.getPrecio() - descuentoFabricante);
	}

	@Override
	public String toString() {
		return ("""
				Ford:
					- año 		-> %d 
					- precio	-> %.2f€
					- velocidad	-> %d km/h
				    	- color		-> %s
				""".formatted(anyo, getPrecio(), getVelocidad(), getColor()));
	}
}

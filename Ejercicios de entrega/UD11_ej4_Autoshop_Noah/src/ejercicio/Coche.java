package ejercicio;

public class Coche {
	
	private int velocidad;
	private double precio;
	private String color;
	
	public Coche(int velocidad, double precio, String color) {
		
		this.velocidad = velocidad;
		this.precio = precio;
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}


	public String getColor() {
		return color;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return (precio);
	}
	

	@Override
	public String toString() {
		return ("""
				Coche:
					- precio	-> %.2f€
					- velocidad	-> %d km/h
				    	- color		-> %s
				""".formatted(getPrecio(), getVelocidad(), getColor()));
	}
}

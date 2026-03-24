package ejercicio;

public abstract class Astro {
	
	private double	radioEcuatorial;
	private double	rotacionEje;
	private double	masa;
	private double	temperaturaMedia;
	private double	gravedad;
	private String	nombre;
	
	public Astro() {
	}

	public Astro(double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad,
			String nombre) {
		this.radioEcuatorial = radioEcuatorial;
		this.rotacionEje = rotacionEje;
		this.masa = masa;
		this.temperaturaMedia = temperaturaMedia;
		this.gravedad = gravedad;
		this.nombre = nombre;
	}

	public double getRadioEcuatorial() {
		return radioEcuatorial;
	}

	public void setRadioEcuatorial(double radioEcuatorial) {
		this.radioEcuatorial = radioEcuatorial;
	}

	public double getRotacionEje() {
		return rotacionEje;
	}

	public void setRotacionEje(double rotacionEje) {
		this.rotacionEje = rotacionEje;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public double getGravedad() {
		return gravedad;
	}

	public void setGravedad(double gravedad) {
		this.gravedad = gravedad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Astro:\n\t- RadioEcuatorial = %s\n\t- RoptacionEje = %s\n\t- Masa = %s\n\t- TemperaturaMedia = %s\n\t- Gravedad = %s\n\t- Nombre = %s\n",
				radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad, nombre);
	}

	public abstract void muestra();
}

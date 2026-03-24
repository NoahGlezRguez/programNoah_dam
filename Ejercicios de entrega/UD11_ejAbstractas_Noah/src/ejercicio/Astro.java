package ejercicio;

public abstract class Astro {
	
	private double	radioEcuatorial;
	private double	rotacionEje;
	private double	masa;
	private double	temperaturaMedia;
	private double	gravedad;
	
	public Astro() {
	}

	public Astro(double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
		this.radioEcuatorial = radioEcuatorial;
		this.rotacionEje = rotacionEje;
		this.masa = masa;
		this.temperaturaMedia = temperaturaMedia;
		this.gravedad = gravedad;
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

	public abstract void muestra();
}

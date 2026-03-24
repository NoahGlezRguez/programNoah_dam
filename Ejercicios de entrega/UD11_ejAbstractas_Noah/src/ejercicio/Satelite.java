package ejercicio;

public class Satelite extends Astro {

	private double	distanciaPlaneta;
	private boolean	orbitaPlanetaria;
	public Planeta	planetaPadre;
	
	public Satelite() {
		super();
	}
	
	public Satelite(double distanciaPlaneta, boolean orbitaPlanetaria, Planeta planetaPadre) {
		this.distanciaPlaneta = distanciaPlaneta;
		this.orbitaPlanetaria = orbitaPlanetaria;
		this.planetaPadre = planetaPadre;
	}

	public double getDistanciaPlaneta() {
		return distanciaPlaneta;
	}

	public void setDistanciaPlaneta(double distanciaPlaneta) {
		this.distanciaPlaneta = distanciaPlaneta;
	}

	public boolean isOrbitaPlanetaria() {
		return orbitaPlanetaria;
	}

	public void setOrbitaPlanetaria(boolean orbitaPlanetaria) {
		this.orbitaPlanetaria = orbitaPlanetaria;
	}

	public Planeta getPlanetaPadre() {
		return planetaPadre;
	}

	public void setPlanetaPadre(Planeta planetaPadre) {
		this.planetaPadre = planetaPadre;
	}

	@Override
	public void muestra() {

	}
}

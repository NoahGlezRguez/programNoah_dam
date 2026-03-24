package ejercicio;

public class Satelite extends Astro {

	private double	distanciaPlaneta;
	private boolean	orbitaPlanetaria;
	public 	Planeta	planetaPadre;
	
	public Satelite() {
		super();
	}
	
	public Satelite(double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad,
			String nombre, double distanciaPlaneta, boolean orbitaPlanetaria, Planeta planetaPadre) {
		super(radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad, nombre);
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
	public String toString() {
		return String.format("\t    Datos genéricos satélite-> %s\t\tDatos específicos satelite->\n\t\t\t- DistanciaPlaneta = %s\n\t\t\t- OrbitaPlanetaria = %s\n\t\t\t- PlanetaPadre = %s\n",
				super.toString(), distanciaPlaneta, orbitaPlanetaria, planetaPadre.getNombre());
	}
	
	@Override
	public void muestra() {
		System.out.println(toString());
	}
}

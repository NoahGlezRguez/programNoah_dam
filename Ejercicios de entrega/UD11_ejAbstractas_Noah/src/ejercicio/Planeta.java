package ejercicio;

import java.util.ArrayList;

public class Planeta extends Astro {

	private double	distanciaSol;
	private boolean	orbitaAlSol;
	private boolean	tieneSatelites;
	public	ArrayList<Satelite> satelites;
	
	
	public Planeta() {
		super();
	}	

	public Planeta(double distanciaSol, boolean orbitaSol, boolean tieneSatelites) {
		this.distanciaSol = distanciaSol;
		this.orbitaAlSol = orbitaSol;
		this.tieneSatelites = tieneSatelites;
	}
	
	
	public ArrayList<Satelite> getSatelites() {
		return satelites;
	}

	public void setSatelites(ArrayList<Satelite> satelites) {
		this.satelites = satelites;
	}

	public double getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(double distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public boolean getOrbitaSol() {
		return orbitaAlSol;
	}

	public void setOrbitaSol(boolean orbitaSol) {
		this.orbitaAlSol = orbitaSol;
	}

	public boolean isTieneSatelites() {
		return tieneSatelites;
	}

	public void setTieneSatelites(boolean tieneSatelites) {
		this.tieneSatelites = tieneSatelites;
	}

	@Override
	public void muestra() {
	
	}	
}

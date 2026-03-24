package ejercicio;

import java.util.ArrayList;

public class Planeta extends Astro {

	private double	distanciaSol;
	private boolean	orbitaAlSol;
	private boolean	tieneSatelites;
	public	ArrayList<Satelite> lstSatelites;
	
	
	public Planeta() {
		super();
	}	

	public Planeta(double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad,
			String nombre, double distanciaSol, boolean orbitaSol, boolean tieneSatelites, ArrayList<Satelite> satelites) {
		super(radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad, nombre);
		this.distanciaSol = distanciaSol;
		this.orbitaAlSol = orbitaSol;
		this.tieneSatelites = tieneSatelites;
		lstSatelites = satelites;
	}
	
	
	public ArrayList<Satelite> getSatelites() {
		return lstSatelites;
	}

	public void setSatelites(ArrayList<Satelite> satelites) {
		this.lstSatelites = satelites;
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
		System.out.println(toString());
	}

	@Override
	public String toString() {
		
		String datos = "";
		String satelites = "";
		
		if (tieneSatelites) {
			for (int i = 0; i < this.lstSatelites.size(); i++) {
				satelites += this.lstSatelites.get(i).toString();
			}
			datos = String.format("Datos genéricos planeta->\n    %s    Datos específicos planeta:\n\t- DistanciaSol = %s\n\t- OrbitaAlSol = %s\n\t- TieneSatelites = %s\n\t- Sus satelites = \n%s\n",
					super.toString(), distanciaSol, orbitaAlSol, tieneSatelites, satelites);
		}
		else {
			datos = String.format("Datos genéricos planeta->\n    %s    Datos específicos planeta:\n\t- DistanciaSol = %s\n\t- OrbitaAlSol = %s\n\t- No tiene satélites\n\n",
					super.toString(), distanciaSol, orbitaAlSol);
		}

		return (datos);
	}
	
	
}

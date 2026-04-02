package controlador;

import vista.VntPrincipal;

public class AbrirLightRoom {

	public static void main(String[] args) {
		try {
			VntPrincipal frame = new VntPrincipal();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

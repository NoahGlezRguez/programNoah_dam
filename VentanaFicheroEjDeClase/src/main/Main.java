package main;

public class Main {

	public static void main(String[] args) {
		
		try {
			VentanaFormularioFichero frame = new VentanaFormularioFichero();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

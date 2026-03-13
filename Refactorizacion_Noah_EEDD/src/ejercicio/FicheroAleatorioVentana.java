package ejercicio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFrame;

public class FicheroAleatorioVentana {

	public static void main(String[] args) throws IOException {

		JFrame ventanaDep = new JFrame("DEPARTAMENTOS.");

		// Nos aseguramos que el fichero exista para evitar posibles errores
		File fichero = new File("AleatorioDep.dat");

		RandomAccessFile archivo;
		archivo = new RandomAccessFile(fichero, "rw");
		archivo.close();

		VentanaDepartamento ventanaDepart = new VentanaDepartamento(ventanaDep);
		ventanaDepart.setVisible(true);
	}
}

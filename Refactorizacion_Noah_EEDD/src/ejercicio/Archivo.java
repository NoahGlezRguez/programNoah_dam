package ejercicio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Archivo {

	private static final int ANCHO_LINEA = 44;
	private static final int ANCHO_CAMPO = 10;
	
	private File fichero;
	private RandomAccessFile archivo;
	

	public Archivo() {
		
	}
	
	public RandomAccessFile abrir() {
		
		String ruta = "AleatorioDep.dat";
		
		fichero = new File(ruta);
		try {
			archivo = new RandomAccessFile(fichero, "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return (archivo);
	}
	
	public void cerrar() {
		try {
			archivo.close();
		} catch (IOException errorCerrar) {
			errorCerrar.printStackTrace();
		}
	}
	
	public void borrarRegistro(int numDep) {
		
		try {
			archivo.seek(ANCHO_LINEA * (numDep - 1));
			archivo.writeInt(0);
			archivo.writeChars(" ".repeat(ANCHO_CAMPO * 2));
			
		} catch (IOException e) {
			System.out.println("ERRROR AL BORRAR AleatorioDep.dat");
			e.printStackTrace();
		}
	}
	
	public void modificarRegistro(int numDep, String nomDep, String localiDep, boolean esInsertar) {
		try {
			archivo.seek(ANCHO_LINEA * (numDep - 1));
			modificarCampo(numDep);
			modificarCampo(nomDep);
			modificarCampo(localiDep);
			
		} catch (IOException e) {
			if (esInsertar) {
				System.out.println("ERRROR AL grabar AleatorioDep.dat");
			}
			else {
				System.out.println("ERRROR AL MODIFICAR AleatorioDep.dat");
			}
			e.printStackTrace();
		}
	}
	
	private void modificarCampo(int numDep) throws IOException {
		archivo.writeInt(numDep);
	}
	
	private void modificarCampo(String campo) throws IOException {
		StringBuffer buffer = null;
		
		if (campo == null) {
			campo = " ".repeat(ANCHO_CAMPO);
		}
		buffer = new StringBuffer(campo);
		buffer.setLength(ANCHO_CAMPO);
		archivo.writeChars(buffer.toString());
	}
	
	
	public String recogerCampo() {
		
		String dato = "";
		
		try {
			for (int i = 0; i < ANCHO_CAMPO; i++) {
				dato += archivo.readChar();
			}
			return (dato);
		} catch (IOException e) {
			System.out.println("ERROR AL LEER AleatorioDep.dat");
			e.printStackTrace();
		}
		return (dato);
	}

	
	public RandomAccessFile getArchivo() {
		return (archivo);
	}

}

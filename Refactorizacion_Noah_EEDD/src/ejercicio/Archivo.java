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
	
	private RandomAccessFile abrir() throws FileNotFoundException {
		
		String ruta = "AleatorioDep.dat";
		
		fichero = new File(ruta);
		archivo = new RandomAccessFile(fichero, "rw");
		
		return (archivo);
	}
	
	public void borrarRegistro(int numDep) {
		
		try {
			archivo = abrir();
			archivo.seek(ANCHO_LINEA * (numDep - 1));
			archivo.writeInt(0);
			archivo.writeChars(" ".repeat(ANCHO_CAMPO * 2));
			archivo.close();
			
		} catch (IOException e) {
			System.out.println("ERRROR AL BORRAR AleatorioDep.dat");
			e.printStackTrace();
		}
	}
	
	public void modificarRegistro(int numDep, String nomDep, String localiDep, boolean esInsertar) {
		try {
			archivo = abrir();
			archivo.seek(ANCHO_LINEA * (numDep - 1));
			modificarCampo(numDep);
			modificarCampo(nomDep);
			modificarCampo(localiDep);
			archivo.close();
			
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
	
	public void mostrarRegistro(int numDep) {
		try {
			archivo = abrir();
			archivo.seek(ANCHO_LINEA * (numDep - 1));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	
	public RandomAccessFile prepararArchivo(int numDep) {
		try {
			archivo = abrir();
			archivo.seek(ANCHO_LINEA * (numDep - 1));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (archivo);
	}
	
//	private void mostrarError(int indice) {
//		
//		String[] errores = {"ERRROR AL MODIFICAR AleatorioDep.dat", "ERRROR AL grabar AleatorioDep.dat", "ERROR AL LEER AleatorioDep.dat"};
//		
//		System.out.println(errores[indice]);
//	}
}

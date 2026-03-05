package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroConfiguracion {
	private static final String RUTA_FICHERO_CONFIGURACION = "recursos/config.propiedades";
	private File ficheroConfiguracion;
	private String strUrl = "";
	private String strIp = "";
	private String strPort = "";
	private String strUser = "";
	private String strClave = "";		// Clave encriptada con MD5. La encriptacion no se realiza en esta clase.
	

	public FicheroConfiguracion() {
		// Cargamos el fichero de configuración
		ficheroConfiguracion = new File(RUTA_FICHERO_CONFIGURACION);
	}
	
	/**
	 * carga en la variables de la clase el contenido del fichero de configuración
	 * @return
	 * @throws IOException
	 */
	public boolean leerFichero() throws IOException {
		BufferedReader bfLector = new BufferedReader(new FileReader(ficheroConfiguracion));
		
		String linea;
		while( ( linea = bfLector.readLine()) != null ) {
			if( linea.startsWith("url=")) {
				strUrl = linea.substring(4);
			}
			else if( linea.startsWith("port=")) {
				strPort = linea.substring(5);
			}
			else if( linea.startsWith("ip=")) {
				strIp = linea.substring(3);
			}
			else if( linea.startsWith("user=")) {
				strUser = linea.substring(5);
			}
			else if( linea.startsWith("password=")) {
				strClave = linea.substring(9);
			}
		}
		
		bfLector.close();
		
		return true;
		
	}
	
	/**
	 * Recuperamos los campos de la clase, y componemos el texto que va al fichero.
	 * @return
	 * @throws IOException
	 */
	public boolean escribirFichero( String textoArea) throws IOException {
		BufferedWriter bfEscritor = new BufferedWriter( new FileWriter(ficheroConfiguracion, false));
		String texto;
		
		if( textoArea != "") {

			// Cuando pasamos todo el texto del fichero de configuración
			texto = textoArea;
		}
		else {
			// Cuando pasamos los campos uno a uno
			// Utilizamos la función de recuperar los campos para guardar el fichero
			texto = this.toStringArea();	
		}
		
		bfEscritor.write(texto);
						System.out.println("Escribo esto : \n" + texto);
		bfEscritor.flush();
		bfEscritor.close();
		
		return true;
		
	}
	
	// ------------------------------------------------------------
	// ---------------- Getters   y  Setters  ---------------------
	// ------------------------------------------------------------
	public String getStrUrl() {
		return strUrl;
	}

	public void setStrUrl(String strUrl) {
		this.strUrl = strUrl;
	}

	public String getStrIp() {
		return strIp;
	}

	public void setStrIp(String strIp) {
		this.strIp = strIp;
	}

	public String getStrPort() {
		return strPort;
	}

	public void setStrPort(String strPort) {
		this.strPort = strPort;
	}

	public String getStrUser() {
		return strUser;
	}

	public void setStrUser(String strUser) {
		this.strUser = strUser;
	}

	public String getStrClave() {
		return strClave;
	}

	public void setStrClave(String strClave) {
		this.strClave = strClave;
	}

	@Override
	public String toString() {
		return "FicheroConfiguracion [strUrl=" + strUrl + ", strIp=" + strIp + ", strPort=" + strPort + ", strUser="
				+ strUser + ", strClave=" + strClave + "]";
	}
	
	public String toStringArea() {
		return "url=" + strUrl + "\n" 
				+ "ip=" + strIp + "\n"
				+ "port=" + strPort + "\n"
				+ "user=" + strUser + "\n"
				+ "password=" + strClave + "\n";
	}

	
}

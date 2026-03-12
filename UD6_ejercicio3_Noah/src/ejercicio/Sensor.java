package ejercicio;

import java.util.Random;

public class Sensor {

	private int valorActual;
	
	public Sensor() {
		
	}
	
	public int getValorActual() {
		cambiarValor();
		return (valorActual);
	}
	
	private void cambiarValor() {
		
		Random randomNum = new Random();
		
		valorActual = randomNum.nextInt(101);
		
	}
}

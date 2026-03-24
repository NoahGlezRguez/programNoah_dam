package ejercicio;

public class Acumulador implements Modificable{

	private int valor;
	
	public Acumulador(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public void incremento(int valor) {
		this.valor += valor;
	}
	
}

package ejercicio;

public class Alarma {

	private int umbral = 50;
	private Timbre sonidoAlarma = new Timbre();
	protected Sensor sensorAlarma;
	
	public Alarma(Sensor sensorX) {
		sensorAlarma = sensorX;
	}
	
	public int getUmbral() {
		return (umbral);
	}
	
	public void comprobar() {
		
		int valorActual = sensorAlarma.getValorActual();
		
		if (valorActual < umbral) {
			System.out.printf("No se supera el umbral de %d porque está por %d...\n", umbral, valorActual);
			sonidoAlarma.desactivar();
		}
		else {
			System.out.printf("Se supera el umbral de %d porque está por %d...\n", umbral, valorActual);

			sonidoAlarma.activar();
		}
	}
}

package ejercicio;

public class AlarmaLuminosa extends Alarma {
	
	private Luz lucecitaDeSocorro = new Luz();
	
	public AlarmaLuminosa(Sensor sensorAlarma) {
		super(sensorAlarma);
	}

	public void comprobar() {
		
		int valorActual = sensorAlarma.getValorActual();
		int umbral = getUmbral();
		
		if (valorActual >= getUmbral()) {
			System.out.printf("No se supera el umbral de %d porque está por %d...\n", umbral, valorActual);
			lucecitaDeSocorro.encender();
		}
		else {
			System.out.printf("Se supera el umbral de %d porque está por %d...\n", umbral, valorActual);

			lucecitaDeSocorro.apagar();
		}
	}
	
}

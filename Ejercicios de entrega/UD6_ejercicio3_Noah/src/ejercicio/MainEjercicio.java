package ejercicio;

public class MainEjercicio {

	public static void main(String[] args) {
		
		Sensor sensorDucha = new Sensor();
		
		Alarma alarma1 = new Alarma(sensorDucha);
		AlarmaLuminosa alarma2 = new AlarmaLuminosa(sensorDucha);

		alarma1.comprobar();
		alarma2.comprobar();
	}

}

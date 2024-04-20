package threads;


class Devs4jThread extends Thread {

	public Devs4jThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("Hilo %s indice %d \n", getName(), i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
	}

}

public class ConstruccionDeHilos {
	public static void main(String[] args) {
		Devs4jThread d = new Devs4jThread("Hilo 1");
		Devs4jThread d2 = new Devs4jThread("Hilo 2");
		
		d.start();
		d2.start();
	}
}

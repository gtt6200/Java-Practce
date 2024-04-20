package threads;

class Counter implements Runnable {

	private int valor;

	public Counter(int valor) {
		super();
		this.valor = valor;
	}
	@Override
	public void run() {
		System.out.printf("Estado %s \n", Thread.currentThread().getState());
		for (int i = valor; i>=0; i--) {
			System.out.printf("%s Valor %d \n",Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}
	}
	
}

public class DevsCounter {
	public static void main(String[] args) throws InterruptedException {
		Thread hilo = new Thread(new Counter(5));
		System.out.printf("Estado %s \n", hilo.getState());
		hilo.start();
		hilo.join();
		
		System.out.printf("Estado %s \n", hilo.getState());

	}
}

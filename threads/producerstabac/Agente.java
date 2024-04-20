package threads.producerstabac;

import java.util.Random;

public class Agente extends Thread{
	private Random r = new Random();
	private Mesa mesa;
	public Agente(Mesa mesa) {
		this.mesa = mesa;
	}
	@Override
	public void run() {
	
		while (true) {
			int ingre = r.nextInt(3);
			try {
				Thread.sleep(300);
				mesa.newIngredients(ingre);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

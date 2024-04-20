package threads.producerstabac;

public class Mesa {
/*
 * 0 - Tabaco   1 - Papel, 2 - Cerillos
 * 
 * el agente pone los dos ingredientes distintos al ingrediente en la mesa
 * CONDICIONES: El agente no puede poner los ingredientes en la mesa hasta que el fumador
 * haya terminado de fumar
 * 
 * */
	
	private boolean isSmoke = false;
	private boolean isIngreAvaible= false;
	private int ingre;
	
	public synchronized void newIngredients (int ingre) throws InterruptedException {
		 while (isIngreAvaible || isSmoke) {
			 wait();
		 }
		 this.ingre = ingre;
		 isIngreAvaible= true;
		 System.out.printf("El agente no pone ingredeinte %d \n", ingre);
		 notifyAll();
	}
	
	/*
	 * El fumador id quiere fumar
	 * CONDICIONES:  el fumador no puede fumar hasta que lso ingredientes que 
	 * le faltan no estén sobre la mesa
	 * */
	
	public synchronized void wantSmoke (int id) throws InterruptedException {
		while(!isIngreAvaible || isSmoke || ingre!= id) {
			wait();
		}
		System.out.printf("Fumador %s empieza a fumar \n", id);
		isIngreAvaible= false;
		isSmoke = true;
		
	}
	// El fumador ha terminado de Fumar
	public synchronized void endSomke(int id) {
		isSmoke = false;
		System.out.printf("Fumador %d termina de fumar \n", id);
		notifyAll();

		
	}
}

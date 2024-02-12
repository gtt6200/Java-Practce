package polimorfismo.figuras;

public class PruebaDibujale {

	void probarDibujar(Dibujable dibujable) {
		dibujable.dibujar();
	}
	
	public static void main(String[] args) {
		PruebaDibujale p = new PruebaDibujale();
		p.probarDibujar(new Circulo("verde", 10.5));
		p.probarDibujar(new Rectangulo("azul", 5, 10));
		p.probarDibujar(new Imagen());
	}

}

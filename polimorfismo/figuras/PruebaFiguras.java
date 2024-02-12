package polimorfismo.figuras;

public class PruebaFiguras {
	
	void imprimirArea(Figura figura) {
		System.out.println("El color de la figura es: " + figura.getColor() + " y tiene un area de: " + figura.calcularArea());
	}
	
	public static void main(String[] args) {
		PruebaFiguras p = new PruebaFiguras();
		
		p.imprimirArea(new Circulo("verde", 10.0));
		p.imprimirArea(new Cuadro("azul", 12.5));
		p.imprimirArea(new Rectangulo("amarillo", 12.5, 6));
	}

}

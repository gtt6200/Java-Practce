package polimorfismo.vehiculo;

public class Vehiculo {
	private String noSerie;
	private String modelo;
	private int anio;
	private boolean isOn;

	public String getNoSerie() {
		return noSerie;
	}

	public void setNoSerie(String noSerie) {
		this.noSerie = noSerie;
	}

	public String getModelo() {
		System.out.println(modelo);
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		System.out.println(anio);
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public Vehiculo(String modelo, int anio) {
		this.modelo = modelo;
		this.anio = anio;
	}

	public Vehiculo(String modelo, int anio, boolean isOn) {
		this.modelo = modelo;
		this.anio = anio;
		this.isOn = isOn;
	}
	public Vehiculo(boolean isOn) {
		this.isOn = isOn;
	}
	public boolean enciende(boolean isOn) {
		Vehiculo v = new Vehiculo(isOn);
		isOn = v.isOn;
		System.out.println("El vehículo enciende" + isOn);
		return isOn;
	}

}

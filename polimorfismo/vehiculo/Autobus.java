package polimorfismo.vehiculo;

public class Autobus extends Vehiculo implements Movible{

	private String motor;
	private int ejes;
	private int noPasajeros;
	private boolean isOn;

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public int getNoPasajeros() {
		return noPasajeros;
	}

	public void setNoPasajeros(int noPasajeros) {
		this.noPasajeros = noPasajeros;
	}

	public Autobus(String modelo, int anio, String motor, int ejes, int noPasajeros, boolean isOn) {
		super(modelo, anio);
		this.isOn = isOn;
		this.motor = motor;
		this.ejes = ejes;
		this.noPasajeros = noPasajeros;
	}
	
	public void addPassengers(int noPasajeros) {
		System.out.println("Van " + noPasajeros + " cantidad de pasajeros");
	}
	
	public void removePassengers(int pasajeros) {
		System.out.println("Van " + pasajeros + " cantidad de pasajeros");
	}
	
	public void openDoors() {
		System.out.println("Abrió las puertas");
	}
	public void closeDoors() {
		System.out.println("Cerro las puertas");
	}
	public void viajar(boolean prende) {
		Vehiculo e = new Vehiculo(prende);
		if(e.enciende(prende) == true) {
			System.out.println("El vehículo puede viajar");
			avanzar();
			frenar();
		}else {
			System.out.println("El vehículo no puede viajar");
			mantenimiento();
		}
	}
	
	private void mantenimiento() {
		System.out.println("Esta en mantenimiento");
	}

	@Override
    public void avanzar() {
        System.out.println("El autobús avanza lentamente.");
    }

    @Override
    public void frenar() {
        System.out.println("El autobús frena con fuerza.");
    }
	
	

}

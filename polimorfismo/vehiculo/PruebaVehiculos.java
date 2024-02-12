package polimorfismo.vehiculo;

public class PruebaVehiculos {

	void probarVehiculos(Vehiculo v, boolean isOn) {
		v.enciende(isOn);
	}

	public static void main(String[] args) {
		PruebaVehiculos pv = new PruebaVehiculos();
		Autobus bus = new Autobus("Irizar I8", 2017, "Serie K", 3, 46, false);
		Vehiculo v = new Autobus(bus.getModelo(),bus.getAnio(),bus.getMotor(),bus.getEjes(), bus.getNoPasajeros(), bus.isOn());
		pv.probarVehiculos(v, v.isOn());
		bus.viajar(v.isOn());
		bus.openDoors();
		bus.addPassengers(12);
		bus.removePassengers(2);
		bus.closeDoors();
		
		Automovil car = new Automovil("Ferrari", 1995, 2, 17, 6, true);
		Vehiculo vCar = new Automovil(car.getModelo(), car.getAnio(), car.getPuertas(), car.getRodada(), car.getBolsasDeAire(), car.isABS());
		pv.probarVehiculos(vCar, true);
		car.encenderAireAcondicionado();
		car.apagarAireAcondicionado();
		car.avanzar();
	}

}

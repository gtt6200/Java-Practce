package polimorfismo.vehiculo;

public class Automovil extends Vehiculo implements Movible{
	private int puertas;
	private int rodada;
	private int bolsasDeAire;
	private boolean isABS;

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	public int getBolsasDeAire() {
		return bolsasDeAire;
	}

	public void setBolsasDeAire(int bolsasDeAire) {
		this.bolsasDeAire = bolsasDeAire;
	}

	public boolean isABS() {
		return isABS;
	}

	public void setABS(boolean isABS) {
		this.isABS = isABS;
	}

	public Automovil(boolean isOn, int puertas, int rodada, int bolsasDeAire, boolean isABS) {
		super(isOn);
		this.puertas = puertas;
		this.rodada = rodada;
		this.bolsasDeAire = bolsasDeAire;
		this.isABS = isABS;
	}

	@Override
	public boolean enciende(boolean isOn) {
		// TODO Apéndice de método generado automáticamente
		return super.enciende(isOn);
	}

	public Automovil(String modelo, int anio, int puertas, int rodada, int bolsasDeAire, boolean isABS) {
		super(modelo, anio);
		this.puertas = puertas;
		this.rodada = rodada;
		this.bolsasDeAire = bolsasDeAire;
		this.isABS = isABS;
	}
	public void encenderAireAcondicionado(){
		System.out.println("El AC está prendido");
	}
	public void apagarAireAcondicionado(){
		System.out.println("El AC está apagado");
	}
	
	@Override
    public void avanzar() {
        System.out.println("El automóvil avanza a gran velocidad.");
    }

    @Override
    public void frenar() {
        System.out.println("El automóvil frena suavemente.");
    }


}

package TarjetaBancaria;

public abstract class Tarjeta {
	private static int numeroTarjetas= 0;
	
	protected Persona titular;
	protected int numTarjeta;
	protected Cuenta cuenta;
	
	public Tarjeta(){
		this.titular= new Persona();
		this.numTarjeta = 1000000 + numeroTarjetas++;
		this.cuenta = new Cuenta();
	}
	
	public Tarjeta(Persona titular, Cuenta cuenta){
		this.titular= titular;
		this.cuenta=cuenta;
	}
	
	public void setTitular(Persona titular){
		this.titular=titular;
	}
	
	public String getTitular(){
		return titular.getnombre();
	}
	
	public int getNumerTarjeta(){
		return this.numTarjeta;
	}

}

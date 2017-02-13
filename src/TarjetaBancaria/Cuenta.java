package TarjetaBancaria;

public class Cuenta {
	private static int numeroCuentas= 0;
	
	private Persona titular;
	private int numCuenta;
	private double saldo;
	
	
	public Cuenta(){
		this.titular= new Persona();
		this.numCuenta = 1000000 + numeroCuentas++;
		this.saldo=0;
	}
	
	public Cuenta(Persona titular, double saldo){
		this.titular = titular;
		this.numCuenta = 1000000 + numeroCuentas++;
		this.saldo=saldo;
	}
	
	public void setTitular(Persona titular){
		this.titular=titular;
	}
	
	public void setSaldo(double saldo){
		this.saldo=saldo;
	}
	
	public String getTitular(){
		return titular.getnombre();
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumerCuenta(){
		return this.numCuenta;
	}
	
	
	public void ingresar(double saldo){
		this.saldo+=saldo;
	}
	
	public void retirar(double cantidad){
		this.saldo-=cantidad;
		}
	
}

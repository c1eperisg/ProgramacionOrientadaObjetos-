package CuentBancaria;

import NIF.NIF;

public class Cuenta {

	private int numCuenta;
	private NIF DNI;
	private double saldo;
	private double intAnual;
	public int contCuenta= 0;
	
	public Cuenta(){
		this.numCuenta= 100001+contCuenta;
		contCuenta++;
		this.DNI=new NIF();
		this.saldo=0.0;
		this.intAnual=0.0;
		
	}
	
	public Cuenta(double saldo,int DNI, double intAnual){
		this.numCuenta=contCuenta;
		contCuenta++;
		this.DNI=new NIF(DNI);
		this.saldo=saldo;
		this.intAnual=intAnual;
	}
	
	public void setDNI(int num){
		this.DNI=new NIF(num);
	}
	public void setsaldo(int num){
		this.saldo=num;
	}
	public void setintAnual(int num){
		this.intAnual=num;
	}
	public int getnumCuenta(){
		return this.numCuenta;
	}
	public int getDNI(){
		return this.DNI.getNIF();
	}
	public double getsaldo(){
		return this.saldo;
	}
	public double getintAnual(){
		return this.intAnual;
	}
	
	public void actualizarsaldo(){
		this.saldo=this.saldo + (this.intAnual/365)*this.saldo/100;
	}
	
	public void ingresar(double cantidad){
		this.saldo=this.saldo+cantidad;
	}
	public void retirar(double cantidad){
		this.saldo=this.saldo-cantidad;
	}
	
	public String toString(){
		return "El numero de la cuenta es: " + numCuenta + "\n" + 
				"El DNI es: " + DNI + "\n" + 
				"El saldo actual es es: " + numCuenta + "\n" + 
				"El interes anual es de: " + numCuenta + "%\n";
	}
}


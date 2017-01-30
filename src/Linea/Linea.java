package Linea;

import Complejo.Complejo;

public class Linea {
	
	private Complejo puntoA;
	private Complejo puntoB;
	
	private void linea(){
		this.puntoA= new Complejo(0.0f,0.0f);
		this.puntoB= new Complejo(0.0f,0.0f);
	}
	
	private void linea(Complejo puntoA, Complejo puntoB){
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	private void muevederecha(double derecha){
		System.out.print("Cuantas unidades quieres mover la linea hacia la derecha?");
		Complejo desplazar = new Complejo((float)derecha,0.0f);
		this.puntoA = this.puntoA.suma(desplazar);
		this.puntoB = this.puntoB.suma(desplazar);
	}
	private void mueveizquierda(double izquierda){
		System.out.print("Cuantas unidades quieres mover la linea hacia la izquierda?");
		Complejo desplazar = new Complejo((float)izquierda,0.0f);
		this.puntoA = this.puntoA.resta(desplazar);
		this.puntoB = this.puntoB.resta(desplazar);
	}
	private void muevedearriba(double arriba){
		System.out.print("Cuantas unidades quieres mover la linea hacia arriba?");
		Complejo desplazar = new Complejo(0.0f,(float)arriba);
		this.puntoA = this.puntoA.suma(desplazar);
		this.puntoB = this.puntoB.suma(desplazar);
	}
	private void abajo(double abajo){
		System.out.print("Cuantas unidades quieres mover la linea hacia abajo?");
		Complejo desplazar = new Complejo(0.0f,(float)abajo);
		this.puntoA = this.puntoA.resta(desplazar);
		this.puntoB = this.puntoB.resta(desplazar);
	}
	
	private void setpuntoA(Complejo puntoB){
		this.puntoA = puntoA;
	}
	private void setpuntoB(Complejo puntoB){
		this.puntoB = puntoB;
	}
	private Complejo getpuntoA(){
		return this.puntoA;
	}
	private Complejo getpuntoB(){
		return this.puntoB;
	}
	
	public String toString(){
		return "[(" + this.puntoA.getReal() +  "," + this.puntoA.getImaginaria() + "), (" + this.puntoB.getReal() +  "," + this.puntoB.getImaginaria() + ")]";
	}
	
}

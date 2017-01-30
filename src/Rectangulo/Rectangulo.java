package Rectangulo;

import Complejo.Complejo;

import java.util.Scanner;

public class Rectangulo {
		
	private Complejo verticeinfiz, verticeinfder, verticesupiz, verticesupder;
	
	public Rectangulo(){
		this.verticeinfiz= new Complejo(0.0f,0.0f);
		this.verticeinfder= new Complejo(0.0f,0.0f);
		this.verticesupiz= new Complejo(0.0f,0.0f);
		this.verticesupder= new Complejo(0.0f,0.0f);
	}
	
	public Rectangulo(Complejo verticeinfiz,Complejo verticeinfder,Complejo verticesupiz,Complejo verticesupder){
		this.verticeinfiz= new Complejo(0.0f,0.0f);
		this.verticeinfder= new Complejo(0.0f,0.0f);
		this.verticesupiz= new Complejo(0.0f,0.0f);
		this.verticesupder= new Complejo(0.0f,0.0f);
	}
	
	public Rectangulo(float base, float altura){
		this.verticeinfiz= new Complejo(0.0f,0.0f);
		this.verticeinfder= new Complejo(0.0f,altura);
		this.verticesupiz= new Complejo(base,0.0f);
		this.verticesupder= new Complejo(base,altura);
	}
	
	public float superficie(float base, float altura){
		float area;
		area= base *altura;
		return area;
	}
	
	public float superficie(){
		float area;
		area= verticesupder.getReal()*verticesupder.getImaginaria();
		return area;
	}
	
	public void desplazar(){
			tester e = new tester();
			System.out.print("Cuantas unidades quieres mover el rectangulo en cada dirección");
			Complejo desplazar = new Complejo(e.obtenerFloat("En el eje x?"),(e.obtenerFloat("Y el eje y?")));
			
			this.verticeinfiz=this.verticeinfiz.suma(desplazar);
			this.verticeinfder=this.verticeinfder.suma(desplazar);
			this.verticesupiz=this.verticesupiz.suma(desplazar);
			this.verticesupder=this.verticesupder.suma(desplazar);

	}
}

package Racional;

import java.util.Scanner;

public class Racional {

	private float numerador;
	private float denominador;
	private Scanner scan = new Scanner(System.in);
		
	public void setnumerador(float numerador){
		this.numerador=numerador;
	}
	
	public void setdenominador(float denominador){
		this.denominador=denominador;
	}
	
	public float getnumerador(){
		return numerador;
	}
	
	public float getdenominador(){
		return denominador;
	}
	
	public Racional(float parteReal,float ParteImaginaria){
		this.numerador= numerador;
		this.denominador= denominador;
	}
	
	public Racional(){
		this.numerador= 0.0f;
		this.denominador= 0.0f;
	}
	
	public Racional suma(Racional num){
		float resultadoNum, resultadoDen;
		
		resultadoNum= (this.numerador*num.getdenominador())+(num.getnumerador()*this.denominador);
		resultadoDen= this.denominador*num.getdenominador();
		
		return new Racional(resultadoNum, resultadoDen);
	}
	
	public Racional resta(Racional num){
		float resultadoNum, resultadoDen;
		
		resultadoNum= (this.numerador*num.getdenominador())-(num.getnumerador()*this.denominador);
		resultadoDen= this.denominador*num.getdenominador();
		
		return new Racional(resultadoNum, resultadoDen);
	}
	public Racional multiplicacion(Racional num){
		float resultadoNum, resultadoDen;
		
		resultadoNum= this.numerador*num.getnumerador();
		resultadoDen= this.denominador*num.getdenominador();
		
		return new Racional(resultadoNum, resultadoDen);
	}
	public Racional division(Racional num){
		float resultadoNum, resultadoDen;
		
		resultadoNum= this.numerador*num.getdenominador();
		resultadoDen= this.denominador*num.getnumerador();
		
		return new Racional(resultadoNum, resultadoDen);
	}
	
	public Racional comparacion(Racional num){
		float resultadoNum, resultadoDen;
		
		if(this.numerador*num.getdenominador()>num.getnumerador()*this.denominador){
			resultadoNum=this.numerador;
			resultadoDen=this.denominador;
		}else if(this.numerador*num.getdenominador()<num.getnumerador()*this.denominador){
			resultadoNum=num.getnumerador();
			resultadoDen=num.getdenominador();
		}else{
			resultadoNum=this.numerador;
			resultadoDen=this.denominador;
		}
		return new Racional(resultadoNum, resultadoDen);
	}
	
	public Racional copiar(Racional num){
		return new Racional(num.getnumerador(),num.getdenominador());
	}
	
	public void leer(){
		System.out.println("Introduce el numerador");
		setnumerador(scan.nextFloat());
		System.out.println("Introduce el denominador");
		setdenominador(scan.nextFloat());
	}
	
	public void print(){
		System.out.println(getnumerador() + "/" + getdenominador());
	}
}

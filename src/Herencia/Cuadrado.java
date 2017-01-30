package Herencia;

public class Cuadrado extends Figura{
	
	private double lado;
	
	public Cuadrado(double b){
		
		lado = b;
		
		//Atributo Figura
		numeroDeLados = 4;
		
		//Variable global
		numeroDeFiguras++;
		
	}
	public double area(){
		return lado*2;
	}

	
	public String toString(){
		return "Valores del Cuadrado:\n" + 
				"------------------------\n" +
			   "Lado = " + lado + "\n" + 
			   "Area = " + area() + "\n" +
			   "Perimetro = " + perimetro() + "\n" + 
			   "Numero de Lados = " + numeroDeLados + "\n" +
			   "Figuras Totales = " + numeroDeFiguras;
	}
}

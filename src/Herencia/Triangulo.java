package Herencia;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;
	
	public Triangulo(double b, double a){
		
		base = b;
		altura = a;
		
		//Atributo Fgura
		numeroDeLados = 3;
		
		//Variable global
		numeroDeFiguras++;
		
	}
	public double area(){
		return base*altura/2;
	}
	
	public String toString(){
		return "Valores del Triangulo:\n" + 
			   "------------------------" +
			   "Base = " + base + "\n" + 
			   "Altura = " + altura + "\n" + 
			   "Area = " + area() + "\n" +
			   "Numero de Lados = " + numeroDeLados + "\n" +
			   "Figuras Totales = " + numeroDeFiguras;
	}
}

package Herencia;

public class Rectangulo extends Figura{

	private double base;
	private double altura;
	
	public Rectangulo(double b, double a){
		
		base = b;
		altura = a;
		
		//Atributo Fgura
		numeroDeLados = 4;
		
		//Variable global
		numeroDeFiguras++;
		
	}
	public double perimetro(){
		return base*2+altura*2;
	}
	
	public double area(){
		return base*altura;
	}
	
	public String toString(){
		return "Valores del Triangulo:\n" + 
			   "------------------------" +
			   "Base = " + base + "\n" + 
			   "Altura = " + altura + "\n" + 
			   "Area = " + area() + "\n" +
			   "Perimetro = " + perimetro() + "\n" +
			   "Numero de Lados = " + numeroDeLados + "\n" +
			   "Figuras Totales = " + numeroDeFiguras;
	}
}

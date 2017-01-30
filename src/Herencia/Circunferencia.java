package Herencia;

public class Circunferencia extends Figura{
	
	private double radio;
	
	public Circunferencia(double r){
		
		radio = r;
		
		//Atributo Figura
		numeroDeLados = 1;
		
		//Variable global
		numeroDeFiguras++;
		
	}
	public double perimetro(){
		return 2*3.14*radio;
	}
	
	public double area(){
		return 3.14*radio*radio;
	}
	
	public String toString(){
		return "Valores del Rectangulo:\n" + 
			   "------------------------\n" +
			   "Radio = " + radio + "\n" + 
			   "Area = " + area() + "\n" +
			   "Perimetro = " + perimetro() + "\n" +
			   "Numero de Lados = " + numeroDeLados + "\n" +
			   "Figuras Totales = " + numeroDeFiguras;
	}
}

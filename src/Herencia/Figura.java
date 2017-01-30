package Herencia;

public abstract class Figura {
	protected static int numeroDeFiguras = 0;
	protected int numeroDeLados;
	public float perimetro;
	protected double lado;
	
	abstract protected double area();
	
	protected double perimetro(){
		return numeroDeLados*lado;
	}
}

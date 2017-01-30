package Herencia;
import miLibreria.tester;

public class EjemploHerencia {
	public static void main(String[] args){
		
		tester e = new tester();
		Cuadrado cuadrado;
		Triangulo triangulo;
		
		System.out.print("\nIntroduccion de los datos del Triangulo\n");
		triangulo = new Triangulo(e.obtenerFloat("Introduce la base"),e.obtenerFloat("Introduce la altura"));
		
		System.out.println(triangulo.toString());
		
		System.out.print("\nIntroduccion de los datos del Cuadrado\n");
		cuadrado = new Cuadrado(e.obtenerFloat("Dame la longitud del lado"));
		
		System.out.println(cuadrado.toString());
		System.out.println();		
		System.out.println(triangulo.toString());

		
		
		
	}
}

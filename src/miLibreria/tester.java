package miLibreria;

import java.util.Scanner;

public class tester {
	
	private Scanner e = new Scanner(System.in);
	
	public int obtenerEntero(String msg){
		
		int numero=0;
		String teclado="";
		boolean error = true;
		
		do{
			System.out.println(msg);
			try{
				teclado = e.nextLine();
				numero = Integer.parseInt(teclado);
				error =false;
			}catch(Exception e){
				System.out.println("Debes introducir un numero sin decimales. Vuelve a intentarlo.");
			}
		}while(error);
		return numero;
	}
	public float obtenerFloat(String msg){
		float numero=0.0f;
		String teclado="";
		boolean error = true;
		
		do{
			System.out.println(msg);
			try{
				teclado = e.nextLine();
				numero = Float.parseFloat(teclado);
				error =false;
			}catch(Exception e){
				System.out.println("Debes introducir un numero. Vuelve a intentarlo.");
			}
		}while(error);
		return numero;
	}
	public String obtenerString(String msg){
		String teclado="";
		boolean error = true;
		
		do{
			System.out.println(msg);
			try{
				teclado = e.nextLine();
				error =false;
			}catch(Exception e){
				System.out.println("Debes introducir un String. Vuelve a intentarlo.");
			}
		}while(error);
		return teclado;
	}
	public char obtenerChar(String msg){
		String teclado="";
		boolean error = true;
		
		do{
			System.out.println(msg);
			try{
				teclado = e.nextLine();
				error =false;
			}catch(Exception e){
				System.out.println("Debes introducir una letra. Vuelve a intentarlo.");
			}
		}while(error);
		return teclado.charAt(0);
	}
}

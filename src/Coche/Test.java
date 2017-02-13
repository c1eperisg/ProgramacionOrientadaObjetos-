package Coche;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche = new Coche();
		
		System.out.println(coche.toString());
		
		coche.apagarCoche();
		coche.desinflarRuedasCoche();
		coche.cerrarPuertasCoche();
		coche.cerrarVentanasCoche();
		
		System.out.println(coche.toString());
	}

}

package Coche;

public class Coche {

	private Motor motor;
	private Rueda[] ruedas = new Rueda[4];
	private Puerta[] puertas = new Puerta[2];	
	
	public Coche(){
		this.motor=new Motor();
		for(int i=0;i<ruedas.length;i++){
			this.ruedas[i]= new Rueda();
		}
		for(int a=0;a<puertas.length;a++) {
			this.puertas[a]= new Puerta();
		}
	}
	
	public void encenderCoche(){
		this.motor.arrancarMotor();
	}
	public void apagarCoche(){
		this.motor.apagarMotor();
	}
	
	public void inflarRuedasCoche(){
		for(int i=0;i<ruedas.length;i++){
			this.ruedas[i].inflarRueda();
		}
	}
	public void desinflarRuedasCoche(){
		for(int i=0;i<ruedas.length;i++){
			this.ruedas[i].desinflarRueda();
		}
	}
	
	public void abrirVentanasCoche(){
			for(int a=0;a<puertas.length;a++){
				this.puertas[a].getVentana().abrirVentana();
			}
	}
	public void cerrarVentanasCoche(){
		for(int a=0;a<puertas.length;a++){
			this.puertas[a].getVentana().cerrarVentana();
		}
	}
	
	public void abrirPuertasCoche(){
		for(int i=0;i<puertas.length;i++){
			this.puertas[i].abrirPuerta();
		}
	}
	public void cerrarPuertasCoche(){
		for(int i=0;i<puertas.length;i++){
			this.puertas[i].cerrarPuerta();
		}
	}
	
	public String toString(){
		String cadena1 = motor.toString() + "\n";
		
		String cadena2 = "Las ruedas estan: ";
		for(int i=0;i<ruedas.length;i++){
			cadena2+= +(i+1) + ": " + ruedas[i].toString();
		}
		String cadena3 = "\nLas puertas estan: ";
		for(int a=0;a<puertas.length;a++){
			cadena3+= +(a+1) + ": " + puertas[a].toString();
		}
		return cadena1+cadena2+cadena3;
	}
}
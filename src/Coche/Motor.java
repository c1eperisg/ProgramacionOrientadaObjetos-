package Coche;

public class Motor {

	private boolean motor;
	
	public Motor(){
		this.motor=true;
	}
	
	public Motor(boolean estado){
		this.motor=estado;
	}
	public String getMotor(){
		String cadena;
		if( this.motor==true){
			cadena="encendido";
			return cadena;
		}else{
			cadena="apagado";
			return cadena;
		}
	}
	
	public void arrancarMotor(){
		this.motor=true;
	}
	
	public void apagarMotor(){
		this.motor=false;
	}
	
	public String toString(){
		String cadena = "El estado del motor es " + getMotor();
		return cadena;
	}
}

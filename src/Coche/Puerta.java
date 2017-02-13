package Coche;

public class Puerta {

	private boolean puerta;
	private Ventana ventana;
	
	public Puerta(){
		this.puerta=true;
		this.ventana = new Ventana();
	}
	
	public Puerta(boolean estado){
		this.puerta=estado;
		this.ventana = new Ventana(estado);
	}
	
	public String getPuerta(){
		String cadena;
		if( this.puerta==true){
			cadena="abierta";
			return cadena;
		}else{
			cadena="cerrada";
			return cadena;
		}
		
	}
	
	public Ventana getVentana(){
		return this.ventana;
	}
	
	public void abrirPuerta(){
		this.puerta=true;
	}
	
	public void cerrarPuerta(){
		this.puerta=false;
	}
	
	public String toString(){
		String cadena = getPuerta()+ " y la ventana " + getVentana() + "\n";
		return cadena;
	}
}

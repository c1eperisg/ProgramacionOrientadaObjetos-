package Coche;

public class Ventana {

	private boolean ventana;
	
	public Ventana(){
		this.ventana=true;
	}
	
	public Ventana(boolean estado){
		this.ventana=estado;
	}
	
	public String getVentana(){
		String cadena;
		if( this.ventana==true){
			cadena="abierta";
			return cadena;
		}else{
			cadena="cerrada";
			return cadena;
		}
	}
	
	public void abrirVentana(){
		this.ventana=true;
	}
	
	public void cerrarVentana(){
		this.ventana=false;
	}
	
	public String toString(){
		String cadena = getVentana();
		return cadena;
	}
}

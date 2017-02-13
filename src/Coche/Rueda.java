package Coche;

public class Rueda {
	
	private boolean rueda;
	
	public Rueda(){
		this.rueda=true;
	}
	
	public Rueda(boolean estado){
		this.rueda=estado;
	}
	
	public String getRueda(){
		String cadena;
		if( this.rueda==true){
			cadena="inflada";
			return cadena;
		}else{
			cadena="desinflada";
			return cadena;
		}
	}
	
	public void inflarRueda(){
		this.rueda=true;
	}
	
	public void desinflarRueda(){
		this.rueda=false;
	}
	
	public String toString(){
		String cadena = getRueda() + " ";
		return cadena;
	}
}

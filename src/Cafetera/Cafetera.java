package Cafetera;

public class Cafetera {
	
	private int capacidadMaxima;
	private int cantidadActual;
	
	private Cafetera(){
		this.cantidadActual=0;
		this.capacidadMaxima=1000;
	}
	
	private void CafeteraMax(){
		this.capacidadMaxima=1000;
		this.cantidadActual=this.capacidadMaxima;
		
	}
	
	private void Cafetera(int capacidadMaxima, int capacidadActual){
		if(capacidadActual>capacidadMaxima){
			this.capacidadMaxima=capacidadMaxima;
			this.cantidadActual=this.capacidadMaxima;
		}
	}
	
	private void setcantidadActual(int cantidadActual){
		this.cantidadActual=cantidadActual;
	}
	private void setcapacidadMaxima(int capacidadMaxima){
		this.cantidadActual=cantidadActual;
	}
	private int setcantidadActual(){
		return this.cantidadActual;
	}
	private int getcapacidadMaxima(){
		return this.cantidadActual;
	}
	
	private void llenarCafetera(){
			this.cantidadActual=this.capacidadMaxima;
	}
	
	private int servirTaza(int num){
		int cantidadVuelta=0;
		if(num>this.cantidadActual){
			cantidadVuelta=this.cantidadActual;
			this.cantidadActual=0;
			return cantidadVuelta;
		}else{
			this.cantidadActual=this.cantidadActual-num;
			return num;
		}
	}
	
	private void vaciarCafetera(){
		this.cantidadActual=0;
	}
	
	private void agregarCafe(int cantidadAñadida){
		this.cantidadActual=this.cantidadActual+cantidadAñadida;
	}
}

package EjerciciosHerencia;

public class Precio {
	protected double precio;
	
	public Precio(){
		precio=0;
	}
	
	public Precio(double precio){
		this.precio=precio;
	}
	
	public void setprecio(double precio){
		this.precio=precio;
	}
	
	public double getprecio(){
		return this.precio;
	}
	
}

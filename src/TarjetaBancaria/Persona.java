package TarjetaBancaria;

public class Persona {
	private String nombre;
	private String dni;
	
	public Persona(){
		nombre="";
	}
	
	public Persona(String nombre){
		this.nombre		= nombre;

	}
	public Persona(String nombre,int dni){
		this.nombre	 = nombre;
		this.dni	 = generaDNI(dni);

	}
	
	public String toString(){
		String cadena = "Nombre : " + this.nombre + ".\n" +  "\nDni : " + this.dni;
		return cadena;
	}
	
	public String generaDNI(int dni){
		String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
	
		return dni + letrasDNI[dni%23];
	}
	
	public String getnombre(){
		return nombre;
	}
	
	public void setnombre(String nombre){
		this.nombre	 = nombre;
	}
}

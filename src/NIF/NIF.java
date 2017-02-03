package NIF;

public class NIF {
	
	private int NIF;
	private String letra;
	
	public NIF(){
		this.NIF=0;
		this.letra=" ";
	}
	
	public NIF(int NIF){
		this.NIF=NIF;
		this.letra=leer();
	}
	
	public void setNIF(int NIF){
		this.NIF=NIF;
		this.letra=leer();
	}
	
	public int getNIF(){
		return this.NIF;
	}
	
	private String leer(){
		String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J"};
		return letras[this.NIF/23];
	}
	
	public String toString(){
		return "El DNI es: " + this.NIF + " - " + this.letra + ".\n";
	}
}

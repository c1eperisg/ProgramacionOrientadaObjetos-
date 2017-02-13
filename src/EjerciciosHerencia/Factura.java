package EjerciciosHerencia;

public class Factura extends Precio{
	protected String emisor;
	protected String cliente;
	
	public Factura(){
		emisor="";
		cliente="";
		precio=0;
	}
	
	public Factura(String emisor,String cliente,double precio){
		super(precio);
		this.emisor=emisor;
		this.cliente=cliente;
		
	}
	
	public void setemisor(String emisor){
		this.emisor=emisor;
	}
	public void setcliente(String cliente){
		this.cliente=cliente;
	}
	
	public String getemisor(){
		return this.emisor;
	}
	
	public String getcliente(){
		return this.cliente;
	}

	public String imprimirFactura(){
		return 	"El emisor es: " + getemisor() + ".\n" + 
				"El cliente es: " + getcliente() + ".\n" + 				"La factura es de: " + getprecio() + " euros.\n";
	}
}

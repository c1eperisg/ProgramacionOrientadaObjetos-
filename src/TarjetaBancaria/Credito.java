package TarjetaBancaria;

public class Credito extends Tarjeta{
	private int limiteCredito;
	
	public void pagoDebito(int cantidad){
		if(cantidad>this.cuenta.getSaldo()){
			System.out.println("No hay tanto dinero en esta cuenta, el saldo restante es de: " + this.cuenta.getSaldo());
		}else{
			this.cuenta.retirar(cantidad);;
		}
	}
}

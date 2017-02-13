package TarjetaBancaria;

import java.time.LocalDate;

public class Debito extends Tarjeta{
	private int cuota;
	private LocalDate anyo;
	
	this.anyo = '2017-12-31';
	
	public void pagoDebito(int cantidad){
		if(cantidad>this.cuenta.getSaldo()){
			System.out.println("No hay tanto dinero en esta cuenta, el saldo restante es de: " + this.cuenta.getSaldo());
		}else{
			this.cuenta.retirar(cantidad);;
		}
	}
	
	public void cuotaAnual(){
		if(cuota>this.cuenta.getSaldo()){
			System.out.println("La cuota supera el saldo actual, la tarjeta queda invalida");
			this.cuenta.retirar(this.cuenta.getSaldo());
		}else{
			this.cuenta.retirar(this.cuota);
		}
	}
}

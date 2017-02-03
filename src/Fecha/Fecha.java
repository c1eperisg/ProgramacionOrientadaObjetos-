package Fecha;

import java.util.GregorianCalendar;

import miLibreria.tester;

public class Fecha {
	private GregorianCalendar fecha;
	
	public Fecha(){
		fecha= new GregorianCalendar(1900,1,1);
	}
	
	public Fecha(int anyo, int mes, int dia){
		fecha= new GregorianCalendar(anyo,mes,dia);
	}
	
	public void leer(){
		tester e = new tester();
		this.fecha.set(e.obtenerEntero("\nPasame el anyo"),e.obtenerEntero("\nPasame el mes"),e.obtenerEntero("\nPasame el dia"));
	}
	
	public boolean esBisiesto(){
		return fecha.isLeapYear(this.fecha.YEAR);
	}
	
	public int diasMes(int mes){
		int[] diasMeses = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(mes==1){
			if(fecha.isLeapYear(this.fecha.YEAR)==true){
				return diasMeses[mes] + 1;
			}else{
				return diasMeses[mes];
			}
		}else{
			return diasMeses[mes];
		}
	}
	
	
 
}

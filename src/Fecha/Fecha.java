package Fecha;

import java.util.GregorianCalendar;
import java.time.*;

import miLibreria.tester;

public class Fecha {
	private GregorianCalendar fecha;
	private LocalDate fechaLocalDate;
	
	public Fecha(){
		fecha= new GregorianCalendar(1900,1,1);
	}
	
	public Fecha(int anyo, int mes, int dia){
		fecha= new GregorianCalendar(anyo,mes,dia);
	}
	
	public Fecha(int anyo, int mes, int dia){
		fecha = new LocalDate(anyo,mes,dia);
	}
	
	public void leer(){
		tester e = new tester();
		this.fecha.set(e.obtenerEntero("\nPasame el anyo"),e.obtenerEntero("\nPasame el mes"),e.obtenerEntero("\nPasame el dia"));
	}
	
	public boolean esBisiesto(){
		return fecha.isLeapYear(this.fecha.YEAR);
	}
	
	public int diasMes(int mes){
		
		return fechaLocalDate.lengthOfMonth();
	
	}
 
}

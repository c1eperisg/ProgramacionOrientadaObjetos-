package Empleado;

public class Empleado {
	private int NIF;
	private double sueldoBase;
	private double pagoHoraExtra;
	private int hERealizadas;
	private int IRPF;
	private boolean casado;
	private int numeroHijos;
	
	public Empleado(){
		this.NIF=0;
		this.sueldoBase=0;
		this.pagoHoraExtra=0;
		this.hERealizadas=0;
		this.IRPF=0;
		this.casado=false;
		this.numeroHijos=0;
	}
	
	public Empleado(int NIF, double sueldoBase, double pagoHoraExtra, int HERealizadas, int IRPF, boolean casado, int numeroHijos){
		this.NIF=NIF;
		this.sueldoBase=sueldoBase;
		this.pagoHoraExtra=pagoHoraExtra;
		this.hERealizadas=HERealizadas;
		this.IRPF=IRPF;
		this.casado=casado;
		this.numeroHijos=numeroHijos;
	}
	
	public Empleado(int sueldoBase, int pagoHoraExtra, int hERealizadas, int IRPF, boolean casado, int numeroHijos){
		this.NIF=0;
		this.sueldoBase=sueldoBase;
		this.pagoHoraExtra=pagoHoraExtra;
		this.hERealizadas=hERealizadas;
		this.IRPF=IRPF;
		this.casado=casado;
		this.numeroHijos=numeroHijos;
	}
	
	public void setNIF(int NIF){
		this.NIF=NIF;
	}
	public void setsueldoBase(int sueldoBase){
		this.sueldoBase=sueldoBase;
	}
	public void setpagoHoraExtra(int pagoHoraExtra){
		this.pagoHoraExtra=pagoHoraExtra;
	}
	public void setHERealizadas(int hERealizadas){
		this.hERealizadas=hERealizadas;
	}
	public void setIRPF(int IRPF){
		this.IRPF=IRPF;
	}
	public void setcasado(boolean casado){
		this.casado=casado;
	}
	public void setnumeroHijos(int numeroHijos){
		this.numeroHijos=numeroHijos;
	}
	
	public int getNIF(){
		return this.NIF;
	}
	public double getsueldoBase(){
		return this.sueldoBase;
	}
	public double getpagoHoraExtra(){
		return this.pagoHoraExtra;
	}
	public int getHERealizadas(){
		return this.hERealizadas;
	}
	public int getIRPF(){
		return this.IRPF;
	}
	public String getcasado(){
		if(this.casado==true){
			return "casado"; 
		}else{
			return "soltero"; 
		}
	}
	public int getnumeroHijos(){
		return this.numeroHijos;
	}
	
	public double devolverHorasExtras(){
		return this.pagoHoraExtra * this.hERealizadas;
	}
	
	public double sueldoBruto(){
		
		return this.sueldoBase + devolverHorasExtras();
	}
	
	public double retenciones(){
		int IRPF=0;
		if(this.casado==false){
			IRPF +=2;
		}
		IRPF+= getnumeroHijos();
		return this.IRPF-IRPF;
	}
	
	public double sueldoLimpio(){
		return sueldoBruto() - (sueldoBruto()*retenciones()/100);
	}
	
	public String printl(){
		return 	"El NIF del empleado es: " + getNIF() + ".\n" +
				"El estado civil del empleado es: " + getcasado() + ".\n"+ 
				"El empleado tiene: " + getnumeroHijos() + "hijos.\n";
	}
	
	public String printAll(){
		return 	"El NIF del empleado es: " + getNIF() + ".\n" +
				"El sueldo base del empleado es de: " + getsueldoBase() + " euros\n" + 
				"Los complementos por horas extras son de: " + getpagoHoraExtra() + " euros\n" + 
				"El sueldo bruto del empleado es de: " + sueldoBruto() + " euros\n" + 
				"La retenciones por IRPF es del: " + retenciones() + " %\n" + 
				"El sueldo limpio del empleado es de: " + sueldoLimpio() + " euros\n" + 
				"El estado civil del empleado es: " + getcasado() + ".\n"+ 
				"El empleado tiene: " + getnumeroHijos() + " hijos.\n";
	}
	
}

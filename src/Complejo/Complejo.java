package Complejo;

public class Complejo {

	private float parteReal;
	private float parteImaginaria;
		
	public void setReal(){
		this.parteReal=parteReal;
	}
	
	public void setImaginaria(){
		this.parteImaginaria=parteImaginaria;
	}
	
	public float getReal(){
		return parteReal;
	}
	
	public float getImaginaria(){
		return parteImaginaria;
	}
	
	public Complejo(float parteReal,float ParteImaginaria){
		this.parteReal= parteReal;
		this.parteImaginaria= parteImaginaria;
	}
	
	public Complejo(){
		this.parteReal= 0.0f;
		this.parteImaginaria= 0.0f;
	}
	
	public Complejo suma(Complejo num){
		float resultadoReal, resultadoImaginario;
		
		resultadoReal= this.parteReal+num.getReal();
		resultadoImaginario= this.parteImaginaria + num.getImaginaria();
		
		return new Complejo(resultadoReal, resultadoImaginario);
	}
	
	public Complejo resta(Complejo num){
		float resultadoReal, resultadoImaginario;
		
		resultadoReal= this.parteReal-num.getReal();
		resultadoImaginario= this.parteImaginaria - num.getImaginaria();
		
		return new Complejo(resultadoReal, resultadoImaginario);
	}
	public Complejo multiplicacion(Complejo num){
		float resultadoReal, resultadoImaginario;
		
		resultadoReal= this.parteReal*num.getReal();
		resultadoImaginario= this.parteImaginaria * num.getImaginaria();
		
		return new Complejo(resultadoReal, resultadoImaginario);
	}
	public Complejo division(Complejo num){
		float resultadoReal, resultadoImaginario;
		
		resultadoReal= this.parteReal/num.getReal();
		resultadoImaginario= this.parteImaginaria / num.getImaginaria();
		
		return new Complejo(resultadoReal, resultadoImaginario);
	}
	
	public void print(){
		System.out.println("La parte real es:" +  getReal() + " y la imaginaria " + getImaginaria());
	}
}

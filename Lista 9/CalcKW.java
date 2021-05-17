package br.edu.ifcvideira.lista9;

public class CalcKW {
	private double salario;
	private double quantKWH;
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getQuantKWH() {
		return quantKWH;
	}
	
	public void setQuantKWH(double quantKWH) {
		this.quantKWH = quantKWH;
	}
	
	public double valorKW() {
		return this.getSalario()/7/100;
	}
	
	public double valorConta() {
		return valorKW() * this.getQuantKWH();
	}
	
	public double valorContaDesc() {
		return valorConta() * 0.9;
	}
}

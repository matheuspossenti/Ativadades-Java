package br.edu.ifcvideira.lista11;

public class Ex1Funcionário {
	private String nome;
	private double salario;
	private String cargo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Ex1Funcionário() {
	}
	
	public Ex1Funcionário(String nome, double salario, String cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	
}

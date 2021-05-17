package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex1Funcionario {

	private String nome;
	private double salario;
	private String cargo;
	
	public Ex1Funcionario () {
		
	}
	
	public Ex1Funcionario(String nome, double salario, String cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

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
	
	public double calculaSalario () {
		return this.getSalario();
	}
	
	public void imprime () {
		JOptionPane.showMessageDialog(null, "Dados do funcionário: \n"
				+ "\nNome: " + this.getNome() + "\n"
				+ "Salário: " + this.calculaSalario() + "\n"
				+ "Cargo: " + this.getCargo());
	}
	
}

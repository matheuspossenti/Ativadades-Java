package br.edu.ifcvideira.lista12;

public class Ex1Gerente extends Ex1Funcionario{

	public Ex1Gerente(String nome, double salario, String cargo) {
		super(nome, salario, cargo);
	}

	public double calculaSalario() {
		return this.getSalario() * 1.5;
	}
}

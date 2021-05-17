package br.edu.ifcvideira.lista13;

import javax.swing.JOptionPane;

public class Ex1Funcionario extends Ex1Pessoa{

	private double salario;
	private double valorHorasExtra;
	private double bonus;
	
	public Ex1Funcionario(String nome, String cpf, String endereco, double salario, double valorHorasExtra) {
		super(nome, cpf, endereco);
		this.salario = salario;
		this.valorHorasExtra = valorHorasExtra;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValorHorasExtra() {
		return valorHorasExtra;
	}

	public void setValorHorasExtra(double valorHorasExtra) {
		this.valorHorasExtra = valorHorasExtra;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calculaSalario (double salario, double valorHorasExtra) {
		return (salario + valorHorasExtra);
	}

	public double calculaSalario (double salario, double valorHorasExtra, double bonus) {
		return ((salario + valorHorasExtra) + ((salario + valorHorasExtra) * bonus / 100.0));
	}
	
	public void imprime (double total) {
		JOptionPane.showMessageDialog(null, "Cadastro: \n"
				+ "\nNome: " + this.getNome() + "\n"
				+ "CPF: " + this.getCpf() + "\n"
				+ "Endereço: " + this.getEndereco() + "\n"
				+ "Total à receber: R$ " + total);	
	}
}

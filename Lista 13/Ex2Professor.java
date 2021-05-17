package br.edu.ifcvideira.lista13;

import javax.swing.JOptionPane;

public class Ex2Professor extends Ex2Pessoa{
	
	private String departamento;

	public Ex2Professor(String nome, String rg, String departamento) {
		super(nome, rg);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public double calculaSalario (double salario, int parcelas) {
		return ((double)salario / parcelas);
	}

	public double calculaSalario (double salario) {
		return salario;
	}
	
	public void imprime (double totalSalario) {
		JOptionPane.showMessageDialog(null, "Professor: \n"
				+ "\nNome: " + this.getNome() + "\n"
				+ "RG: " + this.getRg() + "\n"
				+ "Departamento: " + this.getDepartamento() + "\n"
				+ "Salário: " + totalSalario);
	}
}

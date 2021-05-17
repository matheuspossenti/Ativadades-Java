package br.edu.ifcvideira.lista13;

import javax.swing.JOptionPane;

public class Ex1Cliente extends Ex1Pessoa{

	private double credito;
	private String tipo;
	
	public Ex1Cliente(String nome, String cpf, String endereco, double credito, String tipo) {
		super(nome, cpf, endereco);
		this.credito = credito;
		this.tipo = tipo;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void calculaCredito () {
		this.setCredito(this.getCredito());
	}

	public void calculaCredito (String tipo) {
		if (tipo.equalsIgnoreCase("VIP")) {
			this.setCredito(this.getCredito() * 2);
		}
	}
	
	public void imprime () {
		JOptionPane.showMessageDialog(null, "Cadastro: \n"
				+ "\nNome: " + this.getNome() + "\n"
				+ "CPF: " + this.getCpf() + "\n"
				+ "Endereço: " + this.getEndereco() + "\n"
				+ "Tipo: "+this.getTipo() + "\n"
				+ "Crédito: R$"+this.getCredito());	
	}
}

package br.edu.ifcvideira.lista11;

import javax.swing.JOptionPane;

public class Ex3VIP extends Ex3Ingresso{

	public Ex3VIP() {
		super();
	}
	
	public Ex3VIP(double valor) {
		super(valor);
	}

	public double valorVip() {
		return this.getValor() * 2.5;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Ingresso VIP:\n"
				+ "\nValor: R$" + valorVip());
	}
}

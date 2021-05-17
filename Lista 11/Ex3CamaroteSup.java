package br.edu.ifcvideira.lista11;

import javax.swing.JOptionPane;

public class Ex3CamaroteSup extends Ex3VIP {

	public Ex3CamaroteSup() {
		super();
	}

	public Ex3CamaroteSup(double valor) {
		super(valor);
	}

	public double valorCS() {
		return this.getValor() * 2.9;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Ingresso Camarote Superior:\n"
				+ "\nValor: R$" + valorCS());
	}	
}

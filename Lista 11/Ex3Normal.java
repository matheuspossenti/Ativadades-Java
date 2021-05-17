package br.edu.ifcvideira.lista11;

import javax.swing.JOptionPane;

public class Ex3Normal extends Ex3Ingresso{
	
	public Ex3Normal() {
		super();
	}

	public Ex3Normal(double valor) {
		super(valor);
	}

	public void imprime() {
		JOptionPane.showMessageDialog(null, "Ingresso Normal: \n"
				+ "\nValor: R$" + this.getValor());
	}
}

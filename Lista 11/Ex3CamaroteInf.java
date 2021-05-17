package br.edu.ifcvideira.lista11;

import javax.swing.JOptionPane;

public class Ex3CamaroteInf extends Ex3VIP{
	
	private String localizacao;

	public Ex3CamaroteInf() {
		super();
	}
	
	public Ex3CamaroteInf(double valor, String localizacao) {
		super(valor);
		this.localizacao = localizacao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public double valorCI () {
		return this.getValor() * 2.6;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Ingresso Camarote Inferior:\n"
				+ "Localização: " + this.getLocalizacao() + "\n"
				+ "Valor: R$" + valorCI());
	}
	
}

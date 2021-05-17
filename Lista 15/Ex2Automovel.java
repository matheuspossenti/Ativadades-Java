package br.edu.ifcvideira.lista15;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex2Automovel extends Ex2Veiculo {

	public Ex2Automovel() {

	}

	public Ex2Automovel(String modelo, int ano, double valor) {
		super(modelo, ano, valor);
	}
	
	public double calculaValor() {
		return this.getValor() - ((double)(2020 - this.getAno()) * 0.05 * this.getValor());
	}
	
	public double calculaSeguro() {
		if((2020 - this.getAno()) <= 5) {
			return this.getValor() * 0.045;
		} else if((2020 - this.getAno()) <= 10) {
			return this.getValor() * 0.05;
		} else {
			return this.getValor() * 0.055;
		}
	}
	
	public double calculaIpva() {
		if((2020 - this.getAno()) <= 10) {
			return this.getValor() * 0.05;
		} else if((2020 - this.getAno()) <= 20) {
			return this.getValor() * 0.04;
		} else {
			return 0;
		}
	}
	
	DecimalFormat df = new DecimalFormat();
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do automóvel: \n"
				+ "\nModelo: " + this.getModelo() + "\n"
				+ "Ano: " + this.getAno() + "\n"
				+ "Valor atualizado: R$" + df.format(calculaValor()) + "\n"
				+ "Seguro: R$" + calculaSeguro() + "\n"
				+ "IPVA: R$" + calculaIpva());
	}
	
}

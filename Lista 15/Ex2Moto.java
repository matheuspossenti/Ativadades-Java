package br.edu.ifcvideira.lista15;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex2Moto extends Ex2Veiculo {

	public Ex2Moto() {
		
	}

	public Ex2Moto(String modelo, int ano, double valor) {
		super(modelo, ano, valor);
	}
	
	public double calculaValor() {
		return this.getValor() - ((double)(2020 - this.getAno()) * 0.08 * this.getValor());
	}
	
	public double calculaSeguro() {
		return 0;
	}
	
	public double calculaIpva() {
		if((2020 - this.getAno()) <= 5) {
			return this.getValor() * 0.04;
		} else if((2020 - this.getAno()) <= 10) {
			return this.getValor() * 0.03;
		} else {
			return 0;
		}
	}
	
	DecimalFormat df = new DecimalFormat();
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados da moto: \n"
				+ "\nModelo: " + this.getModelo() + "\n"
				+ "Ano: " + this.getAno() + "\n"
				+ "Valor atualizado: R$" + df.format(calculaValor()) + "\n"
				+ "Seguro: R$" + calculaSeguro() + "\n"
				+ "IPVA: R$" + calculaIpva());
	}

}

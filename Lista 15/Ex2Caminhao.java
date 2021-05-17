package br.edu.ifcvideira.lista15;

import javax.swing.JOptionPane;

import java.text.DecimalFormat; 

public class Ex2Caminhao extends Ex2Veiculo {
	
	private double capacidade;
	
	public Ex2Caminhao() {
		
	}

	public Ex2Caminhao(String modelo, int ano, double valor, double capacidade) {
		super(modelo, ano, valor);
		this.capacidade = capacidade;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	
	public double calculaValor() {
		return this.getValor() - ((double)(2020 - this.getAno()) * (0.035 * this.getValor()));
	}
	
	public double calculaSeguro() {
		return  (double)this.getCapacidade() * 500 / 10;
	}
	
	public double calculaIpva() {
		
		if((2020 - this.getAno()) > 15) {
			return 0;
		} else {
			if(this.getCapacidade() <= 50) {
				return this.getValor() * 0.04;
			} else {
				return this.getValor() * 0.03;
			}	
			
		}
		
	}
	
	DecimalFormat df = new DecimalFormat();
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do caminhão: \n"
				+ "\nModelo: " + this.getModelo() + "\n"
				+ "Ano: " + this.getAno() + "\n"
				+ "Capacidade: " + this.getCapacidade() + "\n"
				+ "Valor atualizado: R$" + df.format(calculaValor()) + "\n"
				+ "Seguro: R$" + calculaSeguro() + "\n"
				+ "IPVA: R$" + calculaIpva());
	}

}

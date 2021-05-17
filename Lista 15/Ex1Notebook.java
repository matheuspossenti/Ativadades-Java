package br.edu.ifcvideira.lista15;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Ex1Notebook extends Ex1Computador {
	
	private double carregador;
	private double pasta;
	
	public Ex1Notebook() {
		super();
	}
	
	public Ex1Notebook(double placaMae, double hd, double memoria, double processador, double placaVideo, int volumes,
			int garantia, String configuracao, double carregador, double pasta) {
		super(placaMae, hd, memoria, processador, placaVideo, volumes, garantia, configuracao);
		this.carregador = carregador;
		this.pasta = pasta;
	}

	public double getCarregador() {
		return carregador;
	}

	public void setCarregador(double carregador) {
		this.carregador = carregador;
	}

	public double getPasta() {
		return pasta;
	}

	public void setPasta(double pasta) {
		this.pasta = pasta;
	}
	
	public double calculaPreco() {
		return this.getPlacaMae() + this.getHd() + this.getMemoria() + this.getProcessador() + this.getPlacaVideo() + this.getCarregador() + this.getPasta();
	}
	
	DecimalFormat df = new DecimalFormat();
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do notebook escolhido: \n\n"
				+ this.getConfiguracao() + "\n"
					+ "Valor total: R$ " + calculaPreco());
	}
	
	public void imprimeGarantia() {
		JOptionPane.showMessageDialog(null, "Dados do notebook escolhido: \n\n"
				+ this.getConfiguracao() + "\n"
					+ "Valor total: R$ " + df.format((calculaPreco() * 1.12)));
	}
	
}
package br.edu.ifcvideira.lista15;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Ex1Desktop extends Ex1Computador {
	
	private double estabilizador;
	private double teclado;
	
	public Ex1Desktop() {

	}
	
	public Ex1Desktop(double placaMae, double hd, double memoria, double processador, double placaVideo, int volumes,
			int garantia, String configuracao, double estabilizador, double teclado) {
		super(placaMae, hd, memoria, processador, placaVideo, volumes, garantia, configuracao);
		this.estabilizador = estabilizador;
		this.teclado = teclado;
		
	}

	public double getEstabilizador() {
		return estabilizador;
	}

	public void setEstabilizador(double estabilizador) {
		this.estabilizador = estabilizador;
	}

	public double getTeclado() {
		return teclado;
	}

	public void setTeclado(double teclado) {
		this.teclado = teclado;
	}
	
	public double calculaPreco() {
		return this.getPlacaMae() + this.getHd() + this.getMemoria() + this.getProcessador() + this.getPlacaVideo() + this.getEstabilizador() + this.getTeclado();
	}
	
	DecimalFormat df = new DecimalFormat();
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do desktop escolhido: \n\n"
				+ this.getConfiguracao() + "\n"
					+ "Valor total: R$ " + calculaPreco());
	}
	
	public void imprimeGarantia() {
		JOptionPane.showMessageDialog(null, "Dados do desktop escolhido: \n\n"
				+ this.getConfiguracao() + "\n"
					+ "Valor total: R$ " + df.format((calculaPreco() * 1.10)));
	}

}

package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex3Caminhao extends Ex3Veiculo{
	
	private int tonelada;
	private int alturaMax;
	private int comprimento;
	
	public Ex3Caminhao(int peso, int velocMax, double preco, int tonelada, int alturaMax, int comprimento) {
		super(peso, velocMax, preco);
		this.tonelada = tonelada;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	}
	
	public int getTonelada() {
		return tonelada;
	}
	
	public void setTonelada(int tonelada) {
		this.tonelada = tonelada;
	}
	
	public int getAlturaMax() {
		return alturaMax;
	}
	
	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}
	
	public int getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public double newPrice () {
		return this.getPreco() * 0.8;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do veículo: \n"
				+ "\nPeso: " + this.getPeso() + "kg\n"
				+ "Velocidade Máxima: " + this.getVelocMax() + "km/h\n"
				+ "Preço: R$" + this.newPrice() + "\n"
				+ "Carga Máxima: " + this.getTonelada() + " toneladas\n"
				+ "Altura Máxima: " + this.getAlturaMax() + " metros\n"
				+ "Comprimento: " + this.getComprimento());
	}
}

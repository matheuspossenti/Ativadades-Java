package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex3Veiculo {
	private int peso;
	private int velocMax;
	private double preco;
	
	public Ex3Veiculo(int peso, int velocMax, double preco) {
		super();
		this.peso = peso;
		this.velocMax = velocMax;
		this.preco = preco;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getVelocMax() {
		return velocMax;
	}
	
	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double newPrice () {
		return this.getPreco() * 0.9;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do veículo: \n"
				+ "\nPeso: " + this.getPeso( ) +"kg\n"
				+ "Velocidade Máxima: " + this.getVelocMax() + "km/h\n"
				+ "Preco: R$" + this.newPrice());
	}
}

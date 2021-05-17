package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex3CarroPasseio extends Ex3Veiculo{
	private String cor;
	private String modelo;
	
	public Ex3CarroPasseio(int peso, int velocMax, double preco) {
		super(peso, velocMax, preco);
	}

	public Ex3CarroPasseio(int peso, int velocMax, double preco, String cor, String modelo) {
		super(peso, velocMax, preco);
		this.cor = cor;
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double newPrice () {
		return this.getPreco() * 0.85;
	}

	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do veículo: \n"
				+ "\nPeso: " + this.getPeso() + "kg\n"
				+ "Velocidade Máxima: " + this.getVelocMax() + "km/h\n"
				+ "Preço: R$" + this.newPrice() + "\n"
				+ "Cor: " + this.getCor() + "\n"
				+ "Modelo: " + this.getModelo());
	}
}

package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex5Peixe extends Ex5Animal{

	public Ex5Peixe(String animal, int comprimento, int patas, String cor, String ambiente, double velocidade) {
		super(animal, comprimento, patas, cor, ambiente, velocidade);

	}

	private String caracteristicas;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Ex5Peixe(String animal, int comprimento, int patas, String cor, String ambiente, double velocidade,
			String caracteristicas) {
		super(animal, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristicas = caracteristicas;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do Animal: \n"
				+ "\nAnimal: " + this.getAnimal() + "\n"
				+ "Comprimento: " + this.getComprimento() + " cm\n"
				+ "Patas: " + this.getPatas() + "\n"
				+ "Cor: " + this.getCor() + "\n"
				+ "Ambiente: " + this.getAmbiente() + "\n"
				+ "Velocidade: " + this.getVelocidade() + "\n"
				+ "Características: " + this.getCaracteristicas());
	}
	
}

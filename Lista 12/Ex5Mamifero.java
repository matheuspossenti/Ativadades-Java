package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex5Mamifero extends Ex5Animal{

	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public Ex5Mamifero(String animal, int comprimento, int patas, String cor, String ambiente, double velocidade,
			String alimento) {
		super(animal, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do Animal: \n"
				+ "\nAnimal: " + this.getAnimal() + "\n"
				+ "Comprimento: " + this.getComprimento() + " cm\n"
				+ "Patas: " + this.getPatas() + "\n"
				+ "Cor: " + this.getCor() + "\n"
				+ "Ambiente: " + this.getAmbiente() + "\n"
				+ "Velocidade: " + this.getVelocidade() + "\n"
				+ "Alimento: " + this.getAlimento());
	}
}

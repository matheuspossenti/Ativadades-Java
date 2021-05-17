package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex5Animal {

	private String animal;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public String getAnimal() {
		return animal;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	public int getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public Ex5Animal(String animal, int comprimento, int patas, String cor, String ambiente, double velocidade) {
		super();
		this.animal = animal;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do Animal: \n\n"
				+ "Animal: " + this.getAnimal() + "\n"
				+ "Comprimento: " + this.getComprimento() + " cm\n"
				+ "Patas: " + this.getPatas() + "\n"
				+ "Cor: " + this.getCor() + "\n"
				+ "Ambiente: " + this.getAmbiente() + "\n"
				+ "Velocidade: " + this.getVelocidade());
	}
	
}

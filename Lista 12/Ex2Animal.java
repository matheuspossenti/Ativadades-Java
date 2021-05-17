package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex2Animal {

	private String nome;
	private String raca;
	private String som;
	
	public Ex2Animal(String nome, String raca, String som) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do Animal: \n"
				+ "\nRaça: " + this.getRaca() + "\n"
				+ "Nome: " + this.getNome() + "\n"
				+ "Som: " + this.getSom());
	}
	
}

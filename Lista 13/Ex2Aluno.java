package br.edu.ifcvideira.lista13;

import javax.swing.JOptionPane;

public class Ex2Aluno extends Ex2Pessoa{
	private double media;

	public Ex2Aluno(String nome, String rg) {
		super(nome, rg);
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public void calculaMedia (double nota1, double nota2) {
		this.setMedia((nota1+nota2)/2);
	}
	
	public void calculaMedia (double nota1, double nota2, double nota3) {
		this.setMedia((nota1+nota2+nota3)/3);
	}
	
	public void imprime () {
		JOptionPane.showMessageDialog(null, "Aluno:" + "\n"
				+ "\\nNome: " + this.getNome() + "\n"
				+ "RG: " + this.getRg() + "\n"
				+ "Média: " + this.getMedia());
	}
}

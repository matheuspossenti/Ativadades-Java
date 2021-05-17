package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex4Roupa extends Ex4Produto{
	
	public Ex4Roupa(String codigo, String descricao, double valor) {
		super(codigo, descricao, valor);
	}

	private String tamanho;
	private String cor;
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Ex4Roupa(String codigo, String descricao, double valor, String tamanho, String cor) {
		super(codigo, descricao, valor);
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do Produto:\n"
				+ "\nCódigo: " + this.getCodigo() + "\n"
				+ "Descrição: " + this.getDescricao() + "\n"
				+ "Valor: R$" + this.getValor()+"\n"
				+ "Tamanho: " + this.getTamanho() + "\n"
				+ "Cor: " + this.getCor());
	}
}

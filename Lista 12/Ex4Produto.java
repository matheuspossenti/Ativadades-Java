package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex4Produto {
	private String codigo;
	private String descricao;
	private double valor;
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public Ex4Produto(String codigo, String descricao, double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do Produto:\n"
				+ "\nCódigo: " + this.getCodigo() + "\n"
				+ "Descrição: " + this.getDescricao() + "\n"
				+ "Valor: " + this.getValor());
	}
}

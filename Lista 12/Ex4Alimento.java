package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex4Alimento extends Ex4Produto{

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Ex4Alimento(String codigo, String descricao, double valor, String tipo) {
		super(codigo, descricao, valor);
		this.tipo = tipo;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do Produto:\n\n"
				+ "Código: " + this.getCodigo() + "\n"
				+ "Descrição: " + this.getDescricao() + "\n"
				+ "Valor: R$" + this.getValor() + "\n"
				+ "Tipo: " + this.getTipo());
	}
}

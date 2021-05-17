package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex4Eletrodomestico extends Ex4Produto{
	private int voltagem;

	public Ex4Eletrodomestico(String codigo, String descricao, double valor) {
		super(codigo, descricao, valor);
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public Ex4Eletrodomestico(String codigo, String descricao, double valor, int voltagem) {
		super(codigo, descricao, valor);
		this.voltagem = voltagem;
	}
	
	public void imprime() {
		JOptionPane.showMessageDialog(null, "Dados do Produto:\n"
				+ "\nCódigo: " + this.getCodigo() + "\n"
				+ "Descrição: " + this.getDescricao() + "\n"
				+ "Valor: R$" + this.getValor() + "\n"
				+ "Voltagem: " + this.getVoltagem());
	}
}

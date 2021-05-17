package br.edu.ifcvideira.lista11;

public class Ex4Velho extends Ex4Imovel{

	public Ex4Velho() {
		super();
	}

	public Ex4Velho(String endereco, double preco) {
		super(endereco, preco);
	}

	public double calculoPreco() {
		return this.getPreco() * 0.9;
	}
}

package br.edu.ifcvideira.lista11;

public class Ex4Novo extends Ex4Imovel{

	public Ex4Novo() {
		super();
	}

	public Ex4Novo(String endereco, double preco) {
		super(endereco, preco);
	}

	public double calculoPreco() {
		return this.getPreco() * 1.15;
	}
	
}

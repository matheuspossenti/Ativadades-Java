package br.edu.ifcvideira.lista11;

public class Ex4Imovel {
	
	private String endereco;
	private double preco;
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Ex4Imovel() {
		
	}
	
	public Ex4Imovel(String endereco, double preco) {
		super();
		this.endereco = endereco;
		this.preco = preco;
	}
	
}

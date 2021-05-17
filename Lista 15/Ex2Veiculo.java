package br.edu.ifcvideira.lista15;

public class Ex2Veiculo {
	
	private String modelo;
	private int ano;
	private double valor;
	
	public Ex2Veiculo() {
		
	}
	
	public Ex2Veiculo(String modelo, int ano, double valor) {
		super();
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calculaValor() {
		return 0;
	}
	
	public double calculaSeguro() {
		return 0;
	}
	
	public double calculaIpva() {
		return 0;
	}
	
	public void imprime() {
		
	}
	
}

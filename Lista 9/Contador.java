package br.edu.ifcvideira.lista9;

public class Contador {

	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void incremento (){
		this.setNumero(getNumero() + 1);
	}
	
	public void decremento (){
		this.setNumero(getNumero() - 1);
	}
}

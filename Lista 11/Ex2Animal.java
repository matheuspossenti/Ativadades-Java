package br.edu.ifcvideira.lista11;

public class Ex2Animal {
	String nome;
	String raca;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public Ex2Animal() {
		
	}
	
	public Ex2Animal(String nome, String raca) {
		super();
		this.nome = nome;
		this.raca = raca;
	}
}

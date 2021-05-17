package br.edu.ifcvideira.lista10;

public class Hospede {
	
	private int cpf;
	private int rg;
	private String nome;
	private String endereco;
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndere�o() {
		return endereco;
	}
	
	public void setEndere�o(String endere�o) {
		this.endereco = endere�o;
	}

	public Hospede() {
		
	}

	public Hospede(int cpf, int rg, String nome, String endere�o) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.endereco = endere�o;
	}
	
}

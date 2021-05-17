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
	
	public String getEnderešo() {
		return endereco;
	}
	
	public void setEnderešo(String enderešo) {
		this.endereco = enderešo;
	}

	public Hospede() {
		
	}

	public Hospede(int cpf, int rg, String nome, String enderešo) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.endereco = enderešo;
	}
	
}

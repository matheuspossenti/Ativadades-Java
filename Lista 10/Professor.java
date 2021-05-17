package br.edu.ifcvideira.lista10;

public class Professor {
	
	private String nome;
	private String departamento;
	private int numReg;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public int getNumReg() {
		return numReg;
	}
	
	public void setNumReg(int numReg) {
		this.numReg = numReg;
	}

	public Professor() {
		
	}
	public Professor(String nome, String departamento, int numReg) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.numReg = numReg;
	}
	
	
}

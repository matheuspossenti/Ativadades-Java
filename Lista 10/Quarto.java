package br.edu.ifcvideira.lista10;

public class Quarto {

	private int num;
	private int andar;
	private String hospede;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getAndar() {
		return andar;
	}
	
	public void setAndar(int andar) {
		this.andar = andar;
	}
	
	public String getHospede() {
		return hospede;
	}
	
	public void setHospede(String hospede) {
		this.hospede = hospede;
	}
	
	public Quarto() {
		
	}

	public Quarto(int num, int andar, String hospede) {
		super();
		this.num = num;
		this.andar = andar;
		this.hospede = hospede;
	}
	
}

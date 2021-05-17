package br.edu.ifcvideira.lista11;

public class Ex1AssistenteAdministrativo extends Ex1Funcionário{
	
	private int numMatricula;
	private String turno;
	
	public int getNumMatricula() {
		return numMatricula;
	}
	
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Ex1AssistenteAdministrativo() {
		
	}
	
	public Ex1AssistenteAdministrativo(int numMatricula, String turno) {
		super();
		this.numMatricula = numMatricula;
		this.turno = turno;
	}
	
	public double calculoSalario() {
		if(this.getTurno().equalsIgnoreCase("Noturno")) {
			return this.getSalario() * 1.3;
		} else {
			return this.getSalario();
		}
	}
}

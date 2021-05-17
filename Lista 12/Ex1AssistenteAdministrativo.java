package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex1AssistenteAdministrativo extends Ex1Funcionario{

	private int numMatricula;
	private String turno;
 
	public Ex1AssistenteAdministrativo(String nome, double salario, String cargo, int matricula, String turno) {
		super(nome, salario, cargo);
		this.numMatricula = matricula;
		this.turno = turno;
	}

	public int getMatricula() {
		return numMatricula;
	}



	public void setMatricula(int matricula) {
		this.numMatricula = matricula;
	}



	public String getTurno() {
		return turno;
	}



	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double calculaSalario() {
		if (this.getTurno().equalsIgnoreCase("Noturno")) {
			return this.getSalario() * 1.3;
		} else {
			return this.getSalario();
		}
	}

		public void imprime () {
			JOptionPane.showMessageDialog(null, "Dados do funcionário: \n\n"
					+ "Nome: " + this.getNome() + "\n"
					+ "Salário: " + this.calculaSalario() + "\n"
					+ "Cargo: " + this.getCargo() + "\n"
					+ "Matrícula: " + this.getMatricula() + "\n"
					+ "Turno: " + this.getTurno());
	}
	
}

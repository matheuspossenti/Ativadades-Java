package br.edu.ifcvideira.lista11;

import javax.swing.JOptionPane;

public class Ex1Main {
	public static void main(String[] args) {
		
		Ex1Gerente ge = new Ex1Gerente();
		Ex1AssistenteTecnico at = new Ex1AssistenteTecnico();
		Ex1AssistenteAdministrativo aa = new Ex1AssistenteAdministrativo();
		
		String nome;
		double salario;
		String turno;
		int numMatricula;
		
		int op;
		
		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual o cargo do funcionário a ser cadastrado: \n"
					+ "\n1- Gerente \n"
					+ "2- Assistente Técnico \n"
					+ "3- Assistente Administrativo \n"
					+ "4- Finalizar"));
			
			if (op == 4) {
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			}
			
			nome = String.valueOf(JOptionPane.showInputDialog("Nome do funcionario: "));
			salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de " + nome + ": "));
			
			if (op == 1) {
				
				ge.setNome(nome);
				ge.setSalario(salario);
				ge.setCargo("Gerente");
				
				JOptionPane.showMessageDialog(null, "Dados do funcionário: \n"
						+ "\nNome: " + ge.getNome() + "\n"
						+ "Cargo: " + ge.getCargo() + "\n"
						+ "Salário: R$" + ge.calculoSalario());
				
			} else if (op == 2) {
				
				at.setNome(nome);
				at.setSalario(salario);
				at.setCargo("Assistente Técnico");
				
				JOptionPane.showMessageDialog(null, "Dados do funcionário: \n"
						+ "\nNome: " + at.getNome() + "\n"
						+ "Cargo: " + at.getCargo() + "\n"
						+ "Salário: R$" + at.calculoSalario());
				
			} else if (op == 3) {
				
				numMatricula = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de matrícula de " + nome));
				turno = String.valueOf(JOptionPane.showInputDialog("Qual o turno de " + nome + ". (Noturno/Diurno)"));
				
				aa.setNumMatricula(numMatricula);
				aa.setTurno(turno);
				aa.setNome(nome);
				aa.setSalario(salario);
				aa.setCargo("Assistente Administrativo");
			
				JOptionPane.showMessageDialog(null, "Dados do funcionário: \n"
						+ "\nNome: " + aa.getNome() + "\n"
						+ "Cargo: " + aa.getCargo() + "\n"
						+ "Número Matrícula: " + aa.getNumMatricula() + "\n"
						+ "Turno: " + aa.getTurno() + "\n"
						+ "Salário: R$" + aa.calculoSalario());
				
			}
		}
	}
}	
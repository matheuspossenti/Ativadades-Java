package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex1Principal {

	public static void main(String[] args) {
		
		Ex1Funcionario fu;
		
		String nome;
		double salario;
		
		int op;
		
		for (;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Insira o funcionário a ser cadastrado:  \n"
					+ "\n1 - Gerente \n"
					+ "2 - Assistente Técnico \n"
					+ "3 - Assistente Administrativo \n"
					+ "4 - Finalizar"));
			
			if (op == 4) {
				JOptionPane.showMessageDialog(null, "Finalizando...!");
				break;
			}
			
			nome = String.valueOf (JOptionPane.showInputDialog("Nome do funcionário: ")) ;
			salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário base de " + nome + "?"));
		
			if (op == 1) {
				
				fu = new Ex1Gerente(nome, salario, "Gerente");
				
				fu.imprime();
				
			} else if (op == 2) {
				
				fu = new Ex1AssistenteTecnico(nome, salario, "Assistente Técnico");
				
				fu.imprime();
				
			} else if (op == 3) {
				
				String turno;
				int numMatricula;
				
				numMatricula = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de matrícula de " + nome));
				turno = String.valueOf(JOptionPane.showInputDialog("Qual o turno de " + nome + ". (Noturno/Diurno)"));
				
				fu = new Ex1AssistenteAdministrativo(nome, salario, "Assistente Administrativo", numMatricula, turno);
				
				fu.imprime();
				
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		
		}
		
	}
}
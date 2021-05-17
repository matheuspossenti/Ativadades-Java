package br.edu.ifcvideira.lista13;

import javax.swing.JOptionPane;

public class Ex2Main {
	
		static String nome;
		static String rg;
		
		public static void main(String[] args) {

			Ex2Pessoa pe;
			int op;
			
			for (;;) {
				
				op = Integer.parseInt(JOptionPane.showInputDialog("Cadastro: \n"
						+ "\n1 - Professor" + "\n"
						+ "2 - Aluno" + "\n"
						+ "3 - Cancelar"));

				if (op == 3) {
					JOptionPane.showMessageDialog(null, "Finalizar....");
					break;
				}
				
				recebe();
				
				if (op == 1) {
					 
					String departamento = String.valueOf(JOptionPane.showInputDialog("Departamento: "));
					double totalSalario;
					
					pe = new Ex2Professor(nome, rg, departamento);
					
					double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
					int parcelas = Integer.parseInt(JOptionPane.showInputDialog("Parcelas: "));
				
					if (parcelas==1) {
						totalSalario = pe.calculaSalario(salario);
					} else {
						totalSalario = pe.calculaSalario(salario, parcelas);
					}
					
					pe.imprime(totalSalario);
					
				} else if (op == 2) {
					
					pe = new Ex2Aluno(nome, rg);
					
					op = Integer.parseInt(JOptionPane.showInputDialog("2 ou 3 notas?"));
					
					double nota1 = Integer.parseInt(JOptionPane.showInputDialog("Primeira nota: "));
					double nota2 = Integer.parseInt(JOptionPane.showInputDialog("Segunda nota: "));
					
					if (op==2) {
						pe.calculaMedia(nota1, nota2);
					} else {
						double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota: "));
						pe.calculaMedia(nota1, nota2, nota3);
					}
				
					pe.imprime();
					
				}
				
			}

		}

		public static void recebe() {
			nome = String.valueOf(JOptionPane.showInputDialog("Nome:"));
			rg = String.valueOf(JOptionPane.showInputDialog("RG: "));
		}
}
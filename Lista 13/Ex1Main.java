package br.edu.ifcvideira.lista13;

import javax.swing.JOptionPane;

public class Ex1Main {
	
		static String nome;
		static String cpf;
		static String endereco;
		
		public static void main(String[] args) {

			int op; 

			for (;;) {
				
				op = Integer.parseInt(JOptionPane.showInputDialog("Cadastro: \n"
						+ "\n1- Funcionário\n"
						+ "2- Cliente\n"
						+ "3- Finalizar"));
				
				if (op == 3) {
					JOptionPane.showMessageDialog(null, "Finalizando...");
					break;
				}
				
				recebe();
					
				if (op == 1) {
					
					double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
					double valorHorasExtra = Double.parseDouble(JOptionPane.showInputDialog("Valor hora extra: "));
					
					op = Integer.parseInt(JOptionPane.showInputDialog("Com bônus?\n"
							+ "\n1 - Sim " + "\n"
							+ "2 - Não"));
					
					if (op == 1) {
						
						double bonus = Double.parseDouble(JOptionPane.showInputDialog("Porcentagem de bonus: ")); 
						
						Ex1Funcionario pe = new Ex1Funcionario(nome, cpf, endereco, salario, valorHorasExtra);
						
						double total = pe.calculaSalario(salario, valorHorasExtra, bonus);
						pe.imprime(total);
						
					} else {
						
						Ex1Funcionario pe = new Ex1Funcionario(nome, cpf, endereco, salario, valorHorasExtra);
						
						double total = pe.calculaSalario(salario, valorHorasExtra);
						pe.imprime(total);
						
					}
					
				} else if (op == 2) {
					
					String tipo;
					double credito = Double.parseDouble(JOptionPane.showInputDialog("Crédito: "));
					
					op = Integer.parseInt(JOptionPane.showInputDialog("Cliente: "
							+ "\n1 - VIP" + "\n"
							+ "2 - Normal"));
					
					if (op==1) {
						tipo = "VIP";
					} else {
						tipo = "normal";
					}
					
					Ex1Cliente pe = new Ex1Cliente(nome, cpf, endereco, credito, tipo);
					
					if (op==1) {
						pe.calculaCredito(tipo);
					} else {
						pe.calculaCredito();
					}
					
					pe.imprime();
					
				}
				
			}
			
		}

		public static void recebe() {
			nome = String.valueOf(JOptionPane.showInputDialog("Nome:"));
			cpf = String.valueOf(JOptionPane.showInputDialog("CPF:"));
			endereco = String.valueOf(JOptionPane.showInputDialog("Endereco:"));
		}
}
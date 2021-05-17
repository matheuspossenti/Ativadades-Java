package br.edu.ifcvideira.lista9;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Pessoa ps = new Pessoa();
		
		String nome[] = new String [3];
		int idade[] = new int [3];
		int opcao;
		
		for (int i = 0; i <= 2; i++) {
			nome[i] = String.valueOf(JOptionPane.showInputDialog("Insira o nome da Pessoa " + (i + 1)));
			idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade da Pessoa " + (i + 1)));	
		}
		
		for(;;) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n"
					+ "-1 Para Fazer Aniversário: \n"
					+ "-2 para Finalizar\n"
					+ "\nNome: " + nome[0] + "\n"
					+ "Idade: " + idade[0] + "\n"
					+ "\nNome: " + nome[1] + "\n"
					+ "Idade: " + idade[1] + "\n"
					+ "\nNome: " + nome[2] + "\n"
					+ "Idade: " + idade[2] + "\n"));
			
			if(opcao == 1) {
				for (int i = 0; i <= 2; i++) {
					ps.setIdade(idade[i]);
					ps.fazAniversario();
					idade[i] = ps.getIdade();
				}
			} else if(opcao == 2) {
				break;
			}
		}
		
	}

}

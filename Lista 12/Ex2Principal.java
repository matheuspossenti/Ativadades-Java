package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex2Principal {

public static void main(String[] args) {
		
		Ex2Animal an;

		String nome;
		String raca;
		int op;
		
		for (;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Que animal de estimação você possui\n"
					+ "\n1 - Cachorro\n"
					+ "2 - Gato\n"
					+ "3 - Finalizar"));
			
			if (op == 3) {
				JOptionPane.showMessageDialog(null, "Finalizando...!");
				break;
			}
			
			if (op == 1) {
				
				raca = "Cachorro";
				nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome do seu " + raca + "?"));
				
				an = new Ex2Cachorro(nome, raca, "au au");
				an.imprime();
				
			} else if (op == 2) {
				
				raca = "Gato";
				nome = String.valueOf(JOptionPane.showInputDialog("Qual o nome do seu " + raca + "?"));
				
				an = new Ex2Gato(nome, raca, "miau");
				an.imprime();
				
			} else {
				JOptionPane.showMessageDialog(null, "Número inválido!");
			}
			
		}
		
	}
	
}

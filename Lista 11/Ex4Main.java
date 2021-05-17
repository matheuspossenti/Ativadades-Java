package br.edu.ifcvideira.lista11;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex4Main {

	static String endereco;
	static double preco;
	
	public static void main(String[] args) {
		DecimalFormat de = new DecimalFormat("0.00");
		int op;
		
		recebeDados();
		
		for (;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu im�vel: \n"
					+ "\n1 - Im�vel novo\n"
					+ "2- Im�vel velho\n"
					+ "3- Escolher outro im�vel\n"
					+ "4- Finalizar"));
		
			if (op == 1) {
				
				Ex4Novo no = new Ex4Novo(endereco, preco);
				
				JOptionPane.showMessageDialog(null, "Dados do Im�vel: \n"
						+ "\nTipo: Novo\n"
						+ "Endere�o: " + no.getEndereco() + "\n"
						+ "Pre�o: R$" + de.format(no.calculoPreco()));
			} else if (op==2) {
				
				Ex4Velho ve = new Ex4Velho(endereco, preco);
				
				JOptionPane.showMessageDialog(null, "Dados do Im�vel: \n"
						+ "\nTipo: Velho\n"
						+ "Endere�o: " + ve.getEndereco() + "\n"
						+ "Pre�o: R$" + de.format(ve.calculoPreco()));
			} else if (op == 3) {
				
				recebeDados();
			} else if (op == 4) {
				
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			} else {
				
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
			}
		}
	}

	public static void recebeDados() {
		endereco = String.valueOf(JOptionPane.showInputDialog("Qual endere�o do im�vel: "));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o do im�vel: "));
	}
}

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
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu imóvel: \n"
					+ "\n1 - Imóvel novo\n"
					+ "2- Imóvel velho\n"
					+ "3- Escolher outro imóvel\n"
					+ "4- Finalizar"));
		
			if (op == 1) {
				
				Ex4Novo no = new Ex4Novo(endereco, preco);
				
				JOptionPane.showMessageDialog(null, "Dados do Imóvel: \n"
						+ "\nTipo: Novo\n"
						+ "Endereço: " + no.getEndereco() + "\n"
						+ "Preço: R$" + de.format(no.calculoPreco()));
			} else if (op==2) {
				
				Ex4Velho ve = new Ex4Velho(endereco, preco);
				
				JOptionPane.showMessageDialog(null, "Dados do Imóvel: \n"
						+ "\nTipo: Velho\n"
						+ "Endereço: " + ve.getEndereco() + "\n"
						+ "Preço: R$" + de.format(ve.calculoPreco()));
			} else if (op == 3) {
				
				recebeDados();
			} else if (op == 4) {
				
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			} else {
				
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}

	public static void recebeDados() {
		endereco = String.valueOf(JOptionPane.showInputDialog("Qual endereço do imóvel: "));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do imóvel: "));
	}
}

package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex4Principal {
	
	static String codigo;
	static String descricao;
	static double valor;
	
	public static void main(String[] args) {
	
		Ex4Produto pr;
		int op;
		
		for (;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu produto?\n"
					+ "\n1 - Alimento\n"
					+ "2 - Eletrodoméstico\n"
					+ "3 - Roupa\n"
					+ "4 - Finalizar\n"));
		
			if (op == 4) {
				JOptionPane.showMessageDialog(null, "Finalizando...!");
				break;
			}
			
			recebe();
			
			if (op == 1) {
				
				String tipo = String.valueOf(JOptionPane.showInputDialog("Insira o tipo do alimento?"));
				pr = new Ex4Alimento(codigo, descricao, valor, tipo);
				
				pr.imprime();
				
			} else if (op == 2) {
				
				int voltagem = Integer.parseInt(JOptionPane.showInputDialog("Insira a voltagem do eletrodoméstico desejado?"));
				pr = new Ex4Eletrodomestico(codigo, descricao, valor, voltagem);
				
				pr.imprime();
				
			} else if (op == 3) {
				
				String tamanho = String.valueOf(JOptionPane.showInputDialog("Insira o tamanho da roupa desejada?"));
				String cor = String.valueOf(JOptionPane.showInputDialog("Insira a cor da roupa desejada?"));
				
				pr = new Ex4Roupa(codigo, descricao, valor, tamanho, cor);
				pr.imprime();
				
			}
			
		}
		

	}

	public static void recebe() {
		codigo = String.valueOf(JOptionPane.showInputDialog("Insira o código do produto?"));
		descricao = String.valueOf(JOptionPane.showInputDialog("Insira a descrição do produto?"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto?"));
	}
}

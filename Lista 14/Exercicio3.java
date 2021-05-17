package br.edu.ifcvideira.lista14;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int op;
		int valor;
		int pos;
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog(( "Escolha uma op��o\n"
					+ "1 - Inserir\n"
					+ "2 - Remover\n"
					+ "3 - Buscar\n"
					+ "4 - Sair\n")));
			
			if (op == 1) {
				op = Integer.parseInt(JOptionPane.showInputDialog("Como deseja inserir:"
						+ "\n\n1 - No final"
						+ "\n2 - Posi��o espec�fica"));
				
				valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor para inserir"));

				if (op == 1) {
					lista.add(valor);
				}else {
					pos = Integer.parseInt(JOptionPane.showInputDialog("Em qual posi��o deseja inserir: "));
					
					lista.add((pos-1), valor);
				}
			}else if (op == 2) {
				
				op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o para remover:\n"
						+ "1 - Valor \n"
						+ "2 - posi��o \n"
						+ "3 - limpar tudo"));
				
				if (op == 1) {
					valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor para remover: "));
					lista.remove(lista.indexOf(valor));
					
				}else if(op == 2) {
					pos = Integer.parseInt(JOptionPane.showInputDialog("Em qual posi��o deseja remover: "));
					lista.remove(pos-1);
				}else {
					lista.clear();
				}
				
			}else if (op == 3) {
				
				op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o para consulta:"
						+ "\n\n1 - Valor"
						+ "\n2 - posi��o"
						+ "\n3 - listar tudo"));
				
				if (op == 1) {
					valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor para buscar: "));
					JOptionPane.showMessageDialog(null, "O valor " + valor + " Foi encontrado na posi��o " + (lista.indexOf(valor) + 1));
				}else if (op == 2) {
					pos = Integer.parseInt(JOptionPane.showInputDialog("Em qual posi��o deseja buscar: "));
					JOptionPane.showMessageDialog(null, "O valor "+lista.get(pos -1));
				}else {
					JOptionPane.showMessageDialog(null, lista);
				}
				
			}else if (op == 4) {
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Error...");
			}
		}
	}

}

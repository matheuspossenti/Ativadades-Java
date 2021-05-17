package br.edu.ifcvideira.lista14;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
		public static void main(String[] args) {
			
			int pilha[] = new int[50];
			int i;
			int cont = 0;
			int op;
			int valor;
			
			String msg = "";
			
			for(;;) {
				op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
						+ "1 - Empilhar\n"
						+ "2 - Desempilhar\n"
						+ "3 - Consultar\n"
						+ "4 - Sair"));
				
				if(op == 1) {
					
					if(pilha[49] != 0) {
						JOptionPane.showMessageDialog(null, "A pilha está cheia!");
					} else {
						valor = Integer.parseInt(JOptionPane.showInputDialog("Qual valor você deseja empilhar: "));
						
						pilha[cont] = valor;
						cont++;
						
					}
					
				} else if (op == 2) {
					
					if(cont == 0) {
						JOptionPane.showMessageDialog(null, "A pilha está vazia!");
					} else {
						
						JOptionPane.showMessageDialog(null, "O valor " + pilha[cont - 1] + " foi desempilhado!");
						pilha[cont - 1] = 0;
						cont--;
					}
					
				} else if(op == 3) {
					
					if(cont == 0) {
						JOptionPane.showMessageDialog(null, "A pilha está vazia!");
					} else {
						
						msg += "Estrutura atual da pilha:\n";
						for(i = (cont - 1); i > 0; i--) {
							msg += pilha[i] + "\n";
						}
						JOptionPane.showMessageDialog(null, msg);
						msg = "";
						
					}
					
				} else if(op == 4) {
					JOptionPane.showMessageDialog(null, "Finalizando...");
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
				
			}

		}

	}
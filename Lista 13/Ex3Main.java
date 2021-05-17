package br.edu.ifcvideira.lista13;

import javax.swing.JOptionPane;

public class Ex3Main {
	public static void main(String[] args) {

		int vet[] = new int [50];
		int posi;
		int cont=0;
		int valor;
		int op;
		boolean achou = false;
		String msg = "";
		
		for (;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Voc� deseja:" + "\n"
					+ "\n1 - Inserir" + "\n"
					+ "2 - Buscar" + "\n"
					+ "3 - Remover" + "\n"
					+ "4 - Consultar" + "\n"
					+ "5 - Finalizar"));
			
			if (op == 5) {
				JOptionPane.showMessageDialog(null, "Finalizar...");
				break;
			} else if (op == 1) {
				
				op = Integer.parseInt(JOptionPane.showInputDialog("Voc� deseja inserir: \n"
						+ "\n1 - Posi��o Espec�fica" + "\n"
						+ "2 - Sequencialmente"));
				
				valor = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
				
				if (op == 1) {
					
					posi = Integer.parseInt(JOptionPane.showInputDialog("Posi��o: "));
					
					if (posi <= cont) {
						
						for (int i = cont; i >= posi; i--) {
							vet[i] = vet[i-1];
						}
						
						vet[posi-1] = valor;
						cont++; 
				
					} else {
						JOptionPane.showMessageDialog(null, "Inv�lido! Elementos: " + cont);
					}
					
				} else {
					vet[cont] = valor;
					cont++;
				}
				
			} else if (op==2) {
				
				op = Integer.parseInt(JOptionPane.showInputDialog("Voc� deseja buscar: \n"
						+ "\n1 - Posi��o" + "\n"
						+ "2 - Valor"));
				
				if (op == 1) {
					posi = Integer.parseInt(JOptionPane.showInputDialog("Posi��o: "));
				
					if (posi < cont) {
						JOptionPane.showMessageDialog(null, "Valor da posi��o escolhida: " + vet[posi-1]);
					} else {
						JOptionPane.showMessageDialog(null, "N�o h� nada nessa posi��o!");
					}
					
				} else {
				
					valor = Integer.parseInt(JOptionPane.showInputDialog("Voc� deseja buscar por qual valor: "));
				
					for (int i = 0; i < cont; i++) {
						
						if (valor == vet[i]) {
							JOptionPane.showMessageDialog(null, "Posi��o do valor desejado: " + (i+1));
							achou = true;
						}
						
					}
				
					if (achou == false) {
						JOptionPane.showMessageDialog(null, "Valor n�o encontrado!");
					}
					
				}
				
			} else if (op == 3) {
				
				op = Integer.parseInt(JOptionPane.showInputDialog("Voc� deseja retirar: \n"
						+ "\n1 - Buscar por posi��o" + "\n"
						+ "2 - Buscar por valor"));
				
				if (op == 1) {
					
					posi = Integer.parseInt(JOptionPane.showInputDialog("Remover qual posi��o: "));

					if (posi < cont) {
						
						for (int i = (posi-1); i <=cont; i++) {
							vet[i] = vet[i+1];
						}
						cont--;
					} else {
						JOptionPane.showMessageDialog(null, "Inv�lido! Elementos: "+cont);
					}
					
				} else {
					
					valor = Integer.parseInt(JOptionPane.showInputDialog("Remover qual valor: "));
				
					for (int i = 0; i < cont; i++) {
						
						if (valor == vet[i]) {
							
							for (int j = i; j < cont; j++) {
								vet[j] = vet [j+i];
							}
							cont--;
							i--;
							achou = true;
						}
						
					}
					
					if (achou == false) {
						JOptionPane.showMessageDialog(null, "Valor n�o encontrado!");
					}
					achou = false;
				}
				
			} else if (op == 4) {
				
				for (int i = 0; i < cont; i++) {
					msg += vet[i]+" ";
				}
				
				JOptionPane.showMessageDialog(null, "Lista: \n" + msg);
				msg = "";
				
			} else {
				JOptionPane.showMessageDialog(null, "Inv�lido, tente outra op��o!");
			}
			
		}
		
	}
}

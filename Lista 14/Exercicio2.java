package br.edu.ifcvideira.lista14;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main(String[] args) {
		int pilha[] = new int[5];
		int pilhaVip[] = new int[5];
		int cont = 0;
		int contVip = 0;
		int op;
		
		String msg=""; //imprimir_
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Entre com a opção desejada:\n"
					+ "1 - Adiocionar a fila\n"
					+ "2 - Atender o primeiro da fila\n"
					+ "3 - Adicionar a fila Vip\n"
					+ "4 - Atender a fila VIp\n"
					+ "5 - Consulta\n"
					+ "6 - Sair"));
			
			if (op == 1) { //inserir_
				if (pilha[4]==1) {
					JOptionPane.showMessageDialog(null, "A fila está cheia!");
				} else {
					pilha[cont]=1;
					cont++;
				}
			} else if (op == 2) { //remover_
				if (cont==0) { 				
					JOptionPane.showMessageDialog(null, "A fila está vazia!");
				} else if (contVip!=0) {
					JOptionPane.showMessageDialog(null, "Não é possivel atender alguém da fila de atendimento enquanto a fila prioritária não estiver vazia!");
				} else {
					pilha[cont-1]=0;
					cont--;
				}
			} else if (op == 3) { //inserirVip_
				if (pilhaVip[4]==1) {
					JOptionPane.showMessageDialog(null, "A fila prioritária está cheia!");
				} else {
					pilhaVip[contVip]=1;
					contVip++;
				}
			} else if (op == 4) { //removerVip_
				if (pilhaVip[0]==0) {
					JOptionPane.showMessageDialog(null, "A fila está vazia!");
				} else {
					pilhaVip[contVip-1]=0;
					contVip--;
				}
			} else if (op == 5) { //consultar_
				if ((cont == 0)&&(contVip == 0)) {
					JOptionPane.showMessageDialog(null, "As filas estão vazias!");
				} else {
					msg += "Estrutura atual da fila de atendimento:\n";
					for (int i = cont-1; i >= 0; i--) {
						msg += pilha[i] + "\n";
					}
					JOptionPane.showMessageDialog(null, msg);
					msg="Estrutura atal da fila prioritária:\n";
					for (int i = cont-1; i >= 0; i--) {
						msg += pilhaVip[i] + "\n";
					}
					JOptionPane.showMessageDialog(null, msg);
					msg="";
				}
			} else if (op == 6) { //sair_
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			}
		}
	}
}

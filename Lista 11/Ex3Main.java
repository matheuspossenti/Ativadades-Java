package br.edu.ifcvideira.lista11;

import javax.swing.JOptionPane;

public class Ex3Main {
	public static void main(String[] args) {
		
		double valor;
		String localizacao;
		
		int op;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor padrão do ingresso?"));
		
		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual ingresso gostaria de comprar: \n"
					+ "\n1- Ingresso Normal\n"
					+ "2- Ingresso VIP\n"
					+ "3- Camarote Inferior\n"
					+ "4- Camarote Superior\n"
					+ "5- Finalizar"));

			if (op == 1) {
				Ex3Normal no = new Ex3Normal(valor);
				
				no.imprime();
			} else if (op == 2) {
				Ex3VIP vip = new Ex3VIP(valor);
				
				vip.imprime();
			} else if (op == 3) {
				localizacao = String.valueOf(JOptionPane.showInputDialog("Qual a localização: "));
				
				Ex3CamaroteInf ci = new Ex3CamaroteInf(valor, localizacao);
				
				ci.imprime();
			} else if (op == 4) {
				Ex3CamaroteSup cs = new Ex3CamaroteSup(valor);
				
				cs.imprime();
			} else if (op == 5) {
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
			
		}
	}
}

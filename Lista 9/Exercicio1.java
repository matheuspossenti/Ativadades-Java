package br.edu.ifcvideira.lista9;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Contador cont = new Contador();
		
		int opcao;
		
		for(;;) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira: \n"
					+ "-1 para incrementar. \n"
					+ "-2 para decrementar. \n"
					+ "Qualquer número para finalizar. \n"
					+ "Numero: " + cont.getNumero()));
		
			if(opcao == 1) {
				cont.incremento();
			} else if(opcao ==2) {
				cont.decremento();
			} else {
				break;
			}
		}
	}
}
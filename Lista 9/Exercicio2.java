package br.edu.ifcvideira.lista9;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		InvertValor iv = new InvertValor();
		
		int opcao;
		
		iv.setN1(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n1: ")));
		iv.setN2(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n2: ")));
		
		for(;;) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para inverter os valores: \n"
					+ "Valor n1: " + iv.getN1() 
					+ "\nValor n2: " + iv.getN2()));
			
			if (opcao == 1) {
				iv.trocaValores();
			} else {
				break;
			}
		}
	}

}

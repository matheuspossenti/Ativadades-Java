package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex5Principal {

	static String animal;
	static int comprimento;
	static int patas;
	static String cor;
	static String ambiente;
	static double velocidade;
	
	public static void main(String[] args) {
		
		Ex5Animal an;
		int op;
		
		for (;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o animal para se cadastrar? \n\n"
					+ "1 - Peixe\n"
					+ "2 - Mamífero\n"
					+ "3 - Outro\n"
					+ "4 - Cancelar"));
			
			if (op == 4) {
				JOptionPane.showMessageDialog(null, "Finalizando...!");
				break;
			}
			
			recebe();
			
			if (op == 1) {
				
				String caracteristicas = String.valueOf(JOptionPane.showInputDialog("Insira as características do animal:"));
				
				an = new Ex5Peixe(animal, comprimento, patas, cor, ambiente, velocidade, caracteristicas);
				an.imprime();
				
			} else if (op == 2) {
				
				String alimento = String.valueOf(JOptionPane.showInputDialog("Insira a dieta do animal?"));
				
				an = new Ex5Mamifero(animal, comprimento, patas, cor, ambiente, velocidade, alimento);
				an.imprime();
				
			} else if (op == 3) {
				
				an = new Ex5Animal(animal, comprimento, patas, cor, ambiente, velocidade);
				an.imprime();
			}
			
		}
		
	}

	public static void recebe() {
		
		 animal = String.valueOf(JOptionPane.showInputDialog("Qual é o animal?"));
		 comprimento = Integer.parseInt(JOptionPane.showInputDialog("Qual o comprimento de " + animal + "?"));
		 patas = Integer.parseInt(JOptionPane.showInputDialog("Quantas patas ele possui?"));
		 cor = String.valueOf(JOptionPane.showInputDialog("Qual a cor do animal?"));
		 ambiente = String.valueOf(JOptionPane.showInputDialog("Qual o habitat do animal?"));
		 velocidade = Double.parseDouble(JOptionPane.showInputDialog("Qual a velocidade do animal?"));
	}
	
}

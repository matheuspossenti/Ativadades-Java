package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int pessoa;
		double valorCompra;
		
		System.out.println("Quanto o cliente gastou: ");
		valorCompra = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite 1 para funcionario, 2 para cliente especial e qualquer outro valor para cliente comum.");
		pessoa = Integer.parseInt(in.nextLine());
		
		if (pessoa == 1) {
			System.out.println("O valor total da compra é: " + (valorCompra - (valorCompra * 0.05)));
		} else if (pessoa == 2) {
			System.out.println("O valor total da compra é: " + (valorCompra - (valorCompra * 0.1)));
		} else {
			System.out.println("O valor total da compra é: " + valorCompra);
		}
		
		in.close();
	}
}

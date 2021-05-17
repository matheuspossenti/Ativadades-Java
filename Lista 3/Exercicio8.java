package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int qntParc;
		double valorConta;
		
		System.out.println("Qual foi o valor pago?");
		valorConta = Double.parseDouble(in.nextLine());
		
		System.out.println("Em quantas vezes foi parcelado?");
		qntParc = Integer.parseInt(in.nextLine());
		
		if (qntParc == 3) {
			System.out.println("O valor total foi: " + (valorConta * 1.1));
			System.out.println("O valor da prestação é: " + ((valorConta * 1.1) / 3));
		} else if (qntParc == 5) {
			System.out.println("O valor total foi: " + (valorConta * 1.2));
			System.out.println("O valor da prestação é: " + ((valorConta * 1.2) / 5));
		} else {
			System.out.println("Quantidade inválida.");
		}
		
		in.close();
	}

}

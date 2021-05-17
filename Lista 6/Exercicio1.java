package br.edu.ifcvideira.lista6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		int idade1a15 = 0;
		int idade16a30 = 0;
		int idade31a45 = 0;	
		int idade46a60 = 0;
		int idade60 = 0;
		
		for(int i = 0; i < 15; i++) {
			System.out.println("Entre com a idade:");
			idade = Integer.parseInt(in.nextLine());
			
			if (idade >= 1 && idade <= 15) {
				idade1a15++;
			} else if (idade >= 16 && idade <= 30) {
				idade16a30++;
			} else if (idade >= 31 && idade <= 45) {
				idade31a45++;
			} else if (idade >= 46 && idade <= 60) {
				idade46a60++;
			} else if (idade > 60) {
				idade60++;
			}
			
		}
		
		System.out.println("\nPessoas com 1-15 anos: " + idade1a15 + " ("+((idade1a15 * 100) /15) + "%)");
		System.out.println("Pessoas com 16-30 anos: " + idade16a30 + " ("+((idade16a30 * 100) /15) + "%)");
		System.out.println("Pessoas com 31-45 anos: " + idade31a45 + " ("+((idade31a45 * 100) /15) + "%)");
		System.out.println("Pessoas com 46-60 anos: " + idade46a60 + " ("+((idade46a60 * 100) /15) + "%)");
		System.out.println("Pessoas com mais de 60 anos: " + idade60 + " ("+((idade46a60 * 100) /15) + "%)");

		in.close();
	}

}

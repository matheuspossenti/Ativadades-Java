package br.edu.ifcvideira.lista6;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double media;
		
		for(int i = 0; i < 6; i++) {
			System.out.println("\nDigite a 1ª nota do aluno: ");
			nota1 = Double.parseDouble(in.nextLine());
			
			System.out.println("Digite a 2ª nota do aluno: ");
			nota2 = Double.parseDouble(in.nextLine());
			
			media = ((nota1 + nota2) / 2);
			
			if(media >= 7 && media <= 10) {
				System.out.println("Média: " + media);
				System.out.println("Aprovado");
			} else if(media >= 5.1 && media < 6.9) {
				System.out.println("Média: " + media);
				System.out.println("Recuperação");
			} else {
				System.out.println("Média: " + media);
				System.out.println("Reprovado");
			}
			
		}

		in.close();
	}

}

package br.edu.ifcvideira.lista6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		double peso;
		//
		int contador1a10 = 0;
		double peso1a10 = 0;
		//
		int contador11a20 = 0;
		double peso11a20 = 0;
		//
		int contador21a30 = 0;
		double peso21a30 = 0;
		//
		int contador30 = 0;
		double peso30 = 0;

		for(int i = 0; i < 15; i++) {
			System.out.println("Digite a idade:");
			idade = Integer.parseInt(in.nextLine());
			
			System.out.println("Digite o peso:");
			peso = Double.parseDouble(in.nextLine());
			
			if(idade >= 1 && idade <= 10) {
				peso1a10 += peso;
				contador1a10++;
			} else if(idade >= 11 && idade <= 20) {
				peso11a20 += peso;
				contador11a20++;
			} else if(idade >= 21 && idade <= 30) {
				peso21a30 += peso;
				contador21a30++;
			} else if(idade > 30) {
				peso30 += peso;
				contador30++;
			} 
			peso = 0;
		}
		
		System.out.println("\nMédia do peso de pessoas de 1 a 10 anos: " + (peso1a10 / contador1a10));
		System.out.println("Média do peso de pessoas de 11 a 20 anos: " + (peso11a20 / contador11a20));
		System.out.println("Média do peso de pessoas de 21 a 30 anos: " + (peso21a30 / contador21a30));
		System.out.println("Média do peso de pessoas maiores de 30 anos: " + (peso30 / contador30));
		
		in.close();
	}

}

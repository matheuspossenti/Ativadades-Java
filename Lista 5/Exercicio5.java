package br.edu.ifcvideira.lista5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int pessoas = 0;
		double altura;
		double maiorAltura = 0;
		double alturaMedia = 0;
		int contPess2m = 0;

		do {
			System.out.println("Qual a altura da pessoa: ");
			altura = Double.parseDouble(in.nextLine());
			
			if(altura > maiorAltura) {
				maiorAltura = altura;
			}
			
			alturaMedia += altura;
			
			if(altura > 2) {
				contPess2m++;
			}
			
			pessoas++;
			
		} while((pessoas < 20));
		
		System.out.println("\nMaior altura do grupo: " + maiorAltura);
		System.out.println("Altura média: " + (alturaMedia / pessoas));
		System.out.println("Pessoas com mais de 2 m: " + contPess2m);
		
		in.close();
	}
}
package br.edu.ifcvideira.lista6;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int canal;
		int pessoas;
		int totalPessoas = 0;
		int contador4 = 0;
		int contador5 = 0;
		int contador7 = 0;
		int contador12 = 0;

		for(;;) {
			System.out.println("Qual canal estava assistindo: ");
			canal = Integer.parseInt(in.nextLine());
			
			if(canal <= 0) {
				break;
			} 
			
			System.out.println("Quantas pessoas estavam assistindo: ");
			pessoas = Integer.parseInt(in.nextLine());
			
			if(canal == 4) {
				contador4++;
			} else if (canal == 5) {
				contador5++;
			} else if(canal == 7) {
				contador7++;
			} else if(canal == 12) {
				contador12++;
			}

			totalPessoas += pessoas;
		}
		
		System.out.println("\nPorcentagem de audiência no canal 4: " + ((contador4 * 100) / totalPessoas));
		System.out.println("Porcentagem de audiência no canal 5: " + ((contador5 * 100) / totalPessoas));
		System.out.println("Porcentagem de audiência no canal 7: " + ((contador7 * 100) / totalPessoas));
		System.out.println("Porcentagem de audiência no canal 4: " + ((contador12 * 100) / totalPessoas));
		
	}

}

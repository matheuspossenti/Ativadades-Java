package br.edu.ifcvideira.lista6;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		int maior = 0;
		int menor = 99999999;

		for (;;) {
			System.out.println("Digite um n�mero: ");
			num = Integer.parseInt(in.nextLine());
			
			if(num <= 0) {
				break;
			}
			
			if(num > maior) {
				maior = num;
			}
			
			if(num < menor) {
				menor = num;
			}
		}
		
		System.out.println("\nMaior n�mero: " + maior);
		System.out.println("Menor n�mero: " + menor);
		
		in.close();
	}
}

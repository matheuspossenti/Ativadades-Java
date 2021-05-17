package br.edu.ifcvideira.lista4;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = 1;
		int media = 0;
		int contador = 0;
		
		while (2 > 1) {
			System.out.println("Digite um número: ");
			num = Integer.parseInt(in.nextLine());
			
			if (num == 0) {
				break;
			} else if (num % 2 == 0) {
				media += num;
				contador++;
			}
			
		}
		
		System.out.println("\nA média dos numeros pares é: " + (media / contador));
		
		in.close();
	}

}

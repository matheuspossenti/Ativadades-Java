// Ler um valor e escrever se é positivo, negativo ou zero.

package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = Integer.parseInt(in.nextLine());
		
		if (numero > 0) {
			System.out.println("Número é positivo!");
		} else if (numero < 0) {
			System.out.println("Número é negativo!");
		} else {
			System.out.println("Número zero!");
		}
		
		in.close();
	}
}

// Ler um valor e escrever se � positivo, negativo ou zero.

package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = Integer.parseInt(in.nextLine());
		
		if (numero > 0) {
			System.out.println("N�mero � positivo!");
		} else if (numero < 0) {
			System.out.println("N�mero � negativo!");
		} else {
			System.out.println("N�mero zero!");
		}
		
		in.close();
	}
}

package br.edu.ifcvideira.lista4;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero = 1;
		int contadorNeg = 0;
		
		while(numero != 0) {
			System.out.println("Digite um número: ");
			numero = Integer.parseInt(in.nextLine());
			
			if(numero < 0) {
				contadorNeg++;
			}
		}
		
		System.out.println("Foram digitados " + contadorNeg + " numeros negativos");
		
		in.close();
	}

}

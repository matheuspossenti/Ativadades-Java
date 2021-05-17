//Faça um algoritmo que calcule a média de quatro números inteiros. Os
//números devem ser dados pelo usuário


package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		double num4;
		double media;
		
		System.out.println("Número 1 da média: ");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Número 2 da média: ");
		num2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Número 3 da média: ");
		num3 = Double.parseDouble(in.nextLine());
		
		System.out.println("Número 4 da média: ");
		num4 = Double.parseDouble(in.nextLine());
		
		media = (num1 + num2 + num3 + num4) / 4;
		
		System.out.println("A média dos números é: " + media);
		
		in.close();
	}
}

//Fa�a um algoritmo que calcule a m�dia de quatro n�meros inteiros. Os
//n�meros devem ser dados pelo usu�rio


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
		
		System.out.println("N�mero 1 da m�dia: ");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("N�mero 2 da m�dia: ");
		num2 = Double.parseDouble(in.nextLine());
		
		System.out.println("N�mero 3 da m�dia: ");
		num3 = Double.parseDouble(in.nextLine());
		
		System.out.println("N�mero 4 da m�dia: ");
		num4 = Double.parseDouble(in.nextLine());
		
		media = (num1 + num2 + num3 + num4) / 4;
		
		System.out.println("A m�dia dos n�meros �: " + media);
		
		in.close();
	}
}

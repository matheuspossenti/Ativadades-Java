//Ler 3 valores e escrever o maior deles (Considerando valores distintos)

package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		
		System.out.println("N�mero 1: ");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("N�mero 2: ");
		num2 = Double.parseDouble(in.nextLine());
		
		System.out.println("N�mero 3: ");
		num3 = Double.parseDouble(in.nextLine());
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("N�mero 1 � maior que os outros n�meros!");
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("N�mero 2 � maior que os outros n�meros!");
		} else {
			System.out.println("N�mero 3 � maior que os outros n�meros");
		}
		
		in.close();
	}
}
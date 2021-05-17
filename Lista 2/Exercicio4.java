package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Qual número 1: ");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual número 2: ");
		num2 = Double.parseDouble(in.nextLine());
		
		if (num1 > num2) {
			System.out.println(num1 + " é maior que " + num2);
		} else if (num1 == num2) {
			System.out.println("Os números são iguais");
		} else {
			System.out.println(num2 + " é maior que " + num1);
		}
		
		in.close();
	}
}

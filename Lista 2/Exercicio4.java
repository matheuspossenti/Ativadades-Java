package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Qual n�mero 1: ");
		num1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual n�mero 2: ");
		num2 = Double.parseDouble(in.nextLine());
		
		if (num1 > num2) {
			System.out.println(num1 + " � maior que " + num2);
		} else if (num1 == num2) {
			System.out.println("Os n�meros s�o iguais");
		} else {
			System.out.println(num2 + " � maior que " + num1);
		}
		
		in.close();
	}
}

package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int val1;
		int val2;
		int val3;
		
		System.out.println("Digite o primeiro valor: ");
		val1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o segundo valor: ");
		val2 = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite o terceiro valor: ");
		val3 = Integer.parseInt(in.nextLine());
		
		if ((val1<val2) && (val1<val3)) {
			System.out.println("A soma dos dois maiores valores é: " + (val2+val3));
		}else if(val2<val3) {
			System.out.println("A soma dos dois maiores valores é: " + (val1+val2));
		}else {
			System.out.println("A soma dos dois maiores valores é: " + (val1+val2));
		}
		in.close();
	}
}

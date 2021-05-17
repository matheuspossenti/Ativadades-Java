package br.edu.ifcvideira.lista6;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		double altura;
		double altura50 = 0;
		int contPess50 = 0;
		
		for(;;) {
			System.out.println("Entre com a idade");
			idade = Integer.parseInt(in.nextLine());
			
			if(idade <= 0) {
				break;
			}
			
			System.out.println("Entre com a altura");
			altura = Double.parseDouble(in.nextLine());
			
			if (idade > 50) {
				altura50 += altura;
				contPess50++;
			}
			
		}
		
		System.out.println("\nAltura média de pessoas maiores de 50 anos: " + (altura50/contPess50));
		
		in.close();

	}

}

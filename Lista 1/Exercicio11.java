//Faça um algoritmo para calcular e exibir o valor de uma prestação em atraso.
//prestacao_atrasada <- prestacao + (prestacao*(taxa/100)*num_dias_atraso), taxa
//é o percentual de juros por dia, num_dias_atraso é o número de dias em atraso e
//prestação é o valor da prestação normal. O valor da prestação, a taxa e o número
//de dias em atraso devem ser fornecidos pelo usuário.

package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double valorPrest;
		double taxa;
		double numDias;
		double prestAtras;
		
		System.out.println("Qual o valor da prestação: ");
		valorPrest = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual a taxa: ");
		taxa = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o número de dias em atraso: ");
		numDias = Double.parseDouble(in.nextLine());
		
		prestAtras = valorPrest + (valorPrest + (taxa / 100) * numDias);
		
		System.out.println("O valor da prestação atrasada é de: R$" + prestAtras);

		in.close();
		
	}
}

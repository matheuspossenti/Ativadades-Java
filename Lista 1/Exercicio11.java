//Fa�a um algoritmo para calcular e exibir o valor de uma presta��o em atraso.
//prestacao_atrasada <- prestacao + (prestacao*(taxa/100)*num_dias_atraso), taxa
//� o percentual de juros por dia, num_dias_atraso � o n�mero de dias em atraso e
//presta��o � o valor da presta��o normal. O valor da presta��o, a taxa e o n�mero
//de dias em atraso devem ser fornecidos pelo usu�rio.

package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double valorPrest;
		double taxa;
		double numDias;
		double prestAtras;
		
		System.out.println("Qual o valor da presta��o: ");
		valorPrest = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual a taxa: ");
		taxa = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o n�mero de dias em atraso: ");
		numDias = Double.parseDouble(in.nextLine());
		
		prestAtras = valorPrest + (valorPrest + (taxa / 100) * numDias);
		
		System.out.println("O valor da presta��o atrasada � de: R$" + prestAtras);

		in.close();
		
	}
}

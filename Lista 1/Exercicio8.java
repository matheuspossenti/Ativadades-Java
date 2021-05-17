// Faça um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e
// escrever o valor correspondente em graus Celsius ( C=(F-32)/1.8)

package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double fah;
		double celsius;
		
		System.out.println("Qual a temperatura em Fahrenheit: ");
		fah = Double.parseDouble(in.nextLine());
		
		celsius = (fah-32)/1.8;
		
		System.out.println("A temperatura em Celsius é de: " + celsius + "°C");
		
		in.close();
	}
}

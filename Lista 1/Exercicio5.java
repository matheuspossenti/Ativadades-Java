// – Faça um algoritmo para calcular o volume de um cilindro (pi*r^2*h) //

package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double raio;
		double altura;
		double area;
		
		System.out.println("Qual é o raio do cilindro: ");
		raio = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual é a altura do cilindro: ");
		altura = Double.parseDouble(in.nextLine());
		
		area = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.println("A área do cilindro é: " + area);
		
		in.close();
	}
}

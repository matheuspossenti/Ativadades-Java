package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double raio;
		double area;
		
		System.out.println("Qual o raio da esfera:");
		raio = Double.parseDouble(in.nextLine());
		
		area = 4 * Math.PI * Math.pow(raio, 2);
		
		System.out.println("A �rea do esfera de raio " + raio + " �: " +area);
		
		in.close();
	}
}

// Faça um algoritmo para calcular o volume de uma esfera((4*pi*r^3)/3)  //

package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double raio;
		double volume;
		
		System.out.println("Qual o raio da esfera: ");
		raio = Double.parseDouble(in.nextLine());
		
		volume = ( 4 * Math.PI * Math.pow(raio, 3) ) / 3;
		
		System.out.println("O volume da esfera é: " + volume);
		
		in.close();
	}
}

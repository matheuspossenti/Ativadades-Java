// Fa�a um algoritmo que receba do usu�rio uma quantidade de chuva dada em
// polegadas e exiba o equivalente em mil�metros (25,4 mm = 1 polegada).

package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double chuvaPol;
		double chuvaMm;
		
		System.out.println("Quantos choveu? (Em polegadas): ");
		chuvaPol = Double.parseDouble(in.nextLine());
		
		chuvaMm = chuvaPol * 25.4;
		
		System.out.println("Choveu " + chuvaMm + "mm");
		
		in.close();
	}
}

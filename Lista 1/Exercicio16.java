// Fa�a um algoritmo que calcule a massa espec�fica de um fluido (masEsp=massa/volume).
// A massa e o volume devem ser informadas pelo usu�rio.


package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double massa;
		double volume;
		double masEsp;
		
		System.out.println("Qual a massa do fluido: ");
		massa = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o volume do fluido: ");
		volume = Double.parseDouble(in.nextLine());
		
		masEsp = massa / volume;
		
		System.out.println("A massa espec�fica do fluido � de: " + masEsp + " kg/m�");
		
		in.close();
	}
}

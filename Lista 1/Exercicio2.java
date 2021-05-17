//2 – Faça um algoritmo para calcular a área de um cubo retangular
//((h*l)+(h*b)+(l*b))*2

package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double altura;
		double lado;
		double base;
		double area;
		
		System.out.println("Qual a altura do cubo: ");
		altura = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o lado do cubo: ");
		lado = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual a base do cubo: ");
		base = Double.parseDouble(in.nextLine());
		
		area = ((altura * lado) + (altura * base) + (lado * base)) * 2;
		
		System.out.println("A área do cubo é: "+ area);
		
		in.close();
	}
}

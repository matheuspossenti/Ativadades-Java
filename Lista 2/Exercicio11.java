//Fa�a um programa que receba um valor qualquer, ao usu�rio digitar 1
//converta para m2, ao usu�rio digitar 2, converta para m3


package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double valor;
		int conv;
		double resul;
		
		System.out.println("Digite o valor a ser convertido: ");
		valor = Double.parseDouble(in.nextLine());
		
		System.out.println("Se deseja converter para m� digite 1, se deseja converter para m� digite 2");
		conv = Integer.parseInt(in.nextLine());
		
		if(conv == 1) {
			resul = valor / 10000;
			System.out.println("Valor convertido: " + resul + "m�");
		} else {
			resul = valor / 1000000;
			System.out.println("Valor convertido: " + resul + "m�");
		}
		
		in.close();
	}
}

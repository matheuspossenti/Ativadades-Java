package br.edu.ifcvideira.lista4;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		int a1;
		int r;
		int contador = 0;
		int soma = 0;
		
		System.out.println("Qual numero de termos da progress�o: ");
		n = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual primeiro termo da progress�o: ");
		a1 = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual raz�o da progress�o:");
		r = Integer.parseInt(in.nextLine());
		
		while (contador < n) {
			System.out.print(a1 + "  ");
			soma += a1;
			a1 += r;
			contador++;
		}
		
		System.out.println("\nA soma da progress�o �: " + soma);
		
		in.close();
	}

}

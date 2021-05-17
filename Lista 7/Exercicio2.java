package br.edu.ifcvideira.lista7;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int v[] = new int[20];

		int i=0;
		boolean flag = false;
		for(i=0; i<20; i++) {
			System.out.println("Insira o valor " + (i+1));
			v[i] = Integer.parseInt(in.next());
		}
		
		for(i=0; i<20; i++) {
			if(v[i]==10) {
				System.out.println("Um número igual a 10 foi encontrado na posição: " + (i+1));
				flag = true;
			}
		}

		if (flag == false) {
			System.out.println("Nenhum número igual a 10 foi encontrado.");
		}
		
		in.close();
	}

}

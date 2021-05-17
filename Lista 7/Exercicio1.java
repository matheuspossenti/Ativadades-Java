package br.edu.ifcvideira.lista7;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int i;
		int flag=0;
		
		for(i=0; i<10; i++) {
			System.out.println("Insira o valor para a posição "+(i+1));
			vetor[i] = Integer.parseInt(in.nextLine());
		}
		
		for (i=0; i<10; i++) {
			if(vetor[i] >20) {
				if(flag==0) {
					System.out.println("Os valores maiores que 20 são: ");
				}
				System.out.println(vetor[i]);
				flag=1;
			}
		}
		
		if(flag==0) {
			System.out.println("Nenhum dos números são maiores que 20!");
		}
		
		in.close();
	}
}

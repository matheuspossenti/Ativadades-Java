package br.edu.ifcvideira.lista7;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		int i;
		int par=0;
		
		System.out.println("Qual ser� o tamanho do vetor? ");
		n = Integer.parseInt(in.next());
		
		int v[] = new int[n];
		
		for(i=0 ; i<n; i++) {
			System.out.println("Insira o valor "+(i+1));
			v[i] = Integer.parseInt(in.next());
			
		}
		
		for(i=0 ; i<n; i++) {
			if((v[i] % 2 ==0)&&(v[i] != 0 )) {
				par += v[i];
			}
		}
		
		System.out.println("A soma dos n�meros pares s�o: " + par);
		
		in.close();
	}

}

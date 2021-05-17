package br.edu.ifcvideira.lista7;

import java.util.Scanner;

public class Exercício4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n[] = new int[12];
		int x[] = new int[12];
		int y[] = new int[12];
		
		int i = 0;
		
		for(i=0; i<12; i++) {
			System.out.println("Insira o valor " + (i+1));
			n[i] = Integer.parseInt(in.next());
		}
		
		for(i=0; i<12; i++) {
			if(n[i]%3==0 && n[i]%2==0) {
				x[i] = n[i];
			} else if(n[i]%5==0) {
				y[i] = n[i];
			}
		}
		
		System.out.println("Pares divisíveis por 3: ");
		for(i=0; i<12; i++) {
			if(x[i] != 0){
				System.out.println(x[i]);
			}
		}
		
		System.out.println("Impares divisiveis por 5: ");
		for(i=0; i<12; i++) {
			if(y[i] != 0){
				System.out.println(y[i]);
			}
		}
		
		in.close();
	}
}

package br.edu.ifcvideira.lista7;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade[] = new int[5];
		double alt[] = new double[5];
		int i;
		
		
		for(i=0; i<5; i++) {
			System.out.println("Insira a idade da pessoa "+(i+1));
			idade[i] = Integer.parseInt(in.next());
			
			System.out.println("Insira a altura da pessoa "+(i+1));
			alt[i] = Double.parseDouble(in.next());
			
		}
		
		for(i=4; i>=0; i--) {
			System.out.println(idade[i]);
			
			System.out.println(alt[i]);
		}
		
		in.close();
	}
}
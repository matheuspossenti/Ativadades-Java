package br.edu.ifcvideira.lista5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a;
		int parCont = 0;
		int imparCont = 0;
		int posiCont = 0;
		int negaCont = 0;

		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um valor para a");
			a = Integer.parseInt(in.nextLine());
			
			if(a % 2 == 0) {
				parCont++;
			} else {
				imparCont++;
			}
			
			if(a >= 0) {
				posiCont++;
			} else {
				negaCont++;
			}
		}
		
		System.out.println("\nNumeros pares: " + parCont);
		System.out.println("Numeros ímpares: " + imparCont);
		System.out.println("Numeros positivos: " + posiCont);
		System.out.println("Numeros negativos: " + negaCont);
		
		in.close();
	}

}

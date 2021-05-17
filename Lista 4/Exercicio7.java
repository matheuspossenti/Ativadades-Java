package br.edu.ifcvideira.lista4;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int voto;
		int contadorCand1 = 0;
		int contadorCand2 = 0;
		int contadorCand3 = 0;
		int contadorCand4 = 0;
		int contadorNulo = 0;
		int contadorBranco = 0;

		while (2 > 1) {
			System.out.println("Em qual candidato você vai votar:");
			voto = Integer.parseInt(in.nextLine());
			
			if (voto == 0) {
				System.out.println("\nFim da votação");
				break;
			} else if (voto == 1) {
				contadorCand1++;
			} else if (voto == 2) {
				contadorCand2++;
			} else if (voto == 3) {
				contadorCand3++;
			} else if (voto == 4) {
				contadorCand4++;
			} else if (voto == 5) {
				contadorNulo++;
			} else if (voto == 6) {
				contadorBranco++;
			}
			
		}
		
		System.out.println("\nO candidato 1 recebeu " + contadorCand1 + " votos");
		System.out.println("O candidato 2 recebeu " + contadorCand2 + " votos");
		System.out.println("O candidato 3 recebeu " + contadorCand3 + " votos");
		System.out.println("O candidato 4 recebeu " + contadorCand4 + " votos");
		System.out.println("Tiveram " + contadorNulo + " votos nulos");
		System.out.println("Tiveram " + contadorBranco + " votos brancos");
		
		in.close();
	}

}

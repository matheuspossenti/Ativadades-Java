package br.edu.ifcvideira.lista4;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int multiplo = 0;
		
		while( multiplo <= 1000) {
			if (multiplo % 10 == 0) {
				System.out.println(multiplo);
			}
			multiplo++;
		}
	}

}

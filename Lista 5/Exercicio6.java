package br.edu.ifcvideira.lista5;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double popA = 90000000;
		double popB = 140000000;
		int anos = 0;
		
		do {
			popA *= 1.035;
            popB *= 1.01;
            anos++;
		} while(popB > popA);
		
		System.out.println("Serão necessários: " + anos + " anos.");

	}

}

package br.edu.ifcvideira.lista4;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int joao = 150;
		int ze = 110;
		int contAno = 0;
		
		while(joao > ze) {
			joao += 2;
			ze += 3;
			contAno++;
		}
		
		System.out.println("Foram necessários " + contAno + " anos.");
	}

}

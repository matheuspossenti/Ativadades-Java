package br.edu.ifcvideira.lista8;

import java.util.Random;

public class Exercicio8 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int matriz[][] = new int[6][3];
		int i;
		int j;
		int posicaoMaior[] = new int[2];
		int posicaoMenor[] = new int[2];
		int menor=9999;
		int maior=0;
		
		for(i=0; i<6; i++) {
			for(j=0; j<3; j++) {
				
				matriz[i][j] = r.nextInt(10);
				
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					posicaoMaior[0]=i;
					posicaoMaior[1]=j;
				}
				
				if(matriz[i][j] < menor) {
					menor = matriz[i][j];
					posicaoMenor[0]=i;
					posicaoMenor[1]=j;
				}
			}
		}
		
		for(i=0; i<6; i++) {
			for(j=0; j<3; j++) {
				System.out.print(matriz[i][j] + "    ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("\n" + "Maior numero da matriz é: " + maior + "\n" + "Sua posição na matriz é: " + posicaoMaior[0] + ", " + posicaoMaior[1]);
		System.out.println("\n" + "Menor numero da matriz é: " + menor + "\n" + "Sua posição na matriz é: " + posicaoMenor[0] + ", " + posicaoMenor[1]);

	}

}

package br.edu.ifcvideira.lista8;

import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int matriz1[][] = new int [5][5];
		int matriz2[][] = new int [5][5];
		int i;
		int j;
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				matriz1[i][j] = r.nextInt(10);
				matriz2[i][j] = (int) Math.pow(matriz1[i][j], 3);
			}
		}
		
		System.out.println("Matriz 1: \n");
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				
				System.out.print(matriz1[i][j]+"    ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("\nMatriz 2: " + "\n");
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				
				System.out.print(matriz2[i][j]+"    ");
				
			}
			
			System.out.println();
			
		}
	}
}
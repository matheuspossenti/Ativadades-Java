package br.edu.ifcvideira.lista8;

import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int matriz[][] = new int [3][4];
		int i;
		int j;
		
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				matriz[i][j] = r.nextInt(10);
			}
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<4; j++) {
				System.out.print(matriz[i][j]+"    ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("\nElemento do canto superior esquerdo: " + matriz[0][0]);
		System.out.println("Elemento do canto inferior esquerdo: " + matriz[2][0]);

	}

}

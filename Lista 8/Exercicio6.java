package br.edu.ifcvideira.lista8;

public class Exercicio6 {

	public static void main(String[] args) {
		int matriz[][] = new int [7][8];
		int i;
		int j;
		
		for(i=0; i<7; i++) {
			for(j=0; j<8; j++) {
				matriz[i][j] = i+j;
			}
		}
		
		for(i=0; i<7; i++) {
			for(j=0; j<8; j++) {
				System.out.print(matriz[i][j]+"    ");
			}
			
			System.out.println();
		}

	}
}
package br.edu.ifcvideira.lista8;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int matriz[][] = new int [5][5];
		int i;
		int j;
		int l4=0;
		int c2=0;
		int dp=0;
		int ds=0;
		int total=0;
		
		for(i=0; i<5; i++) {
			for(j=0 ; j<5 ; j++) {
				matriz[i][j] = r.nextInt(10);
				
				if (i==3) {
					l4 += matriz[i][j];
				}
				
				if(j == 1) {
					c2 += matriz[i][j];
				}
				
				if (i==j) {
					dp += matriz[i][j];
				}
				
				if((i+j)==4) {
					ds += matriz[i][j];
				}
				
				total += matriz[i][j];
			}
		}
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print(matriz[i][j]+"    ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("A soma da linha 4 é: " + l4);
		System.out.println("A soma da coluna 2 é: " + c2);
		System.out.println("A soma da diagonal principal é: " + dp);
		System.out.println("A soma da diagonal secundaria é: " + ds);
		System.out.println("A soma total da matriz é: " + total);
		
	}
	
}
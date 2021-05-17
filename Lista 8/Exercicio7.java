package br.edu.ifcvideira.lista8;

import java.util.Random;

public class Exercicio7 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int matriz[][] = new int[5][6];
		int i;
		int j;
		int somaPares=0;
		int contPares=0;
		double media=0;
		
		for(i=0; i<5; i++) {
			for(j=0; j<6; j++) {
				matriz[i][j] = r.nextInt(10);
				
				if((matriz[i][j] % 2 == 0) && (matriz[i][j]!=0)) {
					somaPares += matriz[i][j];
					contPares++;
				}
			}
		}
		
		for(i=0; i<5; i++) {
			for(j=0; j<6; j++) {
				System.out.print(matriz[i][j]+"    ");
			}
			
			System.out.println();
			
		}
		
		media = somaPares/contPares;
		
		System.out.println("Media dos numeros pares é: " + media);

	}

}

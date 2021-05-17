package br.edu.ifcvideira.lista8;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int matriz[][] = new int [7][4];
		int i;
		int j;
		int menor=9999;
		int posI = 0;
		int posJ = 0;
		
		for(i=0; i<7; i++) {
			for(j=0; j<4; j++) {
				matriz[i][j] = r.nextInt(10);
				
				if(matriz[i][j] < menor) {
					menor = matriz[i][j];
					posI = i;
					posJ = j;
				}
			}
		}
		
		for(i=0; i<7; i++) {
			for(j=0; j<4; j++) {
				System.out.print(matriz[i][j] + "    ");
			}
			
			System.out.println();
			
		}
		
		System.out.println("O menor valor é: " + menor + " e sua posição é: " + posI + ", " + posJ);
		
		in.close();
	}
}
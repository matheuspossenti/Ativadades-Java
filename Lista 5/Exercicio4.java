package br.edu.ifcvideira.lista5;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jogador1 = 0;
		int jogador2 = 0;
		int ponto;
		
		do {
			System.out.println("Quem marcou o ponto:\n" + "1 - Jogador 1\n" + "2 - Jogador 2");
			
			ponto = Integer.parseInt(in.nextLine());
			if(ponto == 1) {
				jogador1++;
			} else if(ponto == 2) {
				jogador2++;
			} else {
				System.out.println("Jogador inexistente.");
			}
			
		} while ( ((jogador1 < 11) || (jogador1 < (jogador2 + 2))) && ((jogador2 < 11) || (jogador2 < (jogador1 + 2))) );
		
		System.out.println("\nPlacar final: \n" + "\nJogador 1: " + jogador1 + "\n" + "Jogador 2: " + jogador2);
		
		if(jogador1 > jogador2) {
			System.out.println("\nJogador 1 ganhou!");
		} else {
			System.out.println("\nJogador 2 ganhou!");
		} 
		
		in.close();
	}
}
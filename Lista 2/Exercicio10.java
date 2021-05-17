//Leia quantos gols o TIME A marcou em uma partida e leia quantos gols o
//TIME B marcou. Escrever o nome do vencedor. Caso não haja vencedor deverá
//ser impressa a palavra EMPATE.

package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int timeA;
		int timeB;
		
		System.out.println("Quantos gols o time A fez: ");
		timeA = Integer.parseInt(in.nextLine());
		
		System.out.println("Quantos gols o time B fez: ");
		timeB = Integer.parseInt(in.nextLine());
		
		if(timeA > timeB) {
			System.out.println("O time A venceu!");
		} else if(timeB > timeA) {
			System.out.println("O time B venceu!");
		} else {
			System.out.println("O jogo empatou!");
		}
		
		in.close();
	}
}

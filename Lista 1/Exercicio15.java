//Faça um algoritmo que leia o nome de um piloto, leia a distância percorrida
//em km e o tempo que o piloto levou para percorrê-la (em horas). O algoritmo deve
//calcular a velocidade média (velocidade = distancia / tempo) - em km/h, e exibir a
//seguinte frase:
//A velocidade média do <nome do piloto> foi <velocidade media calculada> km/h.

package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		double dist;
		double tempo;
		double velMed;
		
		System.out.println("Qual o nome do piloto: ");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Qual a distancia percorrida(Em km): ");
		dist = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o tempo que ele levou(Em horas): ");
		tempo = Double.parseDouble(in.nextLine());
		
		velMed = dist / tempo;
		
		System.out.println("A velocidade média do " + nome + " foi " + velMed + " km/h.");
		
		in.close();
	}
}

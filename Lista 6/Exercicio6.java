package br.edu.ifcvideira.lista6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jog = 0;
		int times = 0;
		int idade;
		double peso;
		double mediaIdadeTime = 0;
		double mediaPesoTime = 0;
		double mediaIdadeTT = 0;
		double mediaPesoTT = 0;

		for (times = 0; times < 40; times++) {
			System.out.println("Dados do time: " + (times+1));
			for(jog = 0; jog<23;jog++) {
				System.out.println("Digite a idade do jogador: " + (jog+1));
				idade = Integer.parseInt(in.nextLine());
				
				System.out.println("Digite o peso do jogador: ");
				peso = Double.parseDouble(in.nextLine());
				
				mediaIdadeTime += idade;
				mediaPesoTime += peso;
			}
			System.out.println("A média de idade do time " + (times + 1) + " é: " + (mediaIdadeTime/jog));
			System.out.println("A média de idade do time " + (times + 1) + " é: " + (mediaPesoTime/jog));
			
			mediaIdadeTT += mediaIdadeTime;
			mediaPesoTT += mediaPesoTime;
			
			mediaIdadeTime = 0;
			mediaPesoTime = 0;
		}
		
		System.out.println("A média de idade no campeonato é: " + (mediaIdadeTT/(jog*times)));
		System.out.println("A média de idade no campeonato é: " + (mediaPesoTT/(jog*times)));
		
		in.close();
	}

}

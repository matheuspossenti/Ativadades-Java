package br.edu.ifcvideira.lista6;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		int sexo;
		int experiencia;
		//
		int femContador = 0;
		int mascContador = 0;
		//
		int mediaIdadeMascExp = 0;
		int mascIdadeExpCont = 0;
		//
		int cont45 = 0;
		int cont35 = 0;
		//
		int menorIdade = 9999999;

		for(;;) {
			System.out.println("Qual a idade do candidato: ");
			idade = Integer.parseInt(in.nextLine());
			
			if(idade <= 0) {
				break;
			}
			
			System.out.println("Qual o sexo do candidato: (M = 1 e F = 2)");
			sexo = Integer.parseInt(in.nextLine());
			
			System.out.println("O candidato possue experiência: (S = 1 e N = 2)");
			experiencia = Integer.parseInt(in.nextLine());
			
			if(sexo == 1) {
				mascContador++;
				if(idade > 45) {
					cont45++;
				}
			} else if(sexo == 2) {
				femContador++;
			}
			
			if(sexo == 1 && experiencia == 1) {
				mediaIdadeMascExp += idade;
				mascIdadeExpCont++;
			}
			
			if(sexo == 2 && experiencia == 1 && idade < 35) {
				cont35++;
			}
			
			if(sexo == 2 && idade < menorIdade && experiencia == 1) {
				menorIdade = idade;
			} 
			
		}
		
		System.out.println("\nCandidatos do sexo masculino: " + mascContador);
		System.out.println("Candidatos do sexo feminino: " + femContador);
		System.out.println("Idade media dos homens que ja tem experiencia: " + (mediaIdadeMascExp / mascIdadeExpCont));
		System.out.println("Porcentagem de homens com experiencia com mais de 45 anos: " + ((cont45 * 100) / mascContador) + "%");
		System.out.println("Mulheres com menos de 35 anos com experiencia: " + cont35);
		System.out.println("Menor idade das mulheres com experiencia: " + menorIdade);
		
		in.close();
	}
}

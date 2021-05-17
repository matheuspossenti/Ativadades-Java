//Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma
//mensagem que diga se ela poderá ou não votar este ano (não é necessário
//considerar o mês em que a pessoa nasceu)

package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoAtual;
		int anoNasc;
		int age;
		
		System.out.println("Qual o ano atual: ");
		anoAtual = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual o ano em que nasceu: ");
		anoNasc = Integer.parseInt(in.nextLine());
		
		age = anoAtual - anoNasc;
		
		if (age >= 16) {
			System.out.println("Você pode votar este ano!");
		} else {
			System.out.println("Infelizmente você não poderá votar este ano!");
		}
		
		in.close();
	}
}

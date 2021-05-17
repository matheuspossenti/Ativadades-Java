package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		int sexo;
		
		System.out.println("Qual seu nome: ");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Qual seu sexo? Use 1 para masculino e 2 para feminino: ");
		sexo = Integer.parseInt(in.nextLine());
		
		if (sexo == 1) {
			System.out.println("Excelentíssimo Sr. " + nome);
		} else if (sexo == 2) {
			System.out.println("Excelentíssima Sra. " + nome);
		} else {
			System.out.println("Sexo inválido");
		}
		
		in.close();
	}
}

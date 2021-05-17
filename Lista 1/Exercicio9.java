package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salarioAtual;
		double salarioReaj;
		
		System.out.println("Qual o salario atual: ");
		salarioAtual = Double.parseDouble(in.nextLine());
		
		// salarioReaj = salarioAtual + salarioAtual * 23.75 / 100; //
		salarioReaj = salarioAtual * 1.2375;
		
		System.out.println("O salario reajustado é: R$" + salarioReaj);
		
		in.close();
	}
}

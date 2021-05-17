package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome;
		double salAtual;
		double percAumento;
		double salCorrigido;
		
		System.out.println("Qual seu nome: ");
		nome = String.valueOf(in.nextLine());
		
		System.out.println("Qual seu salário atual: ");
		salAtual = Double.parseDouble(in.nextLine());
		
		if (salAtual <= 300) {
			percAumento = 0.1;
		} else if (salAtual > 300.01 && salAtual <= 600) {
			percAumento = 0.11;
		} else if (salAtual > 600.01 && salAtual <= 900) {
			percAumento = 0.12;
		} else if (salAtual > 900.01 && salAtual <= 1500) {
			percAumento = 0.06;
		} else if (salAtual > 1500.01 && salAtual <= 2000) {
			percAumento = 0.03;
		} else{
			percAumento = 0;
		}
		
		salCorrigido = salAtual + (salAtual * percAumento);
		
		System.out.println(nome + " com salário de R$ " + salAtual + " teve um aumento de " + percAumento + "% e seu salário ficará em R$ " + salCorrigido);
		
		in.close();
	}
}

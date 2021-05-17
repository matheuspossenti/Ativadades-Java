package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int operacao;
		double raio;
		double area;
		double perimetro;
		
		System.out.println("Digite 1 para área e 2 para perímetro.");
		operacao = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual raio da sua circunferencia?");
		raio = Double.parseDouble(in.nextLine());
		
		if (operacao == 1) {
			area = (Math.PI * Math.pow(raio, 2));
			System.out.println("Área: " + area);
		} else if (operacao == 2) {
			perimetro = (2 * Math.PI * raio);
			System.out.println("Perímetro: " + perimetro);
		} else {
			System.out.println("Valor inválido.");
		}
		
		in.close();
	}

}

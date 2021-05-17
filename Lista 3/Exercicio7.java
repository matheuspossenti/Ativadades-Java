package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String cidade;
		double tempMed = 0;
		double temp;
		int contTemp10 = 0;
		String cidade30 = " ";
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Qual nome do município?");
			cidade = String.valueOf(in.nextLine());
			
			System.out.println("Qual a temperatura da cidade?");
			temp = Double.parseDouble(in.nextLine());
			
			tempMed += temp;
			
			if (temp < 10) {
				contTemp10++;
			} else if (temp > 30) {
				cidade30 = cidade30 + cidade + " / ";
			}
		}
		
		System.out.println("A media de temperatura é: " + (tempMed / 5));
		
		System.out.println("Número de cidades com temperatura inferior a 10°C: " + contTemp10);
		
		System.out.println("Nome das cidades com temperatura superior a 30°C: " + cidade30);
		
		in.close();
	}

}

package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int calculo;
		
		double f1;
		double f2;
		double a1;
		double a2;
		
		System.out.println("O que deseja calcular: 1 para força 1, 2 para força 2, 3 para area 1, 4 para area 2.");
		calculo = Integer.parseInt(in.nextLine());
		
		switch (calculo) {
			case 1:
				System.out.println("Qual a Força 2?");
				f2 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a Área 1?");
				a1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a Área 2?");
				a2 = Double.parseDouble(in.nextLine());
				
				f1 = ((a1 * f2) / a2);
				
				System.out.println("A Força 1 é: " + f1);
				
				break;
				
			case 2:
				System.out.println("Qual a Força 1?");
				f1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a Área 1?");
				a1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a Área 2?");
				a2 = Double.parseDouble(in.nextLine());
				
				f2 = ((a2 * f1) / a1);
				
				System.out.println("A Força 2 é: " + f2);
				
				break;
				
			case 3:
				System.out.println("Qual a Força 1?");
				f1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a Força 2?");
				f2 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a Área 2?");
				a2 = Double.parseDouble(in.nextLine());
				
				a1 = ((f1 * a2) / f2 );
				
				System.out.println("A Área 1 é: " + a1);
				
				break;
				
			case 4:
				System.out.println("Qual a Força 1?");
				f1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a Força 2?");
				f2 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a Área 1?");
				a1 = Double.parseDouble(in.nextLine());
				
				a2 = ((f2 * a1) / f1);
				
				System.out.println("A Área 2 é: " + a2);
				
				break;
		}
		
		in.close();
	}

}
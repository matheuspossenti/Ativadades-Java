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
		
		System.out.println("O que deseja calcular: 1 para for�a 1, 2 para for�a 2, 3 para area 1, 4 para area 2.");
		calculo = Integer.parseInt(in.nextLine());
		
		switch (calculo) {
			case 1:
				System.out.println("Qual a For�a 2?");
				f2 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a �rea 1?");
				a1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a �rea 2?");
				a2 = Double.parseDouble(in.nextLine());
				
				f1 = ((a1 * f2) / a2);
				
				System.out.println("A For�a 1 �: " + f1);
				
				break;
				
			case 2:
				System.out.println("Qual a For�a 1?");
				f1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a �rea 1?");
				a1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a �rea 2?");
				a2 = Double.parseDouble(in.nextLine());
				
				f2 = ((a2 * f1) / a1);
				
				System.out.println("A For�a 2 �: " + f2);
				
				break;
				
			case 3:
				System.out.println("Qual a For�a 1?");
				f1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a For�a 2?");
				f2 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a �rea 2?");
				a2 = Double.parseDouble(in.nextLine());
				
				a1 = ((f1 * a2) / f2 );
				
				System.out.println("A �rea 1 �: " + a1);
				
				break;
				
			case 4:
				System.out.println("Qual a For�a 1?");
				f1 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a For�a 2?");
				f2 = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual a �rea 1?");
				a1 = Double.parseDouble(in.nextLine());
				
				a2 = ((f2 * a1) / f1);
				
				System.out.println("A �rea 2 �: " + a2);
				
				break;
		}
		
		in.close();
	}

}
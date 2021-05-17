package br.edu.ifcvideira.lista4;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double q = 0;
		double m = 0;
		double l = 0;
		double temperatura;
		double c = 0;
		double tfi = 0;
		double ti = 0;
		
		while(2>1){
			System.out.println("Qual a temperatura:");
			temperatura = Double.parseDouble(in.nextLine());
			
			if(temperatura == -1000){
				break;
			}
			
			if((temperatura == 0) || (temperatura == 100)){				
				System.out.println("Qual o valor de M:");
				m = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual o valor de L:");
				l = Double.parseDouble(in.nextLine());
				
				q = m*l;
				
				System.out.println(q);
			} else {
				System.out.println("Qual o valor de M:");
				m = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual o valor de C:");
				c = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual o valor da temperatura final:");
				tfi = Double.parseDouble(in.nextLine());
				
				System.out.println("Qual o valor da temperatura inicial:");
				ti = Double.parseDouble(in.nextLine());
				
				q = m*c*(tfi - ti);
				
				System.out.println("Valor de q: " + q);
			}
		}
		
		in.close();
	}
}

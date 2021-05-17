package br.edu.ifcvideira.lista5;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int contFunc = 1;
		double salLiquido = 0;
		double salBruto = 0;
		double horasExcedentes = 0;
		double salTotal = 0;
		double horasTrabalhadas = 0;
		
		do {
			System.out.println("Qual o sal�rio bruto do funcion�rio " + contFunc + ": ");
			salBruto = Double.parseDouble(in.nextLine());
			
			if(salBruto <= 0) {
				break;
			}
			
			System.out.println("Quantas horas o trabalhador " + contFunc + " trabalhou:");
			horasTrabalhadas = Double.parseDouble(in.nextLine());
			
			if (horasTrabalhadas > 160) {
				horasExcedentes = (horasTrabalhadas - 160) * (salBruto / 160) * 1.5;
			}
			
			if(salBruto < 800) {
				salLiquido = salBruto + horasExcedentes;
				System.out.println("O sal�rio l�quido ser�: R$" + salLiquido);
			} else if((salBruto >= 800) && (salBruto <= 1600)) {
				salLiquido = (salBruto + horasExcedentes)  * 0.87;
				System.out.println("O sal�rio l�quido ser�: " + salLiquido);
			} else {
				salLiquido = (salBruto + horasExcedentes)  * 0.78;
				System.out.println("\nO sal�rio l�quido ser�: " + salLiquido);
			}
			
			salTotal += salLiquido;
			
			horasExcedentes = 0;
			
			contFunc++;
			
		} while(2 > 1);
		
		System.out.println("\nO total de sal�rios l�quidos �: R$" + salTotal);
		
		in.close();
	}
}
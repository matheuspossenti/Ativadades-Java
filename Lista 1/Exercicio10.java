// Faça um algoritmo para calcular e exibir do salário líquido de um professor,
//onde o número de horas, o valor da hora e o percentual do INSS devem ser
//fornecidos pelo usuário:
//salario_bruto <- num_hora_aula * valor_hora_aula
//salario_liquido <- salario_bruto – (salario_bruto * percentual_INSS)

package br.edu.ifcvideira.lista1;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double horas;
		double valorHora;
		double INSSperc;
		double salLiq;
		double salBruto;
		
		System.out.println("Quantas horas trabalhou:" );
		horas = Double.parseDouble(in.nextLine());
		
		System.out.println("Quanto ganhas por hora: ");
		valorHora = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual percentual do INSS: ");
		INSSperc = Double.parseDouble(in.nextLine());
		
		salBruto = horas * valorHora;
		
		salLiq = salBruto - (salBruto * INSSperc / 100);
		
		System.out.println("O salário liquido é de : R$" + salLiq);
		
		in.close();
	}
}

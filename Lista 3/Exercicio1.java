package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String cpf;
		int dependentes;
		double renda;
		double salarioMinimo;
		double desconto=0;
		double imposto;
		
		System.out.println("Qual o CPF do contribuinte: ");
		cpf = String.valueOf(in.nextLine());
		
		System.out.println("Quantos dependentes tem o contribuinte: ");
		dependentes = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual a renda do contribuinte: ");
		renda = Double.parseDouble(in.nextLine());
		
		System.out.println("Qual o salário mínimo atual: ");
		salarioMinimo = Double.parseDouble(in.nextLine());
		
		if (dependentes == 1) {
			desconto = 0.05;
		} else if (dependentes == 2) {
			desconto = 0.1;
		}else if (dependentes >= 3){
			desconto = 0.15;
		}
		
		if (renda <= (salarioMinimo * 2)) {
			System.out.println("O contribuinte de CPF:" + cpf + " está isento");
		} else {
			if((renda > (salarioMinimo * 2)) && (renda <= (salarioMinimo * 3))) {
				imposto = renda * 0.05;
			} else if((renda > (salarioMinimo * 3)) && (renda <= (salarioMinimo * 5))) {
				imposto = renda * 0.1;
			} else if((renda > (salarioMinimo * 5)) && (renda <= (salarioMinimo * 7))) {
				imposto = renda * 0.15;
			} else {
				imposto = renda * 0.2;
			}
		
			System.out.println("O contribuinte de CPF:" + cpf + " irá pagar: R$" + (imposto - (salarioMinimo*desconto)));
		}
		in.close();
	}
}

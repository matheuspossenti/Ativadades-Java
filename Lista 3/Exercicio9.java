package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int codigo;
		
		System.out.println("Qual c�digo do produto?");
		codigo = Integer.parseInt(in.nextLine());
		
		switch (codigo) {
			case 1:
				System.out.println("Alimento n�o perec�vel.");
				break;
			case 2: case 3: case 4:
				System.out.println("Alimento perec�vel.");
				break;
			case 5: case 6:
				System.out.println("Vestu�rio.");
				break;
			case 7:
				System.out.println("Higiene pessoal.");
				break;
			case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15:
				System.out.println("Limpeza e utenc�lios dom�sticos");
				break;
			default:
				System.out.println("C�digo inv�lido!");
		
		}
		
		in.close();
	}

}

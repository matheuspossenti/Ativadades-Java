package br.edu.ifcvideira.lista6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num;
		int somaPosi = 0;
		int somaNeg = 0;

		for(;;) {
			System.out.println("Digite um número inteiro: ");
			num = Integer.parseInt(in.nextLine());
			
			if(num == 0) {
				break;
			} else if(num > 0) {
				somaPosi += num;
			} else if(num < 0) {
				somaNeg += num;
			}
		}
		
		System.out.println("\nSoma dos numeros positivos: " + somaPosi);
		System.out.println("Soma dos numeros negativos: " + somaNeg);
		System.out.println("Soma dos resultados parciais: " + (somaPosi + somaNeg));
		
		in.close();
	}

}

package br.edu.ifcvideira.lista4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int limite;
        int cont = 1;
        double total = 1;

        System.out.println("Qual o limite para o c�lculo:");
        limite = Integer.parseInt(in.nextLine());

        while (cont <= limite) {
            total += (double) 1 / cont;
            cont++;
        }

        System.out.println("\nO resultado do c�lculo �: " + total);
		
		in.close();
	}

}

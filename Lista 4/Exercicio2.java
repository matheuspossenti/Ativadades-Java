package br.edu.ifcvideira.lista4;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int tabuada;
		int limite;
		int contador = 0;
		
		System.out.println("De qual número queres saber a tabuada?");
		tabuada = Integer.parseInt(in.nextLine());
		
		System.out.println("Qual limite da tabuada?");
		limite = Integer.parseInt(in.nextLine());
		
		while(contador <= limite) {
			System.out.println(contador + "x" + tabuada + "=" + contador * tabuada);
			contador++;
		}
		
		in.close();
	}
}

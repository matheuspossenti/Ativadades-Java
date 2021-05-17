//Ler 3 valores e escrevê-los em ordem crescente (Considerando valores
//distintos).

package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1;
		double n2;
		double n3;
		
		System.out.println("Digite o primeiros valor: ");
		n1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o segundo valor: ");
		n2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite o terceiro valor: ");
		n3 = Double.parseDouble(in.nextLine());
		
		if ((n1 > n2) && (n2  >n3)){
			
			System.out.println(n3 + ", " + n2 +", " + n1);
		}else if ((n1 > n3) && (n3 > n2)) {
			
			System.out.println(n2 + ", " + n3 + ", " + n1);
		}else if ((n2 > n1) && (n1 > n3)) {
			
			System.out.println(n3 + ", " + n1 + ", " + n2);
		}else if ((n2 > n3) && (n3 > n1)) {
			
			System.out.println(n1+","+n3+","+n2);
		}else if ((n3 > n1) && (n1 > n2)) {
			
			System.out.println(n2 + ", " + n1 + ", " + n3);
		}else if ((n3 > n2) && (n2 > n1)) {
			
			System.out.println(n1 + ", " + n2 + ", " + n3);
		}
		
		in.close();
	}
}
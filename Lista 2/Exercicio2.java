//Ler as notas da 1a e 2a avalia��o de um aluno. Calcular a m�dia aritm�tica
//simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado
//(considerar que se a nota for igual ou maior que 7 o aluno � aprovado). Escrever tamb�m a m�dia calculada

package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		double nota1;
		double nota2;
		double media;
		
		System.out.println("Quanto tirou na 1a prova: ");
		nota1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Quanto tirou na 2a prova: ");
		nota2 = Double.parseDouble(in.nextLine());
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Voc� foi aprovado!");
		} else {
			System.out.println("Voc� foi reprovado!");
		}
		
		System.out.println("Sua m�dia foi: " + media);
		
		in.close();
	}
}

package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int itensEmEstoque;
        int itensFornecidos;
        int estoqueAtualizado;

        System.out.println("Quantos itens estão em estoque?");
        itensEmEstoque = Integer.parseInt(in.nextLine());

        System.out.println("Quantos itens serão fornecidos?");
        itensFornecidos = Integer.parseInt(in.nextLine());

        estoqueAtualizado = (itensEmEstoque - itensFornecidos);

        if (estoqueAtualizado >= 0) {
            System.out.println("\nO pedido será feito! Agora o estoque possui " + estoqueAtualizado + " itens");
        } else {
            System.out.println("\nNão será possível realizar o pedido! Não há itens suficientes.");
        }

        in.close();
	}
}

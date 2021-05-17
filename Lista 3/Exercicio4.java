package br.edu.ifcvideira.lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        int itensEmEstoque;
        int itensFornecidos;
        int estoqueAtualizado;

        System.out.println("Quantos itens est�o em estoque?");
        itensEmEstoque = Integer.parseInt(in.nextLine());

        System.out.println("Quantos itens ser�o fornecidos?");
        itensFornecidos = Integer.parseInt(in.nextLine());

        estoqueAtualizado = (itensEmEstoque - itensFornecidos);

        if (estoqueAtualizado >= 0) {
            System.out.println("\nO pedido ser� feito! Agora o estoque possui " + estoqueAtualizado + " itens");
        } else {
            System.out.println("\nN�o ser� poss�vel realizar o pedido! N�o h� itens suficientes.");
        }

        in.close();
	}
}

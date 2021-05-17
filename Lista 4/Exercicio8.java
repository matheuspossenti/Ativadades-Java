package br.edu.ifcvideira.lista4;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salario = 1;
        int filhos;
        double mediaSal = 0;
        int mediaFilho = 0;
        double maiorSal = 1;
        int porcento = 0;
        int contador = 0;

        while (2 > 1) {
        	System.out.println("Qual seu salário:");
        	salario = Double.parseDouble(in.nextLine());
        	
        	if (salario < 0) {
        		System.out.println("\nFim da pesquisa");
        		break;
        	}
        	
        	if (salario > maiorSal) {
                maiorSal = salario;
            }
        	
        	if (salario <= 1000) {
                porcento++;
            }
        	
        	mediaSal += salario;
        	
        	System.out.println("Quantos filhos tem:");
        	filhos = Integer.parseInt(in.nextLine());
        	
        	mediaFilho += filhos;
        	
        	contador++;
        	
        }
        
        System.out.println("\nMedia do salario da população: R$" + (mediaSal/contador));
        System.out.println("Media do numero de filhos da populaçao: " + (mediaFilho/contador));
        System.out.println("Maior salario: R$" + maiorSal);
        System.out.println("Percentual de pessoas com salario ate R$1000,00: " + ((100 * porcento) / contador) + "%." );
        
        in.close();
	}

}

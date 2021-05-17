package br.edu.ifcvideira.lista10;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int cpf = 0;
		int rg = 0;
		String nome = "";
		String endereco = "";
		
		int numero;
		int andar;
		
		nome = String.valueOf(JOptionPane.showInputDialog("Cadastro Hospedes: " + "\n"
				+ "\nNome: "));
		
		cpf = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Hospedes: " + "\n"
				+ "\nCPF: "));
		
		rg = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Hospedes: " + "\n"
				+ "\nRG: "));
		
		endereco = String.valueOf(JOptionPane.showInputDialog("Cadastro Hospedes: " + "\n"
				+ "\nEndereço: "));
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Quarto: : " + "\n"
				+ "\nNúmero do quatro: "));
		
		andar = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Quarto: : " + "\n"
				+ "\nAndar do quatro: "));
		
		Hospede ho = new Hospede(cpf, rg, nome, endereco);
		Quarto qu = new Quarto(numero, andar, nome);

		JOptionPane.showMessageDialog(null, "Dados do hóspede: " + "\n"
				+ "\nNome: " + ho.getNome() + "\n"
				+ "CPF: " + ho.getCpf() + "\n"
				+ "RG: " + ho.getRg() + "\n"
				+ "Endereço: " + ho.getEndereço() + "\n"
				+ "\nQuarto do hóspede: " + "\n"
				+ "Número do quarto: " + qu.getNum() + "\n"
				+ "Andar: " + qu.getAndar());
	}

}

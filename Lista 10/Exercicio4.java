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
				+ "\nEndere�o: "));
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Quarto: : " + "\n"
				+ "\nN�mero do quatro: "));
		
		andar = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Quarto: : " + "\n"
				+ "\nAndar do quatro: "));
		
		Hospede ho = new Hospede(cpf, rg, nome, endereco);
		Quarto qu = new Quarto(numero, andar, nome);

		JOptionPane.showMessageDialog(null, "Dados do h�spede: " + "\n"
				+ "\nNome: " + ho.getNome() + "\n"
				+ "CPF: " + ho.getCpf() + "\n"
				+ "RG: " + ho.getRg() + "\n"
				+ "Endere�o: " + ho.getEndere�o() + "\n"
				+ "\nQuarto do h�spede: " + "\n"
				+ "N�mero do quarto: " + qu.getNum() + "\n"
				+ "Andar: " + qu.getAndar());
	}

}

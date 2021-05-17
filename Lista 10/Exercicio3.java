package br.edu.ifcvideira.lista10;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
				
		String nome = "";
		String departamento = "";
		int numReg = 0;
		
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		nome =  String.valueOf(JOptionPane.showInputDialog("Cadastro Professores: \n"
				+ "\nNome: "));
		
		departamento = String.valueOf(JOptionPane.showInputDialog("Cadastro Professores: \n"
				+ "\nDepartamento: "));
		
		numReg = Integer.parseInt(JOptionPane.showInputDialog("Cadastro Professores	: \n"
				+ "\nNúmero do registro: "));
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Data de admissão: \n"
				+ "\nDia: "));
		
		mes = Integer.parseInt(JOptionPane.showInputDialog("Data de admissão: \n"
				+ "\nMes: "));
		
		ano = Integer.parseInt(JOptionPane.showInputDialog("Data de admissão: \n"
				+ "\nAno: "));
		
		Professor pr = new Professor(nome, departamento, numReg);
		Data dt = new Data(dia, mes, ano);
		
		JOptionPane.showMessageDialog(null, "Dados cadastro:  \n"
				+ "\nNome: " + pr.getNome() + "\n"
				+ "Departamento: " + pr.getDepartamento() + "\n"
				+ "Número do registro: " + pr.getNumReg() + "\n"
				+ "\nData de Admissão: " + "\n"
				+ "Dia: " + dt.getDia() + "\n"
				+ "Mes: " + dt.getMes() + "\n"
				+ "Ano: " + dt.getAno());
	}

}

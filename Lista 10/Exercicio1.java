package br.edu.ifcvideira.lista10;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setTitulo("Fundamentos da programa��o de computadores");
		l1.setAutor("Ascencio");
		l1.setAno(2012);
		
		Livro l2 = new Livro("Programa��o com C", "Professor X", 2010);
		
		Livro l3 = new Livro("Programa��o com Java", "Professor Y", 2013);
		
		JOptionPane.showMessageDialog(null, "Dados dos livros: \n"
				+ "\nLivro 1: " + "\n"
				+ "T�tulo: " + l1.getTitulo() + "\n"
				+ "Autor: " + l1.getAutor() + "\n"
				+ "Ano: " + l1.getAno() + "\n"
				+ "\nLivro 2: " + "\n"
				+ "T�tulo: " + l2.getTitulo() + "\n"
				+ "Autor: " + l2.getAutor() + "\n"
				+ "Ano: " + l2.getAno() + "\n"
				+ "\nLivro 3: " + "\n"
				+ "T�tulo: " + l3.getTitulo() + "\n"
				+ "Autor: " + l3.getAutor() + "\n"
				+ "Ano: " + l3.getAno());
	}

}

package br.edu.ifcvideira.lista9;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		CalcKW kw = new CalcKW();
		DecimalFormat df = new DecimalFormat("0.00");
		
		kw.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario mínimo: ")));
		kw.setQuantKWH(Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de KW gasta: ")));
		
		JOptionPane.showInputDialog(null, "Você pagará: \n"
				+ "Sem desconto: R$" + df.format(kw.valorConta()) + "\n"
						+ "Com desconto: R$" + df.format(kw.valorContaDesc()));
	}

}

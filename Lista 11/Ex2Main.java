package br.edu.ifcvideira.lista11;

import javax.swing.JOptionPane;

public class Ex2Main {

	public static void main(String[] args) {
		
		String nomeCachorro;
		String racaCachorro;
		
		String nomeGato;
		String racaGato;
		
		int op;
		
		Ex2Cachorro ca = new Ex2Cachorro();
		
		nomeCachorro = String.valueOf(JOptionPane.showInputDialog("Insira o nome do cachorro:"));
		racaCachorro = String.valueOf(JOptionPane.showInputDialog("Insira a raça do cachorro:"));

		ca.setNome(nomeCachorro);
		ca.setRaca(racaCachorro);
		
		Ex2Gato ga = new Ex2Gato();
		
		nomeGato = String.valueOf(JOptionPane.showInputDialog("Insira o nome do gato:"));
		racaGato = String.valueOf(JOptionPane.showInputDialog("Insira a raça do gato:"));
		
		ga.setNome(nomeGato);
		ga.setRaca(racaGato);
		
		for (;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Dados do cachorro: \n"
					+ "\nNome: " + ca.getNome() + "\n"
					+ "Raça: " + ca.getRaca() + "\n"
					+ "Dados do gato: \n"
					+ "\nNome: " + ga.getNome() + "\n"
					+ "Raça: " + ga.getRaca() + "\n"
					+ "Digite: " + "\n"
					+ "\n1- Cachorro late" + "\n"
					+ "2- Gato miar" + "\n"
					+ "3- Finalizar"));
			
			if( op == 3 ) {
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			}
			
			if( op == 1 ) {
				JOptionPane.showMessageDialog(null, ca.late());
			} else if ( op == 2 ) {
				JOptionPane.showMessageDialog(null, ga.mia());
			}
		}
	}

}

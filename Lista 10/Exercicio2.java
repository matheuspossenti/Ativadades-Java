package br.edu.ifcvideira.lista10;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		double memoria;
		double processador;
		double hd;
		double monitor;
		int opc;
		
		String msg = "Seu computador: \n"
				+ "Gabinete mais a placa mãe - R$800,00 \n";
		
		opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha o processador? \n"
				+ "1 - 2.9 Ghz - R$300,00 \n"
				+ "2 - 3.5 Ghz - R$350,00 \n"
				+ "3 - 3.7 Ghz - R$600,00"));
		
		if (opc == 1) {
			processador = 300;
			msg += "Processador 2.9 Ghz: R$300,00 \n";
		}else if (opc == 2) {
			processador = 350;
			msg += "Processador 3.5 Ghz: R$350,00 \n";
		}else {
			processador = 600;
			msg += "Processador 3.7 Ghz: R$600,00 \n";
		}
		
		
		opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha a memória? \n"
				+ "1 - 4 Gb - R$200,00 \n"
				+ "2 - 8 Gb - R$400,00 \n"
				+ "3 - 16 Gb - R$800,00 \n"
				+ "4 - 32 Gb - R$1600,00"));
		
		if (opc == 1) {
			memoria = 200;
			msg += "memoria 4 Gb - R$200,00 \n";
		}else if (opc == 2) {
			memoria = 400;
			msg += "memoria 8 Gb - R$400,00 \n";
		}else if (opc == 3) {
			memoria = 800;
			msg += "memoria 16 Gb - R$800,00 \n";
		}else {
			memoria = 1600;
			msg += "Memoria 32 Gb - R$1600,00 \n";
		}
		
		opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha o HD? \n"
				+ "1 - 500 Gb - R$200,00 \n"
				+ "2 - 1 Tb - R$400,00 \n"
				+ "3 - 2 Tb -  R$600,00"));
		
		if (opc == 1) {
			hd = 200;
			msg += "HD 500 Gb - R$200,00 \n";
		}else if (opc == 2) {
			hd = 400;
			msg += "HD 1 Tb - R$400,00 \n";
		}else {
			hd = 600;
			msg += "HD 2 Tb - R$600,00\n";
		}
		
		opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha o monitor? \n"
				+ "1 - 19 polegadas - R$450,00 \n"
				+ "2 - 21 polegadas  - R$650,00" ));
		
		if (opc == 1) {
			monitor = 450;
			msg += "Monitor 19 polegadas - R$450,00 \n";
		}else {
			monitor = 650;
			msg += "Monitor 21 polegadas - R$650,00 \n";
		}
		
		Computador co = new Computador(processador, memoria, hd, monitor, msg);
		co.setConfig(msg);
		JOptionPane.showMessageDialog(null, co.getConfig() + "Total: R$ " + co.calcularPreco());
		
	}
}
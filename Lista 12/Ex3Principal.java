package br.edu.ifcvideira.lista12;

import javax.swing.JOptionPane;

public class Ex3Principal {
	static int peso;
	static int velocMax;
	static double preco;
	
	public static void main(String[] args) {

		Ex3Veiculo ve;
		int op;

		for (;;) {
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o seu ve�culo:\n"
					+ "\n1 - Carro de Passeio\n"
					+ "2 - Caminh�o\n"
					+ "3 - Finalizar"));
			
			if (op == 3) {
				JOptionPane.showMessageDialog(null, "Finalizando...!");
				break;
			}
			
			recebe();
			
			if (op == 1) {
				
				String cor = String.valueOf(JOptionPane.showInputDialog("Insira a cor do ve�culo?"));
				String modelo = String.valueOf(JOptionPane.showInputDialog("Insira o modelo do ve�culo?"));
				
				ve = new Ex3CarroPasseio(peso, velocMax, preco, cor, modelo);
				ve.imprime();
				
			} else if (op == 2) {
				
				int tonelada = Integer.parseInt(JOptionPane.showInputDialog("Insira a carga m�xima do ve�culo? (em ton)"));
				int alturaMax = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura m�xima do ve�culo? (em m)"));
				int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento do ve�culo? (em m)"));				
				
				ve = new Ex3Caminhao(comprimento, alturaMax, preco, peso, velocMax, tonelada);
				ve.imprime();
				
			}
			
		}
		
	}
		
	public static void recebe() {
		peso = Integer.parseInt(JOptionPane.showInputDialog("Insira o peso do ve�culo?"));
		velocMax = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade m�xima do ve�culo?"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o pre�o do ve�culo?"));
	
	}
}

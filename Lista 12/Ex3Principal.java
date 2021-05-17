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
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o seu veículo:\n"
					+ "\n1 - Carro de Passeio\n"
					+ "2 - Caminhão\n"
					+ "3 - Finalizar"));
			
			if (op == 3) {
				JOptionPane.showMessageDialog(null, "Finalizando...!");
				break;
			}
			
			recebe();
			
			if (op == 1) {
				
				String cor = String.valueOf(JOptionPane.showInputDialog("Insira a cor do veículo?"));
				String modelo = String.valueOf(JOptionPane.showInputDialog("Insira o modelo do veículo?"));
				
				ve = new Ex3CarroPasseio(peso, velocMax, preco, cor, modelo);
				ve.imprime();
				
			} else if (op == 2) {
				
				int tonelada = Integer.parseInt(JOptionPane.showInputDialog("Insira a carga máxima do veículo? (em ton)"));
				int alturaMax = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura máxima do veículo? (em m)"));
				int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento do veículo? (em m)"));				
				
				ve = new Ex3Caminhao(comprimento, alturaMax, preco, peso, velocMax, tonelada);
				ve.imprime();
				
			}
			
		}
		
	}
		
	public static void recebe() {
		peso = Integer.parseInt(JOptionPane.showInputDialog("Insira o peso do veículo?"));
		velocMax = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade máxima do veículo?"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do veículo?"));
	
	}
}

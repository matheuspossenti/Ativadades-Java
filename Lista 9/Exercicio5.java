package br.edu.ifcvideira.lista9;

import javax.swing.JOptionPane;

public class Exercicio5 {
		public static void main(String[] args) {	
			
			Porta p = new Porta();
			int op;

				String[] options = {"Aberta", "Fechada"};
				int x = JOptionPane.showOptionDialog(null, "A porta está: ",
		                "Escolha uma opção",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); if(x==0) {p.setAberta(true);} else {p.setAberta(false);}
				p.setCor(Integer.parseInt(JOptionPane.showInputDialog("Qual cor deseja: \n"
						+ "-1 Preto \n"
						+ "-2 Azul \n"
						+ "-3 Verde \n"
						+ "-4 Vermelho \n"
						+ "-5 Rosa")));
				p.setX(Integer.parseInt(JOptionPane.showInputDialog("Qual a largura da porta")));
				p.setY(Integer.parseInt(JOptionPane.showInputDialog("Qual a altura da porta")));
				p.setZ(Integer.parseInt(JOptionPane.showInputDialog("Qual a profundidade da porta")));	
			
			
			for(;;) {
				op = Integer.valueOf(JOptionPane.showInputDialog(null, "Escolha uma opção: \n"
						+ "-1 Abrir/fechar a porta \n"
						+ "-2 Mudar a cor da porta \n"
						+ "-3 Mudar a largura da porta \n"
						+ "-4 Mudar a altura da porta \n"
						+ "-5 Mudar a profundidade da porta \n"
						+ "-6 Verificar os valores \n"
						+ "-7 Encerrar"));
				
				if(op==1) {
					if(p.isAberta()) {
					p.setAberta(false);
					} else {
						p.setAberta(true);
					}
				} else if(op==2) {
					p.setCor(Integer.parseInt(JOptionPane.showInputDialog("Qual cor deseja: \n"
							+ "1- Preto \n"
							+ "2- Azul \n"
							+ "3- Verde \n"
							+ "4- Vermelho \n"
							+ "5- Rosa")));
					
				} else if(op==3) {
					p.setX(Integer.parseInt(JOptionPane.showInputDialog("Qual a largura da porta?")));
				} else if(op==4) {
					p.setY(Integer.parseInt(JOptionPane.showInputDialog("Qual a altura da porta?")));
				} else if(op==5) {
					p.setZ(Integer.parseInt(JOptionPane.showInputDialog("Qual a profundidade da porta?")));	
				} else if(op==6) {
					String cond;
					String cor = "";
					if(p.getCor()==1) {cor = "Preto";} else if(p.getCor()==2) {cor = "Azul";} else if(p.getCor()==3) {cor = "Verde";}
					else if(p.getCor()==4) {cor = "Vermelho";} else if(p.getCor()==5) {cor = "Rosa";}
					if(p.isAberta()){cond = "Aberta";} else {cond = "Fechada";}
					JOptionPane.showMessageDialog(null, "A porta que você escolheu: \n"
							+ "A porta está "+ cond + "\n"
									+ "A cor da porta é "+cor+"\n"
											+ "As dimensões da porta são: \n"
											+ " -X: "+p.getX()+"\n"
											+ " -Y: "+p.getY()+"\n"
											+ " -Z: "+p.getZ()+"\n");
					
				} else if(op==7) {
					int b = Integer.valueOf(JOptionPane.showInputDialog(null, "Deseja fazer alguma alteração? \n"
							+ "1- Não \n"
							+ "2- Sim"));
					if(b==1) {
						break;
					} if (b==2) {
						continue;
					} else {
						JOptionPane.showMessageDialog(null, "Número Inválido");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Número Inválido");
				}
			}
	}

}

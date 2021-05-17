package br.edu.ifcvideira.lista15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Ex1Principal extends JFrame {

	private JPanel contentPane;
	JCheckBox chCarregador = new JCheckBox("Carregador - R$ 300,00");
	JCheckBox chPasta = new JCheckBox("Pasta - R$ 300,00");
	JCheckBox chEstabilizador = new JCheckBox("Estabilizador - R$ 200,00");
	JCheckBox chTeclado = new JCheckBox("Teclado - R$ 200,00");
	JCheckBox chPlacaVideo = new JCheckBox("Placa de vídeo off-Board ");
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	Ex1Notebook no = new Ex1Notebook();
	Ex1Desktop de = new Ex1Desktop();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1Principal frame = new Ex1Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ex1Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Configure o seu computador:");
		lblNewLabel.setFont(new Font("Times new Roman", Font.PLAIN, 21));
		lblNewLabel.setBounds(153, 10, 273, 25);
		contentPane.add(lblNewLabel);
		
		JRadioButton rbNotebook = new JRadioButton("Notebook");
		rbNotebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				chCarregador.setEnabled(true);
				chPasta.setEnabled(true);
				
				chEstabilizador.setEnabled(false);
				chTeclado.setEnabled(false);
				
				chEstabilizador.setSelected(false);
				chTeclado.setSelected(false);
				
			}
		});
		
		buttonGroup.add(rbNotebook);
		rbNotebook.setSelected(true);
		rbNotebook.setFont(new Font("Times new Roman", Font.PLAIN, 16));
		rbNotebook.setBounds(134, 73, 104, 21);
		contentPane.add(rbNotebook);
		
		JRadioButton rbDesktop = new JRadioButton("Desktop");
		rbDesktop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				chCarregador.setEnabled(false);
				chPasta.setEnabled(false);
				
				chEstabilizador.setEnabled(true);
				chTeclado.setEnabled(true);
				
				chCarregador.setSelected(false);
				chPasta.setSelected(false);
							
			}
		});
		
		buttonGroup.add(rbDesktop);
		rbDesktop.setFont(new Font("Times new Roman", Font.PLAIN, 16));
		rbDesktop.setBounds(355, 73, 83, 21);
		contentPane.add(rbDesktop);
		
		JLabel lblPlacaMe = new JLabel("Placa mãe:");
		lblPlacaMe.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		lblPlacaMe.setBounds(134, 128, 98, 25);
		contentPane.add(lblPlacaMe);
		
		JComboBox cbPlacaMae = new JComboBox();
		cbPlacaMae.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 600,00", "Modelo 2 - R$ 800,00", "Modelo 3 - R$ 1000,00"}));
		cbPlacaMae.setFont(new Font("Times new Roman", Font.PLAIN, 12));
		cbPlacaMae.setBounds(295, 121, 143, 28);
		contentPane.add(cbPlacaMae);
		
		JLabel lblPorcessador = new JLabel("HD:");
		lblPorcessador.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		lblPorcessador.setBounds(136, 168, 98, 25);
		contentPane.add(lblPorcessador);
		
		JComboBox cbHd = new JComboBox();
		cbHd.setModel(new DefaultComboBoxModel(new String[] {"500 GB - R$ 300,00", "1 TB - R$ 500,00", "2 TB - R$ 700,00"}));
		cbHd.setFont(new Font("Times new Roman", Font.PLAIN, 12));
		cbHd.setBounds(295, 168, 143, 28);
		contentPane.add(cbHd);
		
		JComboBox cbMemoria = new JComboBox();
		cbMemoria.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 300,00", "Modelo 2 - R$ 400,00", "Modelo 3 - R$ 500,00"}));
		cbMemoria.setFont(new Font("Times new Roman", Font.PLAIN, 12));
		cbMemoria.setBounds(295, 215, 143, 28);
		contentPane.add(cbMemoria);
		
		JLabel lblMemoria = new JLabel("Memória:");
		lblMemoria.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		lblMemoria.setBounds(136, 215, 120, 25);
		contentPane.add(lblMemoria);
		
		JLabel lblProcessador = new JLabel("Processador:");
		lblProcessador.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		lblProcessador.setBounds(136, 262, 120, 25);
		contentPane.add(lblProcessador);
		
		JComboBox cbProcessador = new JComboBox();
		cbProcessador.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 500,00", "Modelo 2 - R$ 700,00", "Modelo 3 - R$ 900,00"}));
		cbProcessador.setFont(new Font("Times new Roman", Font.PLAIN, 12));
		cbProcessador.setBounds(295, 262, 143, 28);
		contentPane.add(cbProcessador);
		
		JComboBox cbPlacaVideo = new JComboBox();
		cbPlacaVideo.setEnabled(false);
		cbPlacaVideo.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 200,00", "Modelo 2 - R$ 400,00", "Modelo 3 - R$ 600,00"}));
		cbPlacaVideo.setFont(new Font("Times new Roman", Font.PLAIN, 12));
		cbPlacaVideo.setBounds(295, 306, 143, 28);
		contentPane.add(cbPlacaVideo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 354, 566, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(295, 354, 1, 99);
		contentPane.add(separator_1);
		
		
		chCarregador.setFont(new Font("Times new Roman", Font.PLAIN, 14));
		chCarregador.setBounds(19, 372, 219, 21);
		contentPane.add(chCarregador);
		
		chPasta.setFont(new Font("Times new Roman", Font.PLAIN, 14));
		chPasta.setBounds(19, 408, 219, 21);
		contentPane.add(chPasta);
		
		chEstabilizador.setEnabled(false);
		chEstabilizador.setFont(new Font("Times new Roman", Font.PLAIN, 14));
		chEstabilizador.setBounds(314, 372, 219, 21);
		contentPane.add(chEstabilizador);
		
		chTeclado.setEnabled(false);
		chTeclado.setFont(new Font("Times new Roman", Font.PLAIN, 14));
		chTeclado.setBounds(314, 408, 219, 21);
		contentPane.add(chTeclado);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 452, 566, 2);
		contentPane.add(separator_2);
		
		JCheckBox chGarantia = new JCheckBox("Garantia extendida");
		chGarantia.setFont(new Font("Times new Roman", Font.PLAIN, 14));
		chGarantia.setBounds(202, 472, 147, 21);
		contentPane.add(chGarantia);
		
		JButton btnFinalizar = new JButton("Finalize seu pedido");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbNotebook.isSelected()) {
					// Notebook
					
					// Placa mãe
					if(cbPlacaMae.getSelectedIndex() == 0) {
						no.setPlacaMae(600);						
					} else if (cbPlacaMae.getSelectedIndex() == 1) {
						no.setPlacaMae(800);
					} else {
						no.setPlacaMae(1000);
					}
					
					no.setConfiguracao("Placa mãe: " + cbPlacaMae.getSelectedItem() + "\n");
					
					// HD
					if(cbHd.getSelectedIndex() == 0) {
						no.setHd(300);						
					} else if (cbHd.getSelectedIndex() == 1) {
						no.setHd(500);
					} else {
						no.setHd(700);
					}
					
					no.setConfiguracao(no.getConfiguracao() + "HD: " + cbHd.getSelectedItem() + "\n");
					
					// Memória
					if(cbMemoria.getSelectedIndex() == 0) {
						no.setMemoria(300);						
					} else if (cbMemoria.getSelectedIndex() == 1) {
						no.setMemoria(400);
					} else {
						no.setMemoria(500);
					}
					
					no.setConfiguracao(no.getConfiguracao() + "Memória: " + cbMemoria.getSelectedItem() + "\n");
					
					// Processador
					if(cbProcessador.getSelectedIndex() == 0) {
						no.setProcessador(500);						
					} else if (cbProcessador.getSelectedIndex() == 1) {
						no.setProcessador(700);
					} else {
						no.setProcessador(900);
					}
					
					no.setConfiguracao(no.getConfiguracao() + "Processador: " + cbProcessador.getSelectedItem() + "\n");
					
					// placa de vídeo
					if(chPlacaVideo.isSelected()) {
						if(cbPlacaVideo.getSelectedIndex() == 0) {
							no.setPlacaVideo(200);						
						} else if (cbPlacaVideo.getSelectedIndex() == 1) {
							no.setPlacaVideo(400);
						} else {
							no.setPlacaVideo(600);
						}
						
						no.setConfiguracao(no.getConfiguracao() + "Placa de vídeo: " + cbPlacaVideo.getSelectedItem() + "\n");
					} else {
						no.setPlacaVideo(0);
						no.setConfiguracao(no.getConfiguracao() + "Placa de vídeo: Não selecionada! \n");
					}
								
					// Carregador
					if(chCarregador.isSelected()) {
						no.setCarregador(300);
						no.setConfiguracao(no.getConfiguracao() + "Carregador: R$ 300,00 \n");
					} else {
						no.setCarregador(0);
					}
					
					// pasta
					if(chPasta.isSelected()) {
						no.setPasta(300);
						no.setConfiguracao(no.getConfiguracao() + "Pasta: R$ 300,00 \n");
					} else {
						no.setPasta(0);
					}
					
					// Volumes
					no.setVolumes(1);
					no.setConfiguracao(no.getConfiguracao() + "Volume: " + no.getVolumes() + " caixa \n");
					
					// Garantia
					if(chGarantia.isSelected()) {
						no.setGarantia(1);
						no.setConfiguracao(no.getConfiguracao() + "Garantia extendida: " + no.getGarantia() + " ano \n");
					} else {
						no.setConfiguracao(no.getConfiguracao() + "Garantia extendida: Não selecionada! \n");
					}
					
					// Impressão
					if(chGarantia.isSelected()) {
						no.imprimeGarantia();
					} else {
						no.imprime();
					}
					
				} else {
					// Desktop
					
					// Placa mãe
					if(cbPlacaMae.getSelectedIndex() == 0) {
						de.setPlacaMae(600);						
					} else if (cbPlacaMae.getSelectedIndex() == 1) {
						de.setPlacaMae(800);
					} else {
						de.setPlacaMae(1000);
					}
					
					de.setConfiguracao("Placa mãe: " + cbPlacaMae.getSelectedItem() + "\n");
					
					// HD
					if(cbHd.getSelectedIndex() == 0) {
						de.setHd(300);						
					} else if (cbHd.getSelectedIndex() == 1) {
						de.setHd(500);
					} else {
						de.setHd(700);
					}
					
					de.setConfiguracao(de.getConfiguracao() + "HD: " + cbHd.getSelectedItem() + "\n");
					
					// Memória
					if(cbMemoria.getSelectedIndex() == 0) {
						de.setMemoria(300);						
					} else if (cbMemoria.getSelectedIndex() == 1) {
						de.setMemoria(400);
					} else {
						de.setMemoria(500);
					}
					
					de.setConfiguracao(de.getConfiguracao() + "Memória: " + cbMemoria.getSelectedItem() + "\n");
					
					// Processador
					if(cbProcessador.getSelectedIndex() == 0) {
						de.setProcessador(500);						
					} else if (cbProcessador.getSelectedIndex() == 1) {
						de.setProcessador(700);
					} else {
						de.setProcessador(900);
					}
					
					de.setConfiguracao(de.getConfiguracao() + "Processador: " + cbProcessador.getSelectedItem() + "\n");
					
					// placa de vídeo
					if(chPlacaVideo.isSelected()) {
						if(cbPlacaVideo.getSelectedIndex() == 0) {
							de.setPlacaVideo(200);						
						} else if (cbPlacaVideo.getSelectedIndex() == 1) {
							de.setPlacaVideo(400);
						} else {
							de.setPlacaVideo(600);
						}
						
						de.setConfiguracao(de.getConfiguracao() + "Placa de vídeo: " + cbPlacaVideo.getSelectedItem() + "\n");
					} else {
						de.setPlacaVideo(0);
						de.setConfiguracao(de.getConfiguracao() + "Placa de vídeo: Não selecionada! \n");
					}
					
					// Estabilizador
					if(chEstabilizador.isSelected()) {
						de.setEstabilizador(200);
						de.setConfiguracao(de.getConfiguracao() + "Estabilizador: R$ 200,00 \n");
					} else {
						de.setEstabilizador(0);
					}
					
					// Teclado
					if(chTeclado.isSelected()) {
						de.setTeclado(200);
						de.setConfiguracao(de.getConfiguracao() + "Teclado: R$ 200,00 \n");
					} else {
						de.setTeclado(0);
					}
					
					// Volumes
					de.setVolumes(4);
					de.setConfiguracao(de.getConfiguracao() + "Volume: " + de.getVolumes() + " caixas \n");
					
					// Garantia
					if(chGarantia.isSelected()) {
						de.setGarantia(2);
						de.setConfiguracao(de.getConfiguracao() + "Garantia extendida: " + de.getGarantia() + " anos \n");
					} else {
						de.setConfiguracao(de.getConfiguracao() + "Garantia extendida: Não selecionada! \n");
					}
					
					// Impressão
					if(chGarantia.isSelected()) {
						de.imprimeGarantia();
					} else {
						de.imprime();
					}
					
				}
				
			}
		});
		
		btnFinalizar.setFont(new Font("Times new Roman", Font.PLAIN, 14));
		btnFinalizar.setBounds(202, 528, 147, 35);
		contentPane.add(btnFinalizar);
		
		chPlacaVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chPlacaVideo.isSelected()) {
					cbPlacaVideo.setEnabled(true);
				} else {
					cbPlacaVideo.setEnabled(false);
				}
				
			}
		});
		
		chPlacaVideo.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		chPlacaVideo.setBounds(31, 308, 237, 21);
		contentPane.add(chPlacaVideo);
	}
}
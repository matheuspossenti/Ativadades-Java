package br.edu.ifcvideira.lista15;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex2Principal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfModelo;
	private JTextField tfAno;
	private JTextField tfValor;
	private JTextField tfCapacidade;
	
	JRadioButton rbMoto = new JRadioButton("Moto");
	JRadioButton rbAutomovel = new JRadioButton("Automóvel");
	JRadioButton rbCaminhao = new JRadioButton("Caminhão");
	
	Ex2Moto mo = new Ex2Moto();
	Ex2Automovel au = new Ex2Automovel();
	Ex2Caminhao ca = new Ex2Caminhao();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2Principal frame = new Ex2Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ex2Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione um veículo:");
		lblNewLabel.setFont(new Font("Times new Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(199, 10, 211, 24);
		contentPane.add(lblNewLabel);
		
		
		buttonGroup.add(rbMoto);
		rbMoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCapacidade.setEnabled(false);
				tfModelo.setText("");
				tfAno.setText("");
				tfValor.setText("");
				tfCapacidade.setText("");
			}
		});
		rbMoto.setSelected(true);
		rbMoto.setFont(new Font("Times new Roman", Font.PLAIN, 16));
		rbMoto.setBounds(87, 62, 61, 21);
		contentPane.add(rbMoto);
		
		buttonGroup.add(rbAutomovel);
		rbAutomovel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCapacidade.setEnabled(false);
				tfModelo.setText("");
				tfAno.setText("");
				tfValor.setText("");
				tfCapacidade.setText("");
			}
		});
		rbAutomovel.setFont(new Font("Times new Roman", Font.PLAIN, 16));
		rbAutomovel.setBounds(235, 62, 103, 24);
		contentPane.add(rbAutomovel);
		
		rbCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfCapacidade.setEnabled(true);
				tfModelo.setText("");
				tfAno.setText("");
				tfValor.setText("");
			}
		});
		buttonGroup.add(rbCaminhao);
		rbCaminhao.setFont(new Font("Times new Roman", Font.PLAIN, 16));
		rbCaminhao.setBounds(425, 62, 95, 21);
		contentPane.add(rbCaminhao);
		
		JLabel lblNewLabel_1 = new JLabel("Modelo:");
		lblNewLabel_1.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(75, 107, 114, 24);
		contentPane.add(lblNewLabel_1);
		
		tfModelo = new JTextField();
		tfModelo.setFont(new Font("Times new Roman", Font.PLAIN, 12));
		tfModelo.setBounds(199, 107, 321, 24);
		contentPane.add(tfModelo);
		tfModelo.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ano:");
		lblNewLabel_1_1.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(75, 141, 114, 24);
		contentPane.add(lblNewLabel_1_1);
		
		tfAno = new JTextField();
		tfAno.setFont(new Font("Times new Roman", Font.PLAIN, 12));
		tfAno.setColumns(10);
		tfAno.setBounds(199, 141, 321, 24);
		contentPane.add(tfAno);
		
		tfValor = new JTextField();
		tfValor.setFont(new Font("Times new Roman", Font.PLAIN, 12));
		tfValor.setColumns(10);
		tfValor.setBounds(199, 175, 321, 24);
		contentPane.add(tfValor);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Valor novo:");
		lblNewLabel_1_1_1.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(75, 175, 114, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Capacidade:");
		lblNewLabel_1_1_1_1.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(75, 209, 114, 24);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		tfCapacidade = new JTextField();
		tfCapacidade.setEnabled(false);
		tfCapacidade.setFont(new Font("Times new Roman", Font.PLAIN, 12));
		tfCapacidade.setColumns(10);
		tfCapacidade.setBounds(199, 209, 321, 24);
		contentPane.add(tfCapacidade);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbMoto.isSelected()) {
					
					// Moto
					mo.setModelo(tfModelo.getText());
					mo.setAno(Integer.parseInt(tfAno.getText()));
					mo.setValor(Double.parseDouble(tfValor.getText()));
					
					mo.imprime();
					
				} else if(rbAutomovel.isSelected()) {
					
					// Automóvel
					au.setModelo(tfModelo.getText());
					au.setAno(Integer.parseInt(tfAno.getText()));
					au.setValor(Double.parseDouble(tfValor.getText()));
					
					au.imprime();
					
				} else {
					
					// Caminhão
					ca.setModelo(tfModelo.getText());
					ca.setAno(Integer.parseInt(tfAno.getText()));
					ca.setValor(Double.parseDouble(tfValor.getText()));
					ca.setCapacidade(Double.parseDouble(tfCapacidade.getText()));
					
					ca.imprime();
					
				}
				
			}
		});
		
		btnNewButton.setFont(new Font("Times new Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(246, 257, 122, 33);
		contentPane.add(btnNewButton);
	}
}

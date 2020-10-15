package com.servicos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.entidades.Pessoa;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro {

	private JFrame frame;
	private JTextField txtIdPessoa;
	private JTextField txtNome;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID Pessoa");
		lblNewLabel.setBounds(44, 35, 65, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtIdPessoa = new JTextField();
		txtIdPessoa.setBounds(106, 32, 86, 20);
		frame.getContentPane().add(txtIdPessoa);
		txtIdPessoa.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pessoa pessoa = findId();
				txtIdPessoa.setText(String.valueOf(pessoa.getIdPessoa()));
				txtCPF.setText(pessoa.getCpf());
				txtNome.setText(pessoa.getNome());
			}
		});
		btnPesquisar.setBounds(44, 227, 111, 23);
		frame.getContentPane().add(btnPesquisar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(44, 63, 65, 14);
		frame.getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(106, 60, 297, 20);
		frame.getContentPane().add(txtNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(210, 32, 65, 14);
		frame.getContentPane().add(lblCpf);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(245, 32, 158, 20);
		frame.getContentPane().add(txtCPF);
	}
	
	public static Pessoa findId() {
		int id = Integer.valueOf(JOptionPane.showInputDialog("Id Pessoa"));
		Pessoa pessoa = Dao.findPessoaId(id);
		return pessoa;
	}
}

package com.eclipselink.service;

import javax.swing.JOptionPane;

import com.eclipselink.entity.Cliente;
import com.eclipselink.entity.Pessoa;

public class EntradaDados {

	static int opcao;
	static int subOpcao;
	static int auxOpcao;
	static String[] opcoes = {"Cliente","Pessoa","Usuário"}; 
	static Pessoa cliente;
	
	public static void main(String[] args) {
		
		cliente = new Cliente(); 
		
		do {
			auxOpcao = 99;
			subOpcao = 9;
			opcao = 
					Integer.valueOf(	
							JOptionPane.showInputDialog(
							"1 - Cliente\n"
						+ 	"2 - Pessoa\n"
						+ 	"3 - Usuário\n"
						+ 	"0 - Sair\n")
					);

			while(opcao!=0 && subOpcao!=0) {
				subOpcao =
						Integer.valueOf(
						JOptionPane.showInputDialog(
								"1 - Inclusão "+opcoes[opcao-1]+"\n"
							+ 	"2 - Alteração "+opcoes[opcao-1]+"\n"
							+ 	"3 - Consulta "+opcoes[opcao-1]+"\n"
							+ 	"4 - Exclusão "+opcoes[opcao-1]+"\n"
							+ 	"0 - Voltar\n")
					);
				auxOpcao = (opcao*10)+subOpcao;
				switch(auxOpcao) {
				case 11:
					incluirCliente(cliente);
					break;
				case 12:
					alterarCliente(cliente);
					break;
				case 13:
					consultarCliente(cliente);
					break;
				case 14:
					excluirCliente(cliente);
					break;

				}
			}
			
		}while(opcao !=0);

	}

	public static void incluirCliente(Pessoa cliente) {	
	}
	public static void alterarCliente(Pessoa cliente) {	
	}
	public static void consultarCliente(Pessoa cliente) {	
	}
	public static void excluirCliente(Pessoa cliente) {	
	}
	

}

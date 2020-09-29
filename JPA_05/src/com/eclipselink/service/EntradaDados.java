package com.eclipselink.service;

import javax.swing.JOptionPane;

public class EntradaDados {

	static int opcao;
	static int subOpcao;
	static String[] opcoes = {"Cliente","Pessoa","Usuário"}; 
	public static void main(String[] args) {
		
		do {
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
			}
			
		}while(opcao !=0);

	}

}

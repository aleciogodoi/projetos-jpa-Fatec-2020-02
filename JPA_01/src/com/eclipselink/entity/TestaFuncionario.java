package com.eclipselink.entity;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario01 = new Funcionario();
		System.out.println(funcionario01.toString());
		
		Funcionario[] funcionarios = new Funcionario[10];
		for(int i=0; i < funcionarios.length; i++) {
			funcionarios[i] = new Funcionario(1, "Funcionário "+i, i*500+1000, "Cargo "+i );
			System.out.println(funcionarios[i]);
		}
	}
}

package com.eclipselink.service;

import java.util.ArrayList;

import com.eclipselink.entity.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("212121","Alécio"));
		pessoas.add(new Pessoa("213244","Maria"));
		pessoas.add(new Pessoa("66666","Pedro"));
		pessoas.add(new Pessoa("212121","Ana"));

		System.out.println(pessoas.get(0).CPF +"-"+ pessoas.get(0).nome);
		System.out.println(pessoas.get(1).CPF);
		System.out.println(pessoas.get(2).CPF);
		System.out.println(pessoas.get(3).CPF);

		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i).CPF +"-"+ pessoas.get(i).nome);
		}
		
		for(Pessoa p : pessoas) {
			System.out.println(p.CPF +"-"+ p.nome);
		}
 		
	}

}

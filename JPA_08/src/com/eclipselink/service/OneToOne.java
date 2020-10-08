package com.eclipselink.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.eclipselink.entity.Departamento;
import com.eclipselink.entity.Funcionario;

public class OneToOne {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_08");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
	
		// Departamento
		//Departamento depto01 = new Departamento(1, "TI");
		//Departamento depto02 = new Departamento(2, "Estoque");

		//entitymanager.persist(depto01);
		//entitymanager.persist(depto02);
		
		// Funcionarios
		//Funcionario func01 = new Funcionario(1, "José", 10605.09, "Gerente", depto01 );
		//Funcionario func02 = new Funcionario(2, "Ana", 11605.09, "Gerente", depto02 );
		Funcionario func03 = new Funcionario(3, "Pedro", 21605.09, "Presidente" );
		entitymanager.persist(func03);
		
		//entitymanager.persist(func01);
		//entitymanager.persist(func02);
		
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}
}
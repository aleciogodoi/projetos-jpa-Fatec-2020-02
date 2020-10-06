package com.eclipselink.service;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.eclipselink.entity.Aluno;
import com.eclipselink.entity.Cliente;
import com.eclipselink.entity.Usuario;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_05");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		// Aluno
		
		ArrayList<Aluno> alunos = new 	ArrayList<Aluno>(); 
		alunos.add(new Aluno(1, "Erika", "erika@gmail.com", 21, "Desenvolvimento de Sistemas", "00093876", 10, 9  ));
		alunos.add(new Aluno(2, "José", "jose@gmail.com", 22, "Desenvolvimento de Sistemas", "00077654", 10, 9  ));
		alunos.add(new Aluno(3, "Ana", "ana@gmail.com", 25, "Desenvolvimento de Sistemas", "09866453", 10, 9  ));
		alunos.add(new Aluno(4, "Antonio", "antonio@gmail.com", 20, "Gestão da Produção Industrial", "655431", 10, 9  ));
		alunos.add(new Aluno(5, "Carla", "carla@gmail.com", 27, "Gestão da Produção Industrial", "111212", 10, 9  ));
		alunos.add(new Aluno(6, "Rita", "rita@gmail.com", 23, "Gestão da Produção Industrial", "9876001", 10, 9  ));
		
		for (Aluno aluno: alunos) {
			entitymanager.persist(aluno);
		}

		// Cliente
		
		ArrayList<Cliente> clientes = new 	ArrayList<Cliente>(); 
		clientes.add(new Cliente(1, "Marcos", "marcos@gmail.com", 21, "Rua Xpto, 123", "(11) 2020-0908"));
		clientes.add(new Cliente(2, "Carlos", "carlos@gmail.com", 22, "Rua da Gloria, 765", "(11) 9999-0000" ));
		clientes.add(new Cliente(3, "Josefa", "josefa@gmail.com", 23, "Av. Imperador, 8765", "(11) 9999-1111"));
		clientes.add(new Cliente(4, "Mariana", "mariana@gmail.com", 19, "Praca da Republica, 341", "(11) 9911-0000"));
		clientes.add(new Cliente(5, "Adriana", "adriana@gmail.com", 18, "Av. Industrial, 8765", "(11) 7777-0000"));
		clientes.add(new Cliente(6, "Marcela", "marcela@gmail.com", 40, "Alameda dos Passaros, 1065", "(11) 5555-0000"));
		
		for (Cliente cliente: clientes) {
			entitymanager.persist(cliente);
		}

		// Usuario
		
		ArrayList<Usuario> usuarios = new 	ArrayList<Usuario>(); 
		usuarios.add(new Usuario(1, "Pedro", "pedro@gmail.com", 21, "pedro", ""));
		usuarios.add(new Usuario(2, "Henrique", "henrique@gmail.com", 22, "herique",""));
		usuarios.add(new Usuario(3, "Vanessa", "vanessa@gmail.com", 23, "josefa", ""));
		usuarios.add(new Usuario(4, "Cristina", "cristina@gmail.com", 19, "cristina", ""));
		usuarios.add(new Usuario(5, "Marta", "marta@gmail.com", 18, "marta", ""));
		usuarios.add(new Usuario(6, "Bruna", "bruna@gmail.com", 20, "bruna", ""));
		
		for (Usuario usuario: usuarios) {
			entitymanager.persist(usuario);
		}

		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();

	}

}

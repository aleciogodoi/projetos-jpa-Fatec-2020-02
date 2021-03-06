package com.eclipselink.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import com.eclipselink.entity.Funcionario;

public class NamedQueries {
	

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPA_01");
		EntityManager entitymanager = emfactory.createEntityManager();
		Query query = entitymanager.createNamedQuery("find Funcionario id");

		// Consulta por id
		int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
		query.setParameter("id", id);
		//Funcionario funcionario_aux  = (Funcionario)query.getSingleResult();
		List<Funcionario> funcionario = (List<Funcionario>) query.getResultList();

		String resultado="";
		if (funcionario != null) {
			resultado="";
			for (Funcionario f : funcionario) {
				System.out.print("Employee ID :" + f.getIdFuncionario());
				System.out.println("\t Employee Name :" + f.getNome());
				resultado += "Employee ID :" + f.getIdFuncionario()+"\t Employee Name :" + f.getNome()+"\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
		}

		if (funcionario != null) {
			resultado="";
			for (int i = 0; i < funcionario.size(); i++) {
				System.out.print("Employee ID :" + funcionario.get(i).getIdFuncionario());
				System.out.println("\t Employee Name :" + funcionario.get(i).getNome());
				resultado += "Employee ID :" + funcionario.get(i).getIdFuncionario()+"\t Employee Name :" + funcionario.get(i).getNome()+"\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
		}

		// Consulta por nome
		Query query2 = entitymanager.createNamedQuery("find Funcionario nome");
		String nome = JOptionPane.showInputDialog("Nome");
		query2.setParameter("nome", nome);
		List<Funcionario> funcionario2 = (List<Funcionario>) query2.getResultList();

		if (funcionario2 != null) {
			resultado="";
			for (Funcionario f : funcionario2) {
				System.out.print("Employee ID :" + f.getIdFuncionario());
				System.out.println("\t Employee Name :" + f.getNome());
				resultado += "Employee ID :" + f.getIdFuncionario()+"\t Employee Name :" + f.getNome()+"\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
		}
		
		// Consulta por nome
		Query query3 = entitymanager.createNamedQuery("find Funcionario salario");
		double sal = Double.valueOf(JOptionPane.showInputDialog("Salario"));
		query3.setParameter("salario", sal);
		List<Funcionario> funcionario3 = (List<Funcionario>) query3.getResultList();

		if (funcionario3 != null) {
			resultado="";
			for (Funcionario f : funcionario3) {
				System.out.print("Employee ID :" + f.getIdFuncionario());
				System.out.println("\t Employee Name :" + f.getNome());
				resultado += "Employee ID :" + f.getIdFuncionario()+"\t Employee Name :" + f.getNome()+"\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
		}
		
	}
}
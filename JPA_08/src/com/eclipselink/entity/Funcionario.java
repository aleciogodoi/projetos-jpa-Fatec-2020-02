package com.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Funcionario {
	
	@Id
	private int idFuncionario;
		
	private String nome;
	private double salario;
	private String cargo;
		
	@OneToOne
	private Departamento departamento;
	
	public Funcionario() {

		super();
	}
	
	public Funcionario(int idFuncionario, String nome, double salario, String cargo, Departamento depto) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		this.departamento = depto;
	}	
	
	public Funcionario(int idFuncionario, String nome, double salario, String cargo) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", salario=" + salario + ", cargo="
				+ cargo +", "+ this.departamento.toString() + "]";
	}
}

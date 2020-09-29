package com.eclipselink.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public abstract class Pessoa implements Serializable {
	
	//@GeneratedValue( strategy = GenerationType.AUTO )

	@Id
	private int idPessoa ;
	
	private String nome;
	private String email;
	private int idade;
		
	public Pessoa() {
		super();
	}

	public Pessoa(int idPessoa, String nome, String email, int idade) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}

}

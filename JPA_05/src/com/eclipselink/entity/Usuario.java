package com.eclipselink.entity;
import javax.persistence.Entity;

@Entity
public class Usuario extends Pessoa {
	
	private String login;
	private String senha;
	
	public Usuario() {
		super();
	}
	
	public Usuario(int idPessoa, String nome, String email, int idade, String login, String senha) {
		super(idPessoa, nome, email, idade);
		this.login = login;
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", toString()=" + super.toString() + "]";
	}

}

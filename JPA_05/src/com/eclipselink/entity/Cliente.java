package com.eclipselink.entity;
import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
	private String endereco;
	private String telefone;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int idPessoa, String nome, String email, int idade, String endereco, String telefone) {
		super(idPessoa, nome, email, idade);
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", telefone=" + telefone + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

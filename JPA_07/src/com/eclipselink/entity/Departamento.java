package com.eclipselink.entity;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {
	
	@Id
	private int idDepto;
	
	private  String nomeDepto;	

	public Departamento() {
		super();
	}
	
	@OneToMany( targetEntity = Funcionario.class )
	private List funcionario;
	
	public Departamento(int idDepto, String nomeDepto, List funcionario) {
		super();
		this.idDepto = idDepto;
		this.nomeDepto = nomeDepto;
		this.funcionario = funcionario;
	}


	public int getIdDepto() {
		return idDepto;
	}
	public void setIdDepto(int idDepto) {
		this.idDepto = idDepto;
	}
	public String getNomeDepto() {
		return nomeDepto;
	}
	public void setNomeDepto(String nomeDepto) {
		this.nomeDepto = nomeDepto;
	}
	@Override
	public String toString() {
		return "Departamento [idDepto=" + idDepto + ", nomeDepto=" + nomeDepto + "]";
	}
}

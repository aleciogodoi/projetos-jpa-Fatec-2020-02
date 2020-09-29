package com.eclipselink.entity;
import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa{
	private String curso;
	private String ra;
	private double nota1;
	private double nota2;
	
	public Aluno() {
		super();
	}
	
	public Aluno(int idPessoa, String nome, String email, int idade, String curso, String ra, double nota1,
			double nota2) {
		super(idPessoa, nome, email, idade);
		this.curso = curso;
		this.ra = ra;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", ra=" + ra + ", nota1=" + nota1 + ", nota2=" + nota2 + ", toString()="
				+ super.toString() + "]";
	}
	

}

package br.com.ibiagas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_depto;
	
	@OneToMany
	private Funcionarios funcionarios;
	
	private String nome_depto;
	
	// Getters and Setters

	public Funcionarios getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionarios funcionarios) {
		this.funcionarios = funcionarios;
	}
	public int getCod_depto() {
		return cod_depto;
	}
	public void setCod_depto(int cod_depto) {
		this.cod_depto = cod_depto;
	}
	public String getNome_depto() {
		return nome_depto;
	}
	public void setNome_depto(String nome_depto) {
		this.nome_depto = nome_depto;
	}
}

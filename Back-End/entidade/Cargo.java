package br.com.ibiagas.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cargo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_cargo;
	
	@OneToMany
	private Funcionarios funcionarios;
	
	private String nome_cargo;

    // Getters and Setters 	
	
	public int getCod_cargo() {
		return cod_cargo;
	}
	public void setCod_cargo(int cod_cargo) {
		this.cod_cargo = cod_cargo;
	}
	public Funcionarios getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionarios funcionarios) {
		this.funcionarios = funcionarios;
	}
	public String getNome_cargo() {
		return nome_cargo;
	}
	public void setNome_cargo(String nome_cargo) {
		this.nome_cargo = nome_cargo;
	}
}

package br.com.ibiagas.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private Funcionarios funcionarios;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_depto;
	
	@Column(length = 15 , nullable = false)
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
	
	@Override
	public int hashCode() {
		return Objects.hash(funcionarios, nome_depto);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(funcionarios, other.funcionarios) && Objects.equals(nome_depto, other.nome_depto);
	}
}

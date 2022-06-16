package br.com.ibiagas.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cargo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(nullable = false)
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cod_cargo;
	
    @Column(length = 15, nullable = false)
	private String nome_cargo;

    // Getters and Setters 	
	
	public int getCod_cargo() {
		return cod_cargo;
	}
	public void setCod_cargo(int cod_cargo) {
		this.cod_cargo = cod_cargo;
	}
	public String getNome_cargo() {
		return nome_cargo;
	}
	public void setNome_cargo(String nome_cargo) {
		this.nome_cargo = nome_cargo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome_cargo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		return Objects.equals(nome_cargo, other.nome_cargo);
	}
}

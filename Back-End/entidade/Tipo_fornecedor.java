package br.com.ibiagas.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tipo_fornecedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_tipo_fornecedor;
	
	@Column(length = 15, nullable = false)
	private String desc_tipo_pessoa;

	//Getters and Setters
	
	public int getCod_tipo_fornecedor() {
		return cod_tipo_fornecedor;
	}
	public void setCod_tipo_fornecedor(int cod_tipo_fornecedor) {
		this.cod_tipo_fornecedor = cod_tipo_fornecedor;
	}
	public String getDesc_tipo_pessoa() {
		return desc_tipo_pessoa;
	}
	public void setDesc_tipo_pessoa(String desc_tipo_pessoa) {
		this.desc_tipo_pessoa = desc_tipo_pessoa;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_tipo_fornecedor, desc_tipo_pessoa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipo_fornecedor other = (Tipo_fornecedor) obj;
		return cod_tipo_fornecedor == other.cod_tipo_fornecedor
				&& Objects.equals(desc_tipo_pessoa, other.desc_tipo_pessoa);
	}
}

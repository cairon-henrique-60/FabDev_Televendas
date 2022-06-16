package br.com.ibiagas.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tipo_cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_tipo_cliente;
	
	@Column(length = 15, nullable = false)
	private String desc_tipo_pessoa;
	
	//Getters and Setters

	public int getCod_tipo_cliente() {
		return cod_tipo_cliente;
	}
	public void setCod_tipo_cliente(int cod_tipo_cliente) {
		this.cod_tipo_cliente = cod_tipo_cliente;
	}
	public String getDesc_tipo_pessoa() {
		return desc_tipo_pessoa;
	}
	public void setDesc_tipo_pessoa(String desc_tipo_pessoa) {
		this.desc_tipo_pessoa = desc_tipo_pessoa;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_tipo_cliente, desc_tipo_pessoa);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tipo_cliente other = (Tipo_cliente) obj;
		return cod_tipo_cliente == other.cod_tipo_cliente
				&& Objects.equals(desc_tipo_pessoa, other.desc_tipo_pessoa);
	}
}

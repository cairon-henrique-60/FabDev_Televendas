package br.com.ibiagas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tipo_fornecedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private Fornecedor fornecedor;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_tipo_fornecedor;
	
	private String desc_tipo_pessoa;

	//Getters and Setters
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
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
}

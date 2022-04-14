package br.com.ibiagas.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_fornecedor; 
	
	private String nome_fornecedor;
	private String end_uf;
	private String end_cidade;
	private String end_logradouro;
	private int end_cep;
	private int cod_tipo_fornecedor;
	private int cpf_cnpj;
	
	// Getters and Setters
	
	public int getCod_fornecedor() {
		return cod_fornecedor;
	}
	public void setCod_fornecedor(int cod_fornecedor) {
		this.cod_fornecedor = cod_fornecedor;
	}
	public String getNome_fornecedor() {
		return nome_fornecedor;
	}
	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}
	public String getEnd_uf() {
		return end_uf;
	}
	public void setEnd_uf(String end_uf) {
		this.end_uf = end_uf;
	}
	public String getEnd_cidade() {
		return end_cidade;
	}
	public void setEnd_cidade(String end_cidade) {
		this.end_cidade = end_cidade;
	}
	public String getEnd_logradouro() {
		return end_logradouro;
	}
	public void setEnd_logradouro(String end_logradouro) {
		this.end_logradouro = end_logradouro;
	}
	public int getEnd_cep() {
		return end_cep;
	}
	public void setEnd_cep(int end_cep) {
		this.end_cep = end_cep;
	}
	public int getCod_tipo_fornecedor() {
		return cod_tipo_fornecedor;
	}
	public void setCod_tipo_fornecedor(int cod_tipo_fornecedor) {
		this.cod_tipo_fornecedor = cod_tipo_fornecedor;
	}
	public int getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(int cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
	
}


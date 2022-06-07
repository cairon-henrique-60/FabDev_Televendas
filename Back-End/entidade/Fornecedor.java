package br.com.ibiagas.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Fornecedor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Tipo_fornecedor tipo_fornecedor;
	@OneToMany
	private Nota_fiscal_entrada nota_fiscal_entrada;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_fornecedor; 
	
	@Column(length = 30, nullable = false)
	private String nome_fornecedor;
	
	@Column(length = 10, nullable = false)
	private String end_uf;
	
	@Column(length = 30, nullable = false)
	private String end_cidade;
	
	@Column(length = 30, nullable = false)
	private String end_logradouro;
	
	@Column(nullable = false)
	private int end_cep;
	
	@Column(nullable = false)
	private int cod_tipo_fornecedor;
	
	@Column(nullable = false)
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
	public Tipo_fornecedor getTipo_fornecedor() {
		return tipo_fornecedor;
	}
	public void setTipo_fornecedor(Tipo_fornecedor tipo_fornecedor) {
		this.tipo_fornecedor = tipo_fornecedor;
	}
	public Nota_fiscal_entrada getNota_fiscal_entrada() {
		return nota_fiscal_entrada;
	}
	public void setNota_fiscal_entrada(Nota_fiscal_entrada nota_fiscal_entrada) {
		this.nota_fiscal_entrada = nota_fiscal_entrada;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_fornecedor, cod_tipo_fornecedor, cpf_cnpj, end_cep, end_cidade, end_logradouro, end_uf,
				nome_fornecedor, nota_fiscal_entrada, tipo_fornecedor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return cod_fornecedor == other.cod_fornecedor && cod_tipo_fornecedor == other.cod_tipo_fornecedor
				&& cpf_cnpj == other.cpf_cnpj && end_cep == other.end_cep
				&& Objects.equals(end_cidade, other.end_cidade) && Objects.equals(end_logradouro, other.end_logradouro)
				&& Objects.equals(end_uf, other.end_uf) && Objects.equals(nome_fornecedor, other.nome_fornecedor)
				&& Objects.equals(nota_fiscal_entrada, other.nota_fiscal_entrada)
				&& Objects.equals(tipo_fornecedor, other.tipo_fornecedor);
	}
}


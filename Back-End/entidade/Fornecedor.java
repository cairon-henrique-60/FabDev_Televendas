package br.com.ibiagas.entidades;

public class Fornecedor {
	
	private int cod_fornecedor; //--> Primary Key
	private String nome_fornecedor;
	private String end_uf;
	private String end_cidade;
	private String end_logradouro;
	private int end_cep;
	private int cod_tipo_fornecedor;
	private int cpf_cnpj;
	public String getNome_fornecedor() {
		return nome_fornecedor;
	}
	public void setNome_fornecedor(String nome_fornecedor) {
		if (end_cidade == null) {
			throw new RuntimeException("Nome do fornecedor não pode ser nulo");
		}
		this.nome_fornecedor = nome_fornecedor;
	}
	public String getEnd_uf() {
		return end_uf;
	}
	public void setEnd_uf(String end_uf) {
		if (end_uf == null) {
			throw new RuntimeException("Endereço do fornecedor não pode ser nulo");
		}
		this.end_uf = end_uf;
	}
	public String getEnd_cidade() {
		return end_cidade;
	}
	public void setEnd_cidade(String end_cidade) {
		if (end_cidade == null) {
			throw new RuntimeException("Cidade do fornecedor não pode ser nula");
		}
		this.end_cidade = end_cidade;
	}
	public String getEnd_logradouro() {
		return end_logradouro;
	}
	public void setEnd_logradouro(String end_logradouro) {
		if (end_cidade == null) {
			throw new RuntimeException("Logradouro do fornecedor não pode ser nulo");
		}
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

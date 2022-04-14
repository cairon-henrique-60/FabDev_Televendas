package br.com.ibiagas.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
	
	@Id
	private int id_cliente;
	
	@OneToOne
	private Tipo_Cliente tipo_cliente;
	@OneToMany
	private Pedido pedido;
	
	private String nome_cliente; 
	private String end_logradouro;
	private int end_num;	
	private String end_complemento;	
	private String end_bairro; 
	private String end_cidade; 
	private String end_uf; 
	private int end_cep;				
	private int tel;	
	private String email; 		
	private int cod_tipo_cliente;
	private int cpf_cnpj;
	
	//Getters and Setters
	
	public Tipo_Cliente getTipo_cliente() {
		return tipo_cliente;
	}
	public void setTipo_cliente(Tipo_Cliente tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getEnd_logradouro() {
		return end_logradouro;
	}
	public void setEnd_logradouro(String end_logradouro) {
		this.end_logradouro = end_logradouro;
	}
	public int getEnd_num() {
		return end_num;
	}
	public void setEnd_num(int end_num) {
		this.end_num = end_num;
	}
	public String getEnd_complemento() {
		return end_complemento;
	}
	public void setEnd_complemento(String end_complemento) {
		this.end_complemento = end_complemento;
	}
	public String getEnd_bairro() {
		return end_bairro;
	}
	public void setEnd_bairro(String end_bairro) {
		this.end_bairro = end_bairro;
	}
	public String getEnd_cidade() {
		return end_cidade;
	}
	public void setEnd_cidade(String end_cidade) {
		this.end_cidade = end_cidade;
	}
	public String getEnd_uf() {
		return end_uf;
	}
	public void setEnd_uf(String end_uf) {
		this.end_uf = end_uf;
	}
	public int getEnd_cep() {
		return end_cep;
	}
	public void setEnd_cep(int end_cep) {
		this.end_cep = end_cep;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCod_tipo_cliente() {
		return cod_tipo_cliente;
	}
	public void setCod_tipo_cliente(int cod_tipo_cliente) {
		this.cod_tipo_cliente = cod_tipo_cliente;
	}
	public int getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(int cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
}

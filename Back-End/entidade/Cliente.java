package br.com.ibiagas.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
	
	@OneToOne
	private Tipo_cliente tipo_cliente;
	@OneToMany
	private Pedido pedido;
	
	@Id
	@Column(nullable = false)
	private int id_cliente;
	
	@Column(length = 80, nullable = false)
	private String nome_cliente; 
	
	@Column(length = 30, nullable = false)
	private String end_logradouro;
	
	@Column(nullable = false)
	private int end_num;	
	
	@Column(length = 10, nullable = false)
	private String end_complemento;	
	
	@Column(length = 30, nullable = false)
	private String end_bairro; 
	
	@Column(length = 30, nullable = false)
	private String end_cidade; 
	
	@Column(length = 10, nullable = false)
	private String end_uf; 
	
	@Column(nullable = true)
	private int end_cep;		
	
	@Column(nullable = false)
	private int tel;	
	
	@Column(length = 80)
	private String email;
	
	@Column(nullable = false)
	private int cod_tipo_cliente;
	
	@Column(nullable = false)
	private int cpf_cnpj;
	
	//Getters and Setters
	
	public Tipo_cliente getTipo_cliente() {
		return tipo_cliente;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public void setTipo_cliente(Tipo_cliente tipo_cliente) {
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
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_tipo_cliente, cpf_cnpj, email, end_bairro, end_cep, end_cidade, end_complemento,
				end_logradouro, end_num, end_uf, id_cliente, nome_cliente, pedido, tel, tipo_cliente);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cod_tipo_cliente == other.cod_tipo_cliente && cpf_cnpj == other.cpf_cnpj
				&& Objects.equals(email, other.email) && Objects.equals(end_bairro, other.end_bairro)
				&& end_cep == other.end_cep && Objects.equals(end_cidade, other.end_cidade)
				&& Objects.equals(end_complemento, other.end_complemento)
				&& Objects.equals(end_logradouro, other.end_logradouro) && end_num == other.end_num
				&& Objects.equals(end_uf, other.end_uf) && id_cliente == other.id_cliente
				&& Objects.equals(nome_cliente, other.nome_cliente) && Objects.equals(pedido, other.pedido)
				&& tel == other.tel && Objects.equals(tipo_cliente, other.tipo_cliente);
	}
}

package br.com.ibiagas.entidades;

import java.util.Date;

public class Funcionarios {
	
	private int cod_func; //--> Primary Key
	private String nome_fun;
	private String end_func;
	private String bairro_func;
	private int num_func;
	private int tel_func;
	private int cel_func;
	private String email_func;
	private String cpf_func;
	private int num_cnh;
	private String tipo_cnh;
	private Date val_cnh;
	private int cod_cargo;
	private int cod_depto;
	private int cod_urna;
	
	public String getNome_fun() {
		return nome_fun;
	}
	public void setNome_fun(String nome_fun) {
		if (nome_fun == null) {
			throw new RuntimeException("Nome do funcioanário não pode ser nulo");
		}
		this.nome_fun = nome_fun;
	}
	public String getEnd_func() {
		return end_func;
	}
	public void setEnd_func(String end_func) {
		this.end_func = end_func;
	}
	public String getBairro_func() {
		return bairro_func;
	}
	public void setBairro_func(String bairro_func) {
		this.bairro_func = bairro_func;
	}
	public int getNum_func() {
		return num_func;
	}
	public void setNum_func(int num_func) {
		this.num_func = num_func;
	}
	public int getTel_func() {
		return tel_func;
	}
	public void setTel_func(int tel_func) {
		this.tel_func = tel_func;
	}
	public int getCel_func() {
		return cel_func;
	}
	public void setCel_func(int cel_func) {
		this.cel_func = cel_func;
	}
	public String getEmail_func() {
		return email_func;
	}
	public void setEmail_func(String email_func) {
		if (email_func == null) {
			throw new RuntimeException("Email do funcionário não pode ser nulo*");
		}
		this.email_func = email_func;
	}
	public String getCpf_func() {
		return cpf_func;
	}
	public void setCpf_func(String cpf_func) {
		this.cpf_func = cpf_func;
	}
	public int getNum_cnh() {
		return num_cnh;
	}
	public void setNum_cnh(int num_cnh) {
		this.num_cnh = num_cnh;
	}
	public String getTipo_cnh() {
		return tipo_cnh;
	}
	public void setTipo_cnh(String tipo_cnh) {
		this.tipo_cnh = tipo_cnh;
	}
	public Date getVal_cnh() {
		return val_cnh;
	}
	public void setVal_cnh(Date val_cnh) {
		this.val_cnh = val_cnh;
	}
	public int getCod_cargo() {
		return cod_cargo;
	}
	public void setCod_cargo(int cod_cargo) {
		this.cod_cargo = cod_cargo;
	}
	public int getCod_depto() {
		return cod_depto;
	}
	public void setCod_depto(int cod_depto) {
		this.cod_depto = cod_depto;
	}
	public int getCod_urna() {
		return cod_urna;
	}
	public void setCod_urna(int cod_urna) {
		this.cod_urna = cod_urna;
	}	
}

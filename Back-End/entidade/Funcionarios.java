package br.com.ibiagas.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Funcionarios implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToOne
	private Departamento departamento;
	@OneToOne
	private Cargo cargo;
	@OneToMany
	private Veiculo_entregador veiculo_entregador;
	@OneToOne
	private Caixa_urna caixa_urna;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_func;
	
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
	private LocalDate val_cnh;
	private int cod_cargo;
	private int cod_depto;
	private int cod_urna;
	
	// Getters and Setters

	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public int getCod_func() {
		return cod_func;
	}
	public void setCod_func(int cod_func) {
		this.cod_func = cod_func;
	}
	public String getNome_fun() {
		return nome_fun;
	}
	public void setNome_fun(String nome_fun) {
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
	public LocalDate getVal_cnh() {
		return val_cnh;
	}
	public void setVal_cnh(LocalDate val_cnh) {
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
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Veiculo_entregador getVeiculo_entregador() {
		return veiculo_entregador;
	}
	public void setVeiculo_entregador(Veiculo_entregador veiculo_entregador) {
		this.veiculo_entregador = veiculo_entregador;
	}
	public Caixa_urna getCaixa_urna() {
		return caixa_urna;
	}
	public void setCaixa_urna(Caixa_urna caixa_urna) {
		this.caixa_urna = caixa_urna;
	}
}

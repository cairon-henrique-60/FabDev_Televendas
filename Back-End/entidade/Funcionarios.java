package br.com.ibiagas.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

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
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_func;
	
	@Column(length= 30, nullable = false)
	private String nome_fun;
	
	@Column(length = 30, nullable = true)
	private String end_func;
	
	@Column(length = 30, nullable = true)
	private String bairro_func;
	
	@Column(nullable = true)
	private int num_func;
	
	@Column(nullable = false)
	private int tel_func;
	
	@Column(nullable = false)
	private int cel_func;
	
	@Column(length= 30, nullable = false)
	private String email_func;
	
	@Column(length = 11, nullable = true)
	private String cpf_func;
	
	@Column(nullable = true)
	private int num_cnh;
	
	@Column(length = 2, nullable = true)
	private String tipo_cnh;
	
	@Column(nullable = true)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate val_cnh;
	
	@Column(nullable = false)
	private int cod_cargo;
	
	@Column(nullable = false)
	private int cod_depto;
	
	@Column(nullable = false)
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
	@Override
	public int hashCode() {
		return Objects.hash(bairro_func, caixa_urna, cargo, cel_func, cod_cargo, cod_depto, cod_func, cod_urna,
				cpf_func, departamento, email_func, end_func, nome_fun, num_cnh, num_func, tel_func, tipo_cnh, val_cnh,
				veiculo_entregador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionarios other = (Funcionarios) obj;
		return Objects.equals(bairro_func, other.bairro_func) && Objects.equals(caixa_urna, other.caixa_urna)
				&& Objects.equals(cargo, other.cargo) && cel_func == other.cel_func && cod_cargo == other.cod_cargo
				&& cod_depto == other.cod_depto && cod_func == other.cod_func && cod_urna == other.cod_urna
				&& Objects.equals(cpf_func, other.cpf_func) && Objects.equals(departamento, other.departamento)
				&& Objects.equals(email_func, other.email_func) && Objects.equals(end_func, other.end_func)
				&& Objects.equals(nome_fun, other.nome_fun) && num_cnh == other.num_cnh && num_func == other.num_func
				&& tel_func == other.tel_func && Objects.equals(tipo_cnh, other.tipo_cnh)
				&& Objects.equals(val_cnh, other.val_cnh)
				&& Objects.equals(veiculo_entregador, other.veiculo_entregador);
	}
	
}

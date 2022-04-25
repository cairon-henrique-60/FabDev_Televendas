package br.com.ibiagas.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Caixa_urna implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private Pedido pedido;
	@OneToMany
	private Funcionarios funcionarios;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_urna;
	
	private String local_urna;
	private float saldo_urna;
	private LocalDate data_deposito;
	private float valor_deposito;
	
	//Getters and Setters
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Funcionarios getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionarios funcionarios) {
		this.funcionarios = funcionarios;
	}
	public int getCod_urna() {
		return cod_urna;
	}
	public void setCod_urna(int cod_urna) {
		this.cod_urna = cod_urna;
	}
	public String getLocal_urna() {
		return local_urna;
	}
	public void setLocal_urna(String local_urna) {
		this.local_urna = local_urna;
	}
	public float getSaldo_urna() {
		return saldo_urna;
	}
	public void setSaldo_urna(float saldo_urna) {
		this.saldo_urna = saldo_urna;
	}
	public LocalDate getData_deposito() {
		return data_deposito;
	}
	public void setData_deposito(LocalDate data_deposito) {
		this.data_deposito = data_deposito;
	}
	public float getValor_deposito() {
		return valor_deposito;
	}
	public void setValor_deposito(float valor_deposito) {
		this.valor_deposito = valor_deposito;
	}
}

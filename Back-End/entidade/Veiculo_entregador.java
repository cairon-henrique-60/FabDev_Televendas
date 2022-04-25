package br.com.ibiagas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Veiculo_entregador implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Veiculo veiculo;
	@OneToOne
	private Funcionarios funcionarios;
	@OneToMany
	private Movimentacao_material movimentacao_material;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_veiculo_entregador;
	
	private int saldo_estoque;
	private int cod_veiculo;
	private int cod_func;
	
	//Getters and Setters 
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Funcionarios getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionarios funcionarios) {
		this.funcionarios = funcionarios;
	}
	public Movimentacao_material getMovimentacao_material() {
		return movimentacao_material;
	}
	public void setMovimentacao_material(Movimentacao_material movimentacao_material) {
		this.movimentacao_material = movimentacao_material;
	}
	public int getCod_veiculo_entregador() {
		return cod_veiculo_entregador;
	}
	public void setCod_veiculo_entregador(int cod_veiculo_entregador) {
		this.cod_veiculo_entregador = cod_veiculo_entregador;
	}
	public int getSaldo_estoque() {
		return saldo_estoque;
	}
	public void setSaldo_estoque(int saldo_estoque) {
		this.saldo_estoque = saldo_estoque;
	}
	public int getCod_veiculo() {
		return cod_veiculo;
	}
	public void setCod_veiculo(int cod_veiculo) {
		this.cod_veiculo = cod_veiculo;
	}
	public int getCod_func() {
		return cod_func;
	}
	public void setCod_func(int cod_func) {
		this.cod_func = cod_func;
	}
}

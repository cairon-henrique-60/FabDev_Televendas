package br.com.ibiagas.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Veiculo_entregador implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Veiculo veiculo;
	@ManyToOne
	private Funcionarios funcionarios;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_veiculo_entregador;
	
	@Column(nullable = false)
	private int saldo_estoque;
	
	@JoinColumn(nullable = false)
	private int cod_veiculo;
	
	@JoinColumn(nullable = false)
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
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_func, cod_veiculo, cod_veiculo_entregador, funcionarios,
				saldo_estoque, veiculo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo_entregador other = (Veiculo_entregador) obj;
		return cod_func == other.cod_func && cod_veiculo == other.cod_veiculo
				&& cod_veiculo_entregador == other.cod_veiculo_entregador
				&& Objects.equals(funcionarios, other.funcionarios)
				&& saldo_estoque == other.saldo_estoque && Objects.equals(veiculo, other.veiculo);
	}
}

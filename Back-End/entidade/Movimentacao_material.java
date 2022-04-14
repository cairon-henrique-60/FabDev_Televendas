package br.com.ibiagas.entidades;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Movimentacao_material implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_movimentacao;
	
	@OneToOne
	private Produto produto;
	
	private Date data_movimentacao;
	private Time hora_movimentacao;
	private int qtd_movimentacao;
	private String tipo_movimentacao;
	private int cod_produto;
	private int cod_veiculo_entregador;
	
	//Getters and Setters
	
	public int getCod_movimentacao() {
		return cod_movimentacao;
	}
	public void setCod_movimentacao(int cod_movimentacao) {
		this.cod_movimentacao = cod_movimentacao;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Date getData_movimentacao() {
		return data_movimentacao;
	}
	public void setData_movimentacao(Date data_movimentacao) {
		this.data_movimentacao = data_movimentacao;
	}
	public Time getHora_movimentacao() {
		return hora_movimentacao;
	}
	public void setHora_movimentacao(Time hora_movimentacao) {
		this.hora_movimentacao = hora_movimentacao;
	}
	public int getQtd_movimentacao() {
		return qtd_movimentacao;
	}
	public void setQtd_movimentacao(int qtd_movimentacao) {
		this.qtd_movimentacao = qtd_movimentacao;
	}
	public String getTipo_movimentacao() {
		return tipo_movimentacao;
	}
	public void setTipo_movimentacao(String tipo_movimentacao) {
		this.tipo_movimentacao = tipo_movimentacao;
	}
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public int getCod_veiculo_entregador() {
		return cod_veiculo_entregador;
	}
	public void setCod_veiculo_entregador(int cod_veiculo_entregador) {
		this.cod_veiculo_entregador = cod_veiculo_entregador;
	}
	
	
	
}

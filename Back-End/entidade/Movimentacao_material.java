package br.com.ibiagas.entidades;

import java.sql.Time;
import java.util.Date;

public class Movimentacao_material {
	private int cod_movimentacao; //--> Primary key
	private Date data_movimentacao;
	private Time hora_movimentacao;
	private int qtd_movimentacao;
	private String tipo_movimentacao;
	private int cod_produto;
	private int cod_veiculo_entregador;
	
	public Date getData_movimentacao() {
		return data_movimentacao;
	}
	public void setData_movimentacao(Date data_movimentacao) {
		if (data_movimentacao == null) {
			throw new RuntimeException("Data da movimentação não pode ser nula");
		}
		this.data_movimentacao = data_movimentacao;
	}
	public Time getHora_movimentacao() {
		return hora_movimentacao;
	}
	public void setHora_movimentacao(Time hora_movimentacao) {
		if (hora_movimentacao == null) {
			throw new RuntimeException("Hora da movimentação não pode ser nula");
		}
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
		if (tipo_movimentacao == null) {
			throw new RuntimeException("Tipo da movimentação não pode ser nulo");
		}
		if (tipo_movimentacao.length() > 1) {
			throw new RuntimeException("Tipo da movimentação só pode ter um caractere");
		}
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

package br.com.ibiagas.models;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Movimentacao_material implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Produto produto;
	@ManyToOne
	private Veiculo_entregador veiculo_entregador;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_movimentacao;
	
	@Column(nullable = false)
	@DateTimeFormat(style = "dd/M/yyyy")
	private LocalDate data_movimentacao;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "hh:mm:ss")
	private Time hora_movimentacao;
	
	@Column(nullable = false)
	private int qtd_movimentacao;
	
	@Column(length = 1)
	private String tipo_movimentacao;
	
	@JoinColumn(nullable = false)
	private int cod_produto;
	
	@JoinColumn(nullable = false)
	private int cod_veiculo_entregador;
	
	//Getters and Setters
	
	public int getCod_movimentacao() {
		return cod_movimentacao;
	}
	public Veiculo_entregador getVeiculo_entregador() {
		return veiculo_entregador;
	}
	public void setVeiculo_entregador(Veiculo_entregador veiculo_entregador) {
		this.veiculo_entregador = veiculo_entregador;
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
	public LocalDate getData_movimentacao() {
		return data_movimentacao;
	}
	public void setData_movimentacao(LocalDate data_movimentacao) {
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
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_movimentacao, cod_produto, cod_veiculo_entregador, data_movimentacao, hora_movimentacao,
				produto, qtd_movimentacao, tipo_movimentacao, veiculo_entregador);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movimentacao_material other = (Movimentacao_material) obj;
		return cod_movimentacao == other.cod_movimentacao && cod_produto == other.cod_produto
				&& cod_veiculo_entregador == other.cod_veiculo_entregador
				&& Objects.equals(data_movimentacao, other.data_movimentacao)
				&& Objects.equals(hora_movimentacao, other.hora_movimentacao) && Objects.equals(produto, other.produto)
				&& qtd_movimentacao == other.qtd_movimentacao
				&& Objects.equals(tipo_movimentacao, other.tipo_movimentacao)
				&& Objects.equals(veiculo_entregador, other.veiculo_entregador);
	}
}

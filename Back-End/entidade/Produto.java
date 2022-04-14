package br.com.ibiagas.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_produto;
	
	@OneToMany
	private Movimentacao_material movimentacao_material;
	@OneToOne
	private Preco_custo preco_custo;
	
	private String nome_produto;
	private int cod_preco_custo;
	private int cod_preco_venda;
	
	//Getters and Setters
	
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public Movimentacao_material getMovimentacao_material() {
		return movimentacao_material;
	}
	public void setMovimentacao_material(Movimentacao_material movimentacao_material) {
		this.movimentacao_material = movimentacao_material;
	}
	public Preco_custo getPreco_custo() {
		return preco_custo;
	}
	public void setPreco_custo(Preco_custo preco_custo) {
		this.preco_custo = preco_custo;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public int getCod_preco_custo() {
		return cod_preco_custo;
	}
	public void setCod_preco_custo(int cod_preco_custo) {
		this.cod_preco_custo = cod_preco_custo;
	}
	public int getCod_preco_venda() {
		return cod_preco_venda;
	}
	public void setCod_preco_venda(int cod_preco_venda) {
		this.cod_preco_venda = cod_preco_venda;
	}

}

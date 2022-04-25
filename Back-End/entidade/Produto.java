package br.com.ibiagas.models;

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
	
	@OneToMany
	private Movimentacao_material movimentacao_material;
	@OneToOne
	private Preco_custo preco_custo;
	@OneToMany
	private Item_pedido item_pedido;
	@OneToOne
	private Preco_venda preco_venda;
	@OneToMany
	private Item_nota_fiscal_entrada item_nota_fiscal_entrada;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_produto;
	
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
	public Item_pedido getItem_pedido() {
		return item_pedido;
	}
	public void setItem_pedido(Item_pedido item_pedido) {
		this.item_pedido = item_pedido;
	}
	public Preco_venda getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(Preco_venda preco_venda) {
		this.preco_venda = preco_venda;
	}
	public Item_nota_fiscal_entrada getItem_nota_fiscal_entrada() {
		return item_nota_fiscal_entrada;
	}
	public void setItem_nota_fiscal_entrada(Item_nota_fiscal_entrada item_nota_fiscal_entrada) {
		this.item_nota_fiscal_entrada = item_nota_fiscal_entrada;
	}
}

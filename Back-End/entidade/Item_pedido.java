package br.com.ibiagas.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item_pedido {

	@OneToOne	
	private Pedido pedido;
	@OneToOne
	private Produto produto;
	
	@Id
	private int cod_item_pedido;
	private int qtd_produto_pedido; 
	private float preco_venda;	
	private int cod_pedido;	
	private int cod_produto;
	
	//Getters and Setters
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getCod_item_pedido() {
		return cod_item_pedido;
	}
	public void setCod_item_pedido(int cod_item_pedido) {
		this.cod_item_pedido = cod_item_pedido;
	}
	public int getQtd_produto_pedido() {
		return qtd_produto_pedido;
	}
	public void setQtd_produto_pedido(int qtd_produto_pedido) {
		this.qtd_produto_pedido = qtd_produto_pedido;
	}
	public float getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public int getCod_pedido() {
		return cod_pedido;
	}
	public void setCod_pedido(int cod_pedido) {
		this.cod_pedido = cod_pedido;
	}
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
}

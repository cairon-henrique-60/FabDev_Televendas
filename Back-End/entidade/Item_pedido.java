package br.com.ibiagas.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item_pedido {

	@ManyToOne
	private Pedido pedido;
	@ManyToOne
	private Produto produto;
	
	@Id
	@Column(nullable = false)
	private int cod_item_pedido;
	
	@Column(nullable = false)
	private int qtd_produto_pedido; 
	
	@Column(nullable = false)
	private float preco_venda;	
	
	@JoinColumn(nullable = false)
	private int cod_pedido;	
	
	@JoinColumn(nullable = false)
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
	@Override
	public int hashCode() {
		return Objects.hash(cod_item_pedido, cod_pedido, cod_produto, pedido, preco_venda, produto, qtd_produto_pedido);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item_pedido other = (Item_pedido) obj;
		return cod_item_pedido == other.cod_item_pedido && cod_pedido == other.cod_pedido
				&& cod_produto == other.cod_produto && Objects.equals(pedido, other.pedido)
				&& Float.floatToIntBits(preco_venda) == Float.floatToIntBits(other.preco_venda)
				&& Objects.equals(produto, other.produto) && qtd_produto_pedido == other.qtd_produto_pedido;
	}
}

package br.com.ibiagas.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Preco_custo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private Produto produto;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_preco_custo;
	
	@Column(nullable = false)
	private int cod_produto;
	
	@Column(nullable = false)
	private float preco_custo;
	
	//Getters and Setters
	
	public int getCod_preco_custo() {
		return cod_preco_custo;
	}
	public void setCod_preco_custo(int cod_preco_custo) {
		this.cod_preco_custo = cod_preco_custo;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public float getPreco_custo() {
		return preco_custo;
	}
	public void setPreco_custo(float preco_custo) {
		this.preco_custo = preco_custo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_preco_custo, cod_produto, preco_custo, produto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Preco_custo other = (Preco_custo) obj;
		return cod_preco_custo == other.cod_preco_custo && cod_produto == other.cod_produto
				&& Float.floatToIntBits(preco_custo) == Float.floatToIntBits(other.preco_custo)
				&& Objects.equals(produto, other.produto);
	}
}

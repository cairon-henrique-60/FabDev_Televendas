package br.com.ibiagas.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Preco_custo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_preco_custo;
	
	@OneToMany
	private Produto produto;
	
	private int cod_produto;
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
	
	
}

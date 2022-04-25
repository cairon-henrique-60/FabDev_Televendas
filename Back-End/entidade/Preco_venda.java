package br.com.ibiagas.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Preco_venda {
	
	@OneToMany
	private Produto produto;
	
	@Id
	private int cod_preco_venda;
	private int cod_produto;
	private float preco_venda;
	private LocalDate val_preco_venda;
	
	//Getters and Setters
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getCod_preco_venda() {
		return cod_preco_venda;
	}
	public void setCod_preco_venda(int cod_preco_venda) {
		this.cod_preco_venda = cod_preco_venda;
	}
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public float getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public LocalDate getVal_preco_venda() {
		return val_preco_venda;
	}
	public void setVal_preco_venda(LocalDate val_preco_venda) {
		this.val_preco_venda = val_preco_venda;
	}	
}

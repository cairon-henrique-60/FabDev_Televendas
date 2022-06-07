package br.com.ibiagas.models;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Preco_venda {
	
	@OneToMany
	private Produto produto;
	
	@Id
	@Column(nullable = false)
	private int cod_preco_venda;
	
	@Column(nullable = false)
	private int cod_produto;
	
	@Column(nullable = false)
	private float preco_venda;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
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
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_preco_venda, cod_produto, preco_venda, produto, val_preco_venda);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Preco_venda other = (Preco_venda) obj;
		return cod_preco_venda == other.cod_preco_venda && cod_produto == other.cod_produto
				&& Float.floatToIntBits(preco_venda) == Float.floatToIntBits(other.preco_venda)
				&& Objects.equals(produto, other.produto) && Objects.equals(val_preco_venda, other.val_preco_venda);
	}	
}

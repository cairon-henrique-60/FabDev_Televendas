package br.com.ibiagas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item_nota_fiscal_entrada implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@OneToOne
	private Produto produto;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_itens_nf_ent;
	
	private float Valor_unitario;
	private int cod_produto;
	private int num_nfentrada;
	
	//Getters and Setters
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getCod_itens_nf_ent() {
		return cod_itens_nf_ent;
	}
	public void setCod_itens_nf_ent(int cod_itens_nf_ent) {
		this.cod_itens_nf_ent = cod_itens_nf_ent;
	}
	public float getValor_unitario() {
		return Valor_unitario;
	}
	public void setValor_unitario(float valor_unitario) {
		Valor_unitario = valor_unitario;
	}
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public int getNum_nfentrada() {
		return num_nfentrada;
	}
	public void setNum_nfentrada(int num_nfentrada) {
		this.num_nfentrada = num_nfentrada;
	} 
}

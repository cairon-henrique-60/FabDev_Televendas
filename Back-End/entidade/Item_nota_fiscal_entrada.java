package br.com.ibiagas.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item_nota_fiscal_entrada implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Produto produto;
	@ManyToOne
	private Nota_fiscal_entrada nota_fiscal_entrada;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_itens_nf_ent;
	
	@Column(nullable = false)
	private float Valor_unitario;
	
	@JoinColumn(nullable = false)
	private int cod_produto;
	
	@JoinColumn(nullable = false)
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
	public Nota_fiscal_entrada getNota_fiscal_entrada() {
		return nota_fiscal_entrada;
	}
	public void setNota_fiscal_entrada(Nota_fiscal_entrada nota_fiscal_entrada) {
		this.nota_fiscal_entrada = nota_fiscal_entrada;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Valor_unitario, cod_itens_nf_ent, cod_produto, nota_fiscal_entrada, num_nfentrada, produto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item_nota_fiscal_entrada other = (Item_nota_fiscal_entrada) obj;
		return Float.floatToIntBits(Valor_unitario) == Float.floatToIntBits(other.Valor_unitario)
				&& cod_itens_nf_ent == other.cod_itens_nf_ent && cod_produto == other.cod_produto
				&& Objects.equals(nota_fiscal_entrada, other.nota_fiscal_entrada)
				&& num_nfentrada == other.num_nfentrada && Objects.equals(produto, other.produto);
	} 
	
}

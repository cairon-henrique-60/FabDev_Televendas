package br.com.ibiagas.entidades;

public class Preco_custo {
	private int cod_preco_custo; //--> Primary Key
	private int cod_produto;
	private float preco_custo;
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

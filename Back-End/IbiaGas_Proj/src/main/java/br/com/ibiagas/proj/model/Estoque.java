package br.com.ibiagas.proj.model;

import java.sql.Date;


public class Estoque {
	protected int cod_estoque;
	protected int cod_produto;
	protected int qtd_produto;
	protected datetime ultima_mov;
	
	public Estoque() {
		this(0, 0, 0, null);
	}
		
	public Estoque(int cod_estoque, int cod_produto, int qtd_produto, datetime ultima_mov) {
		super();
		this.cod_estoque = cod_estoque;
		this.cod_produto = cod_produto;
		this.qtd_produto = qtd_produto;
		this.ultima_mov = ultima_mov;
	}



	public int getCod_estoque() {
		return cod_estoque;
	}
	public void setCod_estoque(int cod_estoque) {
		this.cod_estoque = cod_estoque;
	}
	public int getCod_produto() {
		return cod_produto;
	}
	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}
	public int getQtd_produto() {
		return qtd_produto;
	}
	public void setQtd_produto(int qtd_produto) {
		this.qtd_produto = qtd_produto;
	}
	public datetime getUltima_mov() {
		return ultima_mov;
	}
	public void setUltima_mov(datetime ultima_mov) {
		this.ultima_mov = ultima_mov;
	}
	
	
}

package br.com.ibiagas.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Estoque implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@OneToOne
	private Produto produto;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_estoque;
	
	private int cod_produto;
	private int qtd_produto;
	private LocalDateTime ultima_mov;
	
	//Getters and Setters
	
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
	public LocalDateTime getUltima_mov() {
		return ultima_mov;
	}
	public void setUltima_mov(LocalDateTime ultima_mov) {
		this.ultima_mov = ultima_mov;
	}
}

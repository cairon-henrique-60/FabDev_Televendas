package br.com.ibiagas.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Estoque implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne //Many To Any!!
	private Produto produto;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_estoque;
	
	@JoinColumn(nullable = false)
	private int cod_produto;
	
	@Column(nullable = false)
	private int qtd_produto;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "dd/MM/yyyy hh:mm:ss")
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
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_produto, produto, qtd_produto, ultima_mov);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoque other = (Estoque) obj;
		return cod_produto == other.cod_produto && Objects.equals(produto, other.produto)
				&& qtd_produto == other.qtd_produto && Objects.equals(ultima_mov, other.ultima_mov);
	}
}
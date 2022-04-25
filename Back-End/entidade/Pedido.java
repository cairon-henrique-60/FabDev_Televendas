package br.com.ibiagas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_pedido;
	
	@OneToOne
	private Cliente cliente;
	@OneToMany
	private Item_pedido item_pedido;
	@OneToOne
	private Formas_pagamento formas_pagamento;
	@OneToOne
	private Caixa_urna caixa_urna;
	
	private int num_pedido; 
	private int id_cliente; 
	private int cod_urna; 
	private int cod_pagamento; 
	private int cod_func;
	
	//Getters and Setters
	
	public int getCod_pedido() {
		return cod_pedido;
	}
	public void setCod_pedido(int cod_pedido) {
		this.cod_pedido = cod_pedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getUm_pedido() {
		return num_pedido;
	}
	public void setUm_pedido(int um_pedido) {
		this.num_pedido = um_pedido;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getCod_urna() {
		return cod_urna;
	}
	public void setCod_urna(int cod_urna) {
		this.cod_urna = cod_urna;
	}
	public int getCod_pagamento() {
		return cod_pagamento;
	}
	public void setCod_pagamento(int cod_pagamento) {
		this.cod_pagamento = cod_pagamento;
	}
	public int getCod_func() {
		return cod_func;
	}
	public void setCod_func(int cod_func) {
		this.cod_func = cod_func;
	} 
	public Item_pedido getItem_pedido() {
		return item_pedido;
	}
	public void setItem_pedido(Item_pedido item_pedido) {
		this.item_pedido = item_pedido;
	}
	public Formas_pagamento getFormas_pagamento() {
		return formas_pagamento;
	}
	public void setFormas_pagamento(Formas_pagamento formas_pagamento) {
		this.formas_pagamento = formas_pagamento;
	}
	public Caixa_urna getCaixa_urna() {
		return caixa_urna;
	}
	public void setCaixa_urna(Caixa_urna caixa_urna) {
		this.caixa_urna = caixa_urna;
	}
	public int getNum_pedido() {
		return num_pedido;
	}
	public void setNum_pedido(int num_pedido) {
		this.num_pedido = num_pedido;
	}
}

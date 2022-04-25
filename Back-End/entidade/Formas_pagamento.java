package br.com.ibiagas.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Formas_pagamento {
	
	@OneToMany
	private Pedido pedido;
	
	@Id
	private int cod_pagamento; 
	private String forma_pagamento;
	
	//Getters and Setters
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public int getCod_pagamento() {
		return cod_pagamento;
	}
	public void setCod_pagamento(int cod_pagamento) {
		this.cod_pagamento = cod_pagamento;
	}
	public String getForma_pagamento() {
		return forma_pagamento;
	}
	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
	
	
}

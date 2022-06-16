package br.com.ibiagas.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Formas_pagamento {
	
	@Id
	@Column(nullable = false)
	private int cod_pagamento;
	
	@Column(length = 15, nullable = false)
	private String forma_pagamento;
	
	//Getters and Setters
	
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
	
	@Override
	public int hashCode() {
		return Objects.hash(cod_pagamento, forma_pagamento);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formas_pagamento other = (Formas_pagamento) obj;
		return cod_pagamento == other.cod_pagamento && Objects.equals(forma_pagamento, other.forma_pagamento);
	}
}

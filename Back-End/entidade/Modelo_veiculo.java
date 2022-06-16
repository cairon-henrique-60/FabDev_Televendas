package br.com.ibiagas.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Modelo_veiculo implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int cod_mod_veiculo;
	
	@Column(length = 10)
	private String tipo_veiculo;
	
	@Column(nullable = false)
	private int cap_veiculo;
	
	//Getters and Setters
	
	public int getCod_mod_veiculo() {
		return cod_mod_veiculo;
	}
	public void setCod_mod_veiculo(int cod_mod_veiculo) {
		this.cod_mod_veiculo = cod_mod_veiculo;
	}
	public String getTipo_veiculo() {
		return tipo_veiculo;
	}
	public void setTipo_veiculo(String tipo_veiculo) {
		this.tipo_veiculo = tipo_veiculo;
	}
	public int getCap_veiculo() {
		return cap_veiculo;
	}
	public void setCap_veiculo(int cap_veiculo) {
		this.cap_veiculo = cap_veiculo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cap_veiculo, cod_mod_veiculo, tipo_veiculo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo_veiculo other = (Modelo_veiculo) obj;
		return cap_veiculo == other.cap_veiculo && cod_mod_veiculo == other.cod_mod_veiculo
				&& Objects.equals(tipo_veiculo, other.tipo_veiculo);
	}
}

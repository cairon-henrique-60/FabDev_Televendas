package br.com.ibiagas.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Modelo_veiculo implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@OneToMany
	private Veiculo veiculo;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_mod_veiculo;
	
	private String tipo_veiculo;
	private int cap_veiculo;
	
	//Getters and Setters
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
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
}

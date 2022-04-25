package br.com.ibiagas.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Veiculo implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@OneToMany
	private Veiculo_entregador veiculo_entregador;
	@OneToOne
	private Modelo_veiculo modelo_veiculo; 
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cod_veiculo;
	
	private String nome_veiculo;
	private LocalDate ano_veiculo;
	private int cod_mod_veiculo;
	
	//Getters and Setters
	
	public Veiculo_entregador getVeiculo_entregador() {
		return veiculo_entregador;
	}
	public void setVeiculo_entregador(Veiculo_entregador veiculo_entregador) {
		this.veiculo_entregador = veiculo_entregador;
	}
	public Modelo_veiculo getModelo_veiculo() {
		return modelo_veiculo;
	}
	public void setModelo_veiculo(Modelo_veiculo modelo_veiculo) {
		this.modelo_veiculo = modelo_veiculo;
	}
	public int getCod_veiculo() {
		return cod_veiculo;
	}
	public void setCod_veiculo(int cod_veiculo) {
		this.cod_veiculo = cod_veiculo;
	}
	public String getNome_veiculo() {
		return nome_veiculo;
	}
	public void setNome_veiculo(String nome_veiculo) {
		this.nome_veiculo = nome_veiculo;
	}
	public LocalDate getAno_veiculo() {
		return ano_veiculo;
	}
	public void setAno_veiculo(LocalDate ano_veiculo) {
		this.ano_veiculo = ano_veiculo;
	}
	public int getCod_mod_veiculo() {
		return cod_mod_veiculo;
	}
	public void setCod_mod_veiculo(int cod_mod_veiculo) {
		this.cod_mod_veiculo = cod_mod_veiculo;
	}
}

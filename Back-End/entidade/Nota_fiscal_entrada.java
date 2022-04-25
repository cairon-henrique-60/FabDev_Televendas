package br.com.ibiagas.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Nota_fiscal_entrada implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Fornecedor fornecedor;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int num_nfentrada;
	
	private LocalDate emissao_nfentrada;
	private LocalDate saida_nfentrada;
	private LocalDate recebimento_nfentrada;
	private int qtd_nfentrada;
	private int vol_nfentrada;
	private LocalTime hr_saida_nfentrada;
	private LocalTime hr_recebimento_nfentrada;
	private int cod_fornecedor;
	
	//Getters and Setters
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public int getNum_nfentrada() {
		return num_nfentrada;
	}
	public void setNum_nfentrada(int num_nfentrada) {
		this.num_nfentrada = num_nfentrada;
	}
	public LocalDate getEmissao_nfentrada() {
		return emissao_nfentrada;
	}
	public void setEmissao_nfentrada(LocalDate emissao_nfentrada) {
		this.emissao_nfentrada = emissao_nfentrada;
	}
	public LocalDate getSaida_nfentrada() {
		return saida_nfentrada;
	}
	public void setSaida_nfentrada(LocalDate saida_nfentrada) {
		this.saida_nfentrada = saida_nfentrada;
	}
	public LocalDate getRecebimento_nfentrada() {
		return recebimento_nfentrada;
	}
	public void setRecebimento_nfentrada(LocalDate recebimento_nfentrada) {
		this.recebimento_nfentrada = recebimento_nfentrada;
	}
	public int getQtd_nfentrada() {
		return qtd_nfentrada;
	}
	public void setQtd_nfentrada(int qtd_nfentrada) {
		this.qtd_nfentrada = qtd_nfentrada;
	}
	public int getVol_nfentrada() {
		return vol_nfentrada;
	}
	public void setVol_nfentrada(int vol_nfentrada) {
		this.vol_nfentrada = vol_nfentrada;
	}
	public LocalTime getHr_saida_nfentrada() {
		return hr_saida_nfentrada;
	}
	public void setHr_saida_nfentrada(LocalTime hr_saida_nfentrada) {
		this.hr_saida_nfentrada = hr_saida_nfentrada;
	}
	public LocalTime getHr_recebimento_nfentrada() {
		return hr_recebimento_nfentrada;
	}
	public void setHr_recebimento_nfentrada(LocalTime hr_recebimento_nfentrada) {
		this.hr_recebimento_nfentrada = hr_recebimento_nfentrada;
	}
	public int getCod_fornecedor() {
		return cod_fornecedor;
	}
	public void setCod_fornecedor(int cod_fornecedor) {
		this.cod_fornecedor = cod_fornecedor;
	}
}

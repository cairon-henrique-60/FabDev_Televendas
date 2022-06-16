package br.com.ibiagas.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
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
public class Nota_fiscal_entrada implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Fornecedor fornecedor;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(nullable = false)
	private int num_nfentrada;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "dd/M/yyyy")
	private LocalDate emissao_nfentrada;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "dd/M/yyyy")
	private LocalDate saida_nfentrada;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "dd/M/yyyy")
	private LocalDate recebimento_nfentrada;
	
	@Column(nullable = false)
	private int qtd_nfentrada;
	
	@Column(nullable = false)
	private int vol_nfentrada;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "hh:mm:ss")
	private LocalTime hr_saida_nfentrada;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "hh:mm:ss")
	private LocalTime hr_recebimento_nfentrada;
	
	@JoinColumn(nullable = false)
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
	@Override
	public int hashCode() {
		return Objects.hash(cod_fornecedor, emissao_nfentrada, fornecedor, hr_recebimento_nfentrada, hr_saida_nfentrada,
				num_nfentrada, qtd_nfentrada, recebimento_nfentrada, saida_nfentrada, vol_nfentrada);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota_fiscal_entrada other = (Nota_fiscal_entrada) obj;
		return cod_fornecedor == other.cod_fornecedor && Objects.equals(emissao_nfentrada, other.emissao_nfentrada)
				&& Objects.equals(fornecedor, other.fornecedor)
				&& Objects.equals(hr_recebimento_nfentrada, other.hr_recebimento_nfentrada)
				&& Objects.equals(hr_saida_nfentrada, other.hr_saida_nfentrada) && num_nfentrada == other.num_nfentrada
				&& qtd_nfentrada == other.qtd_nfentrada
				&& Objects.equals(recebimento_nfentrada, other.recebimento_nfentrada)
				&& Objects.equals(saida_nfentrada, other.saida_nfentrada) && vol_nfentrada == other.vol_nfentrada;
	}
}

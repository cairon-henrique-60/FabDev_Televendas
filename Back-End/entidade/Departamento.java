package br.com.ibiagas.entidades;

public class Departamento {

	private int cod_depto; //--> Primary Key
	String nome_depto;
	
	public String getNome_depto() {
		return nome_depto;
	}
	public int getCod_depto() {
		return cod_depto;
	}
	public void setCod_depto(int cod_depto) {
		this.cod_depto = cod_depto;
	}
	public void setNome_depto(String nome_depto) {
		if (nome_depto == null) {
			throw new RuntimeException("Nome do departamento não pode ser nulo*");
		}
		this.nome_depto = nome_depto;
	}
	
}

package br.com.ibiagas.entidades;

public class Cargo {
	
	private int cod_cargo; //--> Primary Key
	private String nome_cargo;
	
	public String getNome_cargo() {
		return nome_cargo;
	}
	public void setNome_cargo(String nome_cargo) {
		if (nome_cargo == null) {
			throw new RuntimeException("Nome do cargo não pode ser nulo*");
		}
		this.nome_cargo = nome_cargo;
	}
}

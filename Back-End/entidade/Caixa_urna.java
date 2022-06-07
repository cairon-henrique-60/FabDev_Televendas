package br.com.ibiagas.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Caixa_urna implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Pedido pedido;
	@ManyToOne
	private Funcionarios funcionarios;
	
	
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cod_urna;
	
	
	@Column(length = 50, nullable = false)
	private String local_urna;
	
	@Column(nullable = false)
	private float saldo_urna;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate data_deposito;
	
	@Column(nullable = false)
	private float valor_deposito;
	
	//Getters and Setters
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Funcionarios getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionarios funcionarios) {
		this.funcionarios = funcionarios;
	}
	public int getCod_urna() {
		return cod_urna;
	}
	public void setCod_urna(int cod_urna) {
		this.cod_urna = cod_urna;
	}
	public String getLocal_urna() {
		return local_urna;
	}
	public void setLocal_urna(String local_urna) {
		this.local_urna = local_urna;
	}
	public float getSaldo_urna() {
		return saldo_urna;
	}
	public void setSaldo_urna(float saldo_urna) {
		this.saldo_urna = saldo_urna;
	}
	public LocalDate getData_deposito() {
		return data_deposito;
	}
	public void setData_deposito(LocalDate data_deposito) {
		this.data_deposito = data_deposito;
	}
	public float getValor_deposito() {
		return valor_deposito;
	}
	public void setValor_deposito(float valor_deposito) {
		this.valor_deposito = valor_deposito;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data_deposito, funcionarios, local_urna, pedido, saldo_urna, valor_deposito);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caixa_urna other = (Caixa_urna) obj;
		return Objects.equals(data_deposito, other.data_deposito) && Objects.equals(funcionarios, other.funcionarios)
				&& Objects.equals(local_urna, other.local_urna) && Objects.equals(pedido, other.pedido)
				&& Float.floatToIntBits(saldo_urna) == Float.floatToIntBits(other.saldo_urna)
				&& Float.floatToIntBits(valor_deposito) == Float.floatToIntBits(other.valor_deposito);
	}
}

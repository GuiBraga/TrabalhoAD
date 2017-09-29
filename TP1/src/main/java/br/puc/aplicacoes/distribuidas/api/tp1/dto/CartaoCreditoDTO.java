package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CARTAO_CREDITO")
public class CartaoCreditoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name = "COD_CARTAO_CREDITO")
	private Long codCartaoCredito;

	@NotNull
	@Column(name = "LIMITE")
	private double limite;

	@NotNull
	@Column(name = "OPERADORA")
	private String operadora;

	@ManyToOne
	@NotNull
	@JoinColumn(name = "COD_CONTA")
	private ContaDTO conta;

	public Long getCodCartaoCredito() {
		return codCartaoCredito;
	}

	public void setCodCartaoCredito(Long codCartaoCredito) {
		this.codCartaoCredito = codCartaoCredito;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public ContaDTO getConta() {
		return conta;
	}

	public void setConta(ContaDTO conta) {
		this.conta = conta;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(getCodCartaoCredito());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		CartaoCreditoDTO cartao = (CartaoCreditoDTO) o;
		if (cartao.codCartaoCredito == null || codCartaoCredito == null) {
			return false;
		}
		return Objects.equals(codCartaoCredito, cartao.codCartaoCredito);
	}

}

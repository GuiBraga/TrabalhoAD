package br.puc.aplicacoes.distribuidas.api.tp1.domain;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "FATURA")
public class Fatura{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "COD_FATURA")
	private Long codFatura;
	
	@Column(name = "DATA_FECHAMENTO")
	private LocalDate dataFechamentoFatura;
	
	@Column(name = "DATA_PAGAMENTO")
	private LocalDate dataPagamentoFatura;
	
	@Column(name = "VALOR_TOTAL")
	private double valorTotal;
	
	@Column(name = "MES_REFERENCIA")
	private int mesReferencia;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "COD_CARTAO_CREDITO")
	private CartaoCredito cartaoCredito;

	public Long getCodFatura() {
		return codFatura;
	}

	public void setCodFatura(Long codFatura) {
		this.codFatura = codFatura;
	}

	public LocalDate getDataFechamentoFatura() {
		return dataFechamentoFatura;
	}

	public void setDataFechamentoFatura(LocalDate dataFechamentoFatura) {
		this.dataFechamentoFatura = dataFechamentoFatura;
	}

	public LocalDate getDataPagamentoFatura() {
		return dataPagamentoFatura;
	}

	public void setDataPagamentoFatura(LocalDate dataPagamentoFatura) {
		this.dataPagamentoFatura = dataPagamentoFatura;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(int mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(getCodFatura());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Fatura fatura = (Fatura) o;
		if (fatura.codFatura == null || codFatura == null) {
			return false;
		}
		return Objects.equals(codFatura, fatura.codFatura);
	}
	
}

package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class FaturaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long codFatura;
	
	private LocalDate dataFechamentoFatura;
	
	private LocalDate dataPagamentoFatura;
	
	private double valorTotal;
	
	private int mesReferencia;
	
	private CartaoCreditoDTO cartaoCredito;

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

	public CartaoCreditoDTO getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(CartaoCreditoDTO cartaoCredito) {
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

		FaturaDTO fatura = (FaturaDTO) o;
		if (fatura.codFatura == null || codFatura == null) {
			return false;
		}
		return Objects.equals(codFatura, fatura.codFatura);
	}
	
}

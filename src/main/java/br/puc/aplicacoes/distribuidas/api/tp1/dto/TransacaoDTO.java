package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TransacaoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long codTransacao;
	
	private double valor;
	
	private LocalDate dataTransacao;
	
	private String descricao;
	
	private String tipoTransacao;
		
	private FaturaDTO fatura;
	
	private CategoriaDTO categoria;

	public Long getCodTransacao() {
		return codTransacao;
	}

	public void setCodTransacao(Long codTransacao) {
		this.codTransacao = codTransacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(LocalDate dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

	public FaturaDTO getFatura() {
		return fatura;
	}

	public void setFatura(FaturaDTO fatura) {
		this.fatura = fatura;
	}

	public CategoriaDTO getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(getCodTransacao());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		TransacaoDTO transacao = (TransacaoDTO) o;
		if (transacao.codTransacao == null || codTransacao == null) {
			return false;
		}
		return Objects.equals(codTransacao, transacao.codTransacao);
	}
}

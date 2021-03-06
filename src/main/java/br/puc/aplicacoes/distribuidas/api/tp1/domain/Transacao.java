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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TRANSACAO")
public class Transacao{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "COD_TRANSACAO")
	private Long codTransacao;
	
	@Column(name = "VALOR")
	private double valor;
	
	@Column(name = "DATA_TRANSACAO")
	private LocalDate dataTransacao;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "TIPO_TRANSACAO")
	private String tipoTransacao;
		
	@ManyToOne
	@JoinColumn(name = "COD_FATURA")
	private Fatura fatura;
	
	@OneToOne
	@NotNull
	@JoinColumn(name = "COD_CATEGORIA")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "COD_CONTA")
	private Conta conta;

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

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
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

		Transacao transacao = (Transacao) o;
		if (transacao.codTransacao == null || codTransacao == null) {
			return false;
		}
		return Objects.equals(codTransacao, transacao.codTransacao);
	}
}

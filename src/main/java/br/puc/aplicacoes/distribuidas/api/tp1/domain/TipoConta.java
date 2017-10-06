package br.puc.aplicacoes.distribuidas.api.tp1.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TIPO_CONTA")
public class TipoConta{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	@Column(name = "COD_TIPO_CONTA")
	private Long codTipoConta;
	
	@NotNull
	@Column(name = "DESCRICAO")
	private String descricao;

	public Long getCodTipoConta() {
		return codTipoConta;
	}

	public void setCodTipoConta(Long codTipoConta) {
		this.codTipoConta = codTipoConta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(getCodTipoConta());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		TipoConta tipoConta = (TipoConta) o;
		if (tipoConta.codTipoConta == null || codTipoConta == null) {
			return false;
		}
		return Objects.equals(codTipoConta, tipoConta.codTipoConta);
	}

}

package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TIPO_CONTA")
public class TipoContaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
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

		TipoContaDTO tipoConta = (TipoContaDTO) o;
		if (tipoConta.codTipoConta == null || codTipoConta == null) {
			return false;
		}
		return Objects.equals(codTipoConta, tipoConta.codTipoConta);
	}

}

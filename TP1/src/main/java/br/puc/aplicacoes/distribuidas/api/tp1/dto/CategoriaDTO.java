package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CATEGORIA")
public class CategoriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name = "COD_CATEGORIA")
	private Long codCategoria;
	
	@NotNull
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@NotNull
	@Column(name = "TIPO_TRANSACAO")
	private String tipoTransacao;

	public Long getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(Long codCategoria) {
		this.codCategoria = codCategoria;
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
	@Override
	public int hashCode() {
		return Objects.hashCode(getCodCategoria());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		CategoriaDTO categoria = (CategoriaDTO) o;
		if (categoria.codCategoria == null || codCategoria == null) {
			return false;
		}
		return Objects.equals(codCategoria, categoria.codCategoria);
	}
}

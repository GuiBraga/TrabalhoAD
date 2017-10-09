package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.util.Objects;

public class CategoriaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long codCategoria;
	
	private String descricao;
	
	private String tipoTransacao;
	
	private UsuarioDTO usuario;

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
	
	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
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

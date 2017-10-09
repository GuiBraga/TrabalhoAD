package br.puc.aplicacoes.distribuidas.api.tp1.domain;

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
@Table(name = "CATEGORIA")
public class Categoria{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "COD_CATEGORIA")
	private Long codCategoria;
	
	@NotNull
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@NotNull
	@Column(name = "TIPO_TRANSACAO")
	private String tipoTransacao;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name = "COD_USUARIO")
	private Usuario usuario;
	
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
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
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

		Categoria categoria = (Categoria) o;
		if (categoria.codCategoria == null || codCategoria == null) {
			return false;
		}
		return Objects.equals(codCategoria, categoria.codCategoria);
	}
}

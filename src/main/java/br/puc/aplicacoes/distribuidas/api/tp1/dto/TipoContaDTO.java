package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.util.Objects;

public class TipoContaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long codTipoConta;
	
	private String descricao;
	
	private UsuarioDTO usuario;

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

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
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

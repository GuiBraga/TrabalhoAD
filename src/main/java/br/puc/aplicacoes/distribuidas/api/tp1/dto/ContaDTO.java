package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.util.Objects;

public class ContaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long codConta;
	
	private String tituloConta;
	
	private double saldoAtual;
	
	private Boolean incluirTela;
	
	private UsuarioDTO usuario;
	
	private TipoContaDTO tipoConta;

	public Long getCodConta() {
		return codConta;
	}

	public void setCodConta(Long codConta) {
		this.codConta = codConta;
	}

	public String getTituloConta() {
		return tituloConta;
	}

	public void setTituloConta(String tituloConta) {
		this.tituloConta = tituloConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public Boolean getIncluirTela() {
		return incluirTela;
	}

	public void setIncluirTela(Boolean incluirTela) {
		this.incluirTela = incluirTela;
	}

	public UsuarioDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}

	public TipoContaDTO getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoContaDTO tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(getCodConta());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		ContaDTO conta = (ContaDTO) o;
		if (conta.codConta == null || codConta == null) {
			return false;
		}
		return Objects.equals(codConta, conta.codConta);
	}

}

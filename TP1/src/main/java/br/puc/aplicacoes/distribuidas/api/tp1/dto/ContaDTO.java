package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CONTA")
public class ContaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name = "COD_CONTA")
	private Long codConta;
	
	@Column(name = "TITULO_CONTA")
	private String tituloConta;
	
	@Column(name = "SALDO_INICIAL")
	private double saldoInicial;
	
	@Column(name = "INCLUIR_TELA_PRINCIPAL")
	private Boolean incluirTelaPrincipal;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name = "COD_USUARIO")
	private UsuarioDTO usuario;
	
	@ManyToOne
	@NotNull
	@JoinColumn(name = "TIPO_CONTA")
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

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public Boolean getIncluirTelaPrincipal() {
		return incluirTelaPrincipal;
	}

	public void setIncluirTelaPrincipal(Boolean incluirTelaPrincipal) {
		this.incluirTelaPrincipal = incluirTelaPrincipal;
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

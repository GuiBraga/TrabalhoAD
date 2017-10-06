package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.util.Objects;

public class UsuarioDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long codUsuario;
	
	private String nomeUsuario;
	
	private String senhaUsuario;
	
	private String emailUsuario;

	public Long getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Long codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	
	@Override
    public int hashCode() {
        return Objects.hashCode(getCodUsuario());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UsuarioDTO usuario = (UsuarioDTO) o;
        if (usuario.codUsuario == null || codUsuario == null) {
            return false;
        }
        return Objects.equals(codUsuario, usuario.codUsuario);
    }
}

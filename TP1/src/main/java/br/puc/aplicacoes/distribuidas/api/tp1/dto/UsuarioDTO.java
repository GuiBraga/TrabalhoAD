package br.puc.aplicacoes.distribuidas.api.tp1.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USUARIO")
public class UsuarioDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name = "COD_USUARIO")
	private Long codUsuario;
	
	@NotNull
	@Column(name = "NOME_USUARIO")
	private String nomeUsuario;
	
	@NotNull
	@Column(name="SENHA_USUARIO")
	private String senhaUsuario;
	
	@NotNull
	@Column(name="EMAIL_USUARIO")
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

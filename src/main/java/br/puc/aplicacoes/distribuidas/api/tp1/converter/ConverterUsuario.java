package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Usuario;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;

@Component
public class ConverterUsuario {

	public Usuario usuarioDTOTOUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();

		usuario.setCodUsuario(usuarioDTO.getCodUsuario());
		usuario.setEmailUsuario(usuarioDTO.getEmailUsuario());
		usuario.setNomeUsuario(usuarioDTO.getNomeUsuario());

		return usuario;
	}

	public List<Usuario> usuarioDTOListTOUsuarioList(List<UsuarioDTO> usuarioDTOList){
		List<Usuario> usuarioList = new ArrayList<Usuario>();
		
		usuarioDTOList.forEach(usuarioDTO ->{
			Usuario usuario = new Usuario();
			
			usuario.setCodUsuario(usuarioDTO.getCodUsuario());
			usuario.setEmailUsuario(usuarioDTO.getEmailUsuario());
			usuario.setNomeUsuario(usuarioDTO.getNomeUsuario());
			
			usuarioList.add(usuario);
		});
		
		return usuarioList;
	}

	public UsuarioDTO usuarioTOUsuarioDTO(Usuario usuario) {

		UsuarioDTO usuarioDTO = new UsuarioDTO();

		usuarioDTO.setCodUsuario(usuario.getCodUsuario());
		usuarioDTO.setEmailUsuario(usuario.getEmailUsuario());
		usuarioDTO.setNomeUsuario(usuario.getNomeUsuario());

		return usuarioDTO;
	}

	public List<UsuarioDTO> usuarioListTOUsuarioDTOList(List<Usuario> usuarioList) {
		List<UsuarioDTO> usuarioDTOList = new ArrayList<UsuarioDTO>();

		usuarioList.forEach(usuario -> {
			UsuarioDTO usuarioDTO = new UsuarioDTO();

			usuarioDTO.setCodUsuario(usuario.getCodUsuario());
			usuarioDTO.setEmailUsuario(usuario.getEmailUsuario());
			usuarioDTO.setNomeUsuario(usuario.getNomeUsuario());

			usuarioDTOList.add(usuarioDTO);
		});

		return usuarioDTOList;
	}
}

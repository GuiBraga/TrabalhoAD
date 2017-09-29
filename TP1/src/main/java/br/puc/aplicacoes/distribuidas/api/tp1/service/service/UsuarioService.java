package br.puc.aplicacoes.distribuidas.api.tp1.service.service;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;

public interface UsuarioService {

	UsuarioDTO salvar(UsuarioDTO usuarioDTO);
	
	UsuarioDTO getUsuario(Long id);
}

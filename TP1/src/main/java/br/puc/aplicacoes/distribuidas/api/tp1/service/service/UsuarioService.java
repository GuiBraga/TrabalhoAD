package br.puc.aplicacoes.distribuidas.api.tp1.service.service;

import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;

public interface UsuarioService {

	UsuarioDTO salvar(UsuarioDTO usuarioDTO);
	
	UsuarioDTO getUsuario(Long id);
	
	UsuarioDTO alterar(UsuarioDTO UsuarioDTO);
	
	List<UsuarioDTO> getAllUsuarios();
}

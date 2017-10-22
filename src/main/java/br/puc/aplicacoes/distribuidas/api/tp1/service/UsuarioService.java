package br.puc.aplicacoes.distribuidas.api.tp1.service;

import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;

@Component
public interface UsuarioService {

	UsuarioDTO salvar(UsuarioDTO usuarioDTO);

	UsuarioDTO getUsuario(Long id);

	UsuarioDTO alterar(UsuarioDTO UsuarioDTO);

	List<UsuarioDTO> getAllUsuarios();

	UsuarioDTO verificaDadosLogin(String email, String senha) throws Exception;
}

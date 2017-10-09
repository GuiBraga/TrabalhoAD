package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.Usuario;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.repository.UsuarioRepository;
import br.puc.aplicacoes.distribuidas.api.tp1.service.UsuarioService;

@Service
@EnableScheduling
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {
		return null;
	}

	@Override
	public UsuarioDTO getUsuario(Long id) {
		return null;
	}

	@Override
	public UsuarioDTO alterar(UsuarioDTO UsuarioDTO) {
		return null;
	}

	@Override
	public List<UsuarioDTO> getAllUsuarios() {
		return null;
	}

	@Override
	public Boolean verificaDadosLogin(String email, String senha) {
//		Usuario user = usuarioRepository.verificaLogin(email, senha);
//		return user != null;
		return false;
	}

}

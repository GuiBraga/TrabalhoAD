package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.converter.ConverterUsuario;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Usuario;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.repository.UsuarioRepository;
import br.puc.aplicacoes.distribuidas.api.tp1.service.UsuarioService;

@Service
@EnableScheduling
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	ConverterUsuario converterUsuario;

	@Override
	public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {
		Usuario usuario = converterUsuario.usuarioDTOTOUsuario(usuarioDTO);
		return converterUsuario.usuarioTOUsuarioDTO(usuarioRepository.saveAndFlush(usuario));
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
	public UsuarioDTO verificaDadosLogin(String email, String senha) throws Exception {
		Usuario usuario = usuarioRepository.verificaLogin(email, senha);
		if (usuario != null)
			return converterUsuario.usuarioTOUsuarioDTO(usuario);
		return null;
	}

}

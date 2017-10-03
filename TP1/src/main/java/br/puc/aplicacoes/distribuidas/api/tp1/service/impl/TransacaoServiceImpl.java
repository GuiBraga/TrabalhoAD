package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.UsuarioDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.UsuarioService;

@Service
@EnableScheduling
public class TransacaoServiceImpl implements UsuarioService {

	@Override
	public UsuarioDTO salvar(UsuarioDTO usuarioDTO) {
		System.out.println("ENTROU");
		return null;
	}

	@Override
	public UsuarioDTO getUsuario(Long id) {
		System.out.println("ENTROU");
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

}

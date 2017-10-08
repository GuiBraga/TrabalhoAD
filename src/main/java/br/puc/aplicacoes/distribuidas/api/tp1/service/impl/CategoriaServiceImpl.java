package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.CategoriaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.CategoriaService;

@Service
@EnableScheduling
public class CategoriaServiceImpl implements CategoriaService {

	@Override
	public CategoriaDTO salvar(CategoriaDTO usuarioDTO) {
		return null;
	}

	@Override
	public CategoriaDTO getCategoria(Long id) {
		return null;
	}

	@Override
	public CategoriaDTO alterar(CategoriaDTO categoriaDTO) {
		return null;
	}

	@Override
	public List<CategoriaDTO> getAllCategorias(Long id) {
		return null;
	}

}

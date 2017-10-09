package br.puc.aplicacoes.distribuidas.api.tp1.service;

import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.CategoriaDTO;

public interface CategoriaService {

	CategoriaDTO salvar(CategoriaDTO categoriaDTO);
	
	CategoriaDTO getCategoria(Long id);
	
	List<CategoriaDTO> getAllCategorias(Long codUsuario);
	
	Boolean deletarCategoria(Long id);
}

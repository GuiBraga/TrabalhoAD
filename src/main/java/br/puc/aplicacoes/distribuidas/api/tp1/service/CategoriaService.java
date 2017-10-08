package br.puc.aplicacoes.distribuidas.api.tp1.service;

import java.util.List;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.CategoriaDTO;

public interface CategoriaService {

	CategoriaDTO salvar(CategoriaDTO categoriaDTO);
	
	CategoriaDTO getCategoria(Long id);
	
	CategoriaDTO alterar(CategoriaDTO categoriaDTO);
	
	List<CategoriaDTO> getAllCategorias();
}

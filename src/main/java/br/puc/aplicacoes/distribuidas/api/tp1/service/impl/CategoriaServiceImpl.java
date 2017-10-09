package br.puc.aplicacoes.distribuidas.api.tp1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import br.puc.aplicacoes.distribuidas.api.tp1.converter.ConverterCategoria;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Categoria;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CategoriaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.repository.CategoriaRepository;
import br.puc.aplicacoes.distribuidas.api.tp1.service.CategoriaService;

@Service
@EnableScheduling
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	ConverterCategoria converterCategoria;
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override
	public CategoriaDTO salvar(CategoriaDTO categoriaDTO) {
		Categoria categoria = converterCategoria.categoriaDTOTOCategoria(categoriaDTO);
		return converterCategoria.categoriaTOCategoriaDTO(categoriaRepository.save(categoria));
	}

	@Override
	public CategoriaDTO getCategoria(Long codigo) {
		return converterCategoria.categoriaTOCategoriaDTO(categoriaRepository.findOne(codigo));
	}

	@Override
	public List<CategoriaDTO> getAllCategorias(Long codigo) {
		return null;
	}

	@Override
	public Boolean deletarCategoria(Long codigo) {
		try {
			categoriaRepository.delete(codigo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}

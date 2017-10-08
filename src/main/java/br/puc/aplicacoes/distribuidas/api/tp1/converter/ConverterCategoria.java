package br.puc.aplicacoes.distribuidas.api.tp1.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.puc.aplicacoes.distribuidas.api.tp1.domain.CartaoCredito;
import br.puc.aplicacoes.distribuidas.api.tp1.domain.Categoria;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CartaoCreditoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.dto.CategoriaDTO;

@Component
public class ConverterCategoria {
	
	public Categoria categoriaDTOTOCategoria(CategoriaDTO categoriaDTO){
		Categoria categoria = new Categoria();
		categoria.setDescricao(categoriaDTO.getDescricao());
		categoria.setTipoTransacao(categoriaDTO.getTipoTransacao());
		categoria.setCodCategoria(categoriaDTO.getCodCategoria());
		return categoria;
	}
	
	public List<Categoria> categoriaDTOListTOCategoriaList(List<CategoriaDTO> categoriaDTOList){
		List<Categoria> categoriaList = new ArrayList<Categoria>();
		categoriaDTOList.forEach(categoriaDTO -> {
			Categoria categoria = new Categoria();
			categoria.setDescricao(categoriaDTO.getDescricao());
			categoria.setTipoTransacao(categoriaDTO.getTipoTransacao());
			categoria.setCodCategoria(categoriaDTO.getCodCategoria());
			categoriaList.add(categoria);
			
		});
		
		return categoriaList;
	}
	
	public CategoriaDTO categoriaTOCategoriaDTO(Categoria categoria){
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setDescricao(categoria.getDescricao());
		categoriaDTO.setTipoTransacao(categoria.getTipoTransacao());
		categoriaDTO.setCodCategoria(categoria.getCodCategoria());
		return categoriaDTO;
	}
	
	public List<CategoriaDTO> categoriaListTOCategoriaDTOList(List<Categoria> categoriaList){
		List<CategoriaDTO> categoriaDTOList = new ArrayList<CategoriaDTO>();
		categoriaList.forEach(categoria -> {
			CategoriaDTO categoriaDTO = new CategoriaDTO();
			categoriaDTO.setDescricao(categoria.getDescricao());
			categoriaDTO.setTipoTransacao(categoria.getTipoTransacao());
			categoriaDTO.setCodCategoria(categoria.getCodCategoria());
			categoriaDTOList.add(categoriaDTO);
			
		});
		
		return categoriaDTOList;
	}
}

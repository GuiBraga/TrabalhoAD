package br.puc.aplicacoes.distribuidas.api.tp1.web.res;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.CategoriaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.CategoriaService;

@RestController
@RequestMapping("/api")
public class CategoriaResource {
	
	private final CategoriaService categoriaService;
	
	public CategoriaResource(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	@PostMapping("/categorias")
	public CategoriaDTO createCategoria(@RequestBody CategoriaDTO categoriaDTO){
		CategoriaDTO result = categoriaService.salvar(categoriaDTO);
		return result;
	}
	
	
}

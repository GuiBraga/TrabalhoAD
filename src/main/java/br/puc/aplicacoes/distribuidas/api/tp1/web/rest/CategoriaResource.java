package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.CategoriaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaResource {

	private final CategoriaService categoriaService;

	public CategoriaResource(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}
	
	@DeleteMapping("/{codigo}")
	public Boolean deletarCategoria(@PathVariable Long codigo) {
		return Boolean.FALSE;
	}

	@PostMapping
	public CategoriaDTO criarCategoria(@RequestBody CategoriaDTO categoriaDTO) {
		return categoriaService.salvar(categoriaDTO);
	}

	@PutMapping
	public CategoriaDTO alterarCategoria(@RequestBody CategoriaDTO categoriaDTO) {
		return categoriaService.salvar(categoriaDTO);
	}

	@GetMapping("/{id}")
	public CategoriaDTO buscarCategoria(@PathVariable Long id) {
		return categoriaService.getCategoria(id);
	}

	@GetMapping("/{id}/todas")
	public List<CategoriaDTO> buscarTodasCategoria(@PathVariable Long idUsuario) {
		return categoriaService.getAllCategorias(idUsuario);
	}
}

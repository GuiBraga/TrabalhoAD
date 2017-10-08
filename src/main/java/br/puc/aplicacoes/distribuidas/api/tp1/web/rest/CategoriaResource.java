package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

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

	/**
	 * POST /categoria : Create a new categoria.
	 *
	 * @param categoriaDTO
	 *            the categoriaDTO to create
	 * @return with body the new categoriaDTO
	 */
	@PostMapping
	public CategoriaDTO createCategoria(@RequestBody CategoriaDTO categoriaDTO) {
		return categoriaService.salvar(categoriaDTO);
	}

	/**
	 * GET /categoria/ : update the categoria.
	 *
	 * @param id
	 *            the id of the categoriaDTO to retrieve
	 * @return with body the categoriaDTO
	 */
	@PutMapping
	public CategoriaDTO updateCategoria(@RequestBody CategoriaDTO categoriaDTO) {
		return categoriaService.salvar(categoriaDTO);
	}

	/**
	 * GET /categoria/:id : get the "id" categoria.
	 *
	 * @param id
	 *            the id of the categoriaDTO to retrieve
	 * @return with body the categoriaDTO
	 */
	@GetMapping("/{id}")
	public CategoriaDTO getCategoria(@PathVariable Long id) {
		System.out.println("hello");
		return categoriaService.getCategoria(id);
	}

	/**
	 * GET /todos/
	 *
	 * @return all categoriaDTO
	 */
	@GetMapping("/{id}/todos")
	public List<CategoriaDTO> getAllCategoria(@PathVariable Long idUsuario) {
		return categoriaService.getAllCategorias(idUsuario);
	}
}

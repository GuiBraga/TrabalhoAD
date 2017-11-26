package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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

@CrossOrigin
@RestController
@RequestMapping("/categoria")
public class CategoriaResource {

	private final CategoriaService categoriaService;

	public CategoriaResource(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	@DeleteMapping("/{codigo}")
	public ResponseEntity<Boolean> deletarCategoria(@PathVariable Long codigo) {
		try {
			categoriaService.deletarCategoria(codigo);
			return ResponseEntity.status(HttpStatus.OK).body(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(false);
	}

	@PostMapping
	public ResponseEntity<CategoriaDTO> criarCategoria(@RequestBody CategoriaDTO categoriaDTO) {
		try {
			CategoriaDTO result = categoriaService.salvar(categoriaDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@PutMapping
	public ResponseEntity<CategoriaDTO> alterarCategoria(@RequestBody CategoriaDTO categoriaDTO) {
		try {
			CategoriaDTO result = categoriaService.salvar(categoriaDTO);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(null);
	}

	@GetMapping("/{codigo}")
	public ResponseEntity<CategoriaDTO> buscarCategoria(@PathVariable Long codigo) {
		try {
			CategoriaDTO result = categoriaService.getCategoria(codigo);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

	@GetMapping("/todas/{codUsuario}")
	public ResponseEntity<List<CategoriaDTO>> buscarTodasCategoria(@PathVariable Long codUsuario) {
		try {
			List<CategoriaDTO> result = categoriaService.getAllCategorias(codUsuario);
			if (result != null)
				return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
}

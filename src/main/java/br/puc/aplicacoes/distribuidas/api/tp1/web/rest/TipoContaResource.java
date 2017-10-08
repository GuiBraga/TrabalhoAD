package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TipoContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.TipoContaService;

@RestController
@RequestMapping("/tipo-conta")
public class TipoContaResource {

	private final TipoContaService tipoContaService;

	public TipoContaResource(TipoContaService tipoContaService) {
		this.tipoContaService = tipoContaService;
	}

	/**
	 * POST /tipo-conta : Create a new TipoConta.
	 *
	 * @param TipoContaDTO
	 *            the TipoContaDTO to create
	 * @return with body the new TipoContaDTO
	 */
	@PostMapping
	public TipoContaDTO createTipoConta(@RequestBody TipoContaDTO tipoContaDTO) {
		return tipoContaService.salvar(tipoContaDTO);
	}

	/**
	 * GET /tipo-conta/ : update the TipoConta.
	 *
	 * @param id
	 *            the id of the TipoContaDTO to retrieve
	 * @return with body the TipoContaDTO
	 */
	@PutMapping
	public TipoContaDTO updateTipoConta(@RequestBody TipoContaDTO tipoContaDTO) {
		return tipoContaService.salvar(tipoContaDTO);
	}

	/**
	 * GET /tipo-conta/:id : get the "id" TipoConta.
	 *
	 * @param id
	 *            the id of the TipoContaDTO to retrieve
	 * @return with body the TipoContaDTO
	 */
	@GetMapping("/{id}")
	public TipoContaDTO getTipoConta(@PathVariable Long id) {
		System.out.println("hello");
		return tipoContaService.getTipoConta(id);
	}

	/**
	 * GET /todos/
	 *
	 * @return all TipoContaDTO
	 */
	@GetMapping("/{id}/todos")
	public List<TipoContaDTO> getAllTipoConta(@PathVariable Long idUsuario) {
		return tipoContaService.getAllTipoConta(idUsuario);
	}

}

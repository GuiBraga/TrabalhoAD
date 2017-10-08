package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.FaturaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.FaturaService;

@RestController
@RequestMapping("/fatura")
public class FaturaResource {

	private final FaturaService faturaService;

	public FaturaResource(FaturaService faturaService) {
		this.faturaService = faturaService;
	}

	/**
	 * POST /fatura : Create a new Fatura.
	 *
	 * @param FaturaDTO
	 *            the FaturaDTO to create
	 * @return with body the new FaturaDTO
	 */
	@PostMapping
	public FaturaDTO createFatura(@RequestBody FaturaDTO faturaDTO) {
		return faturaService.salvar(faturaDTO);
	}

	/**
	 * GET /fatura/ : update the Fatura.
	 *
	 * @param id
	 *            the id of the FaturaDTO to retrieve
	 * @return with body the FaturaDTO
	 */
	@PutMapping
	public FaturaDTO updateFatura(@RequestBody FaturaDTO faturaDTO) {
		return faturaService.salvar(faturaDTO);
	}

	/**
	 * GET /fatura/:id : get the "id" Fatura.
	 *
	 * @param id
	 *            the id of the FaturaDTO to retrieve
	 * @return with body the FaturaDTO
	 */
	@GetMapping("/{id}")
	public FaturaDTO getFatura(@PathVariable Long id) {
		System.out.println("hello");
		return faturaService.getFatura(id);
	}

	/**
	 * GET /todos/
	 *
	 * @return all FaturaDTO
	 */
	@GetMapping("/{id}/todos")
	public List<FaturaDTO> getAllFatura(@PathVariable Long idUsuario) {
		return faturaService.getAllFaturas(idUsuario);
	}

}

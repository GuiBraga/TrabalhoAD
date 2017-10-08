package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TransacaoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.TransacaoService;

@RestController
@RequestMapping("/transacao")
public class TransacaoResource {

	private final TransacaoService transacaoService;

	public TransacaoResource(TransacaoService transacaoService) {
		this.transacaoService = transacaoService;
	}

	/**
	 * POST /transacaos : Create a new Transacao.
	 *
	 * @param TransacaoDTO
	 *            the TransacaoDTO to create
	 * @return with body the new TransacaoDTO
	 */
	@PostMapping
	public TransacaoDTO createTransacao(@RequestBody TransacaoDTO transacaoDTO) {
		return transacaoService.salvar(transacaoDTO);
	}

	/**
	 * GET /transacaos/ : update the Transacao.
	 *
	 * @param id
	 *            the id of the TransacaoDTO to retrieve
	 * @return with body the TransacaoDTO
	 */
	@PutMapping
	public TransacaoDTO updateTransacao(@RequestBody TransacaoDTO transacaoDTO) {
		return transacaoService.salvar(transacaoDTO);
	}

	/**
	 * GET /transacaos/:id : get the "id" Transacao.
	 *
	 * @param id
	 *            the id of the TransacaoDTO to retrieve
	 * @return with body the TransacaoDTO
	 */
	@GetMapping("/{id}")
	public TransacaoDTO getTransacao(@PathVariable Long id) {
		System.out.println("hello");
		return transacaoService.getTransacao(id);
	}

	/**
	 * GET /todos/
	 *
	 * @return all TransacaoDTO
	 */
	@GetMapping("/{id}/todos")
	public List<TransacaoDTO> getAllTransacao(@PathVariable Long idUsuario) {
		return transacaoService.getAllTransacoes(idUsuario);
	}
}

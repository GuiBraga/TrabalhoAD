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

import br.puc.aplicacoes.distribuidas.api.tp1.dto.ContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.ContaService;

@RestController
@RequestMapping("/conta")
public class ContaResource {

	private final ContaService contaService;

	public ContaResource(ContaService contaService) {
		this.contaService = contaService;
	}

	@DeleteMapping("/{codigo}")
	public Boolean deletarConta(@PathVariable Long codigo) {
		return Boolean.FALSE;
	}
	
	@PostMapping
	public ContaDTO createConta(@RequestBody ContaDTO contaDTO) {
		return contaService.salvar(contaDTO);
	}

	/**
	 * GET /conta/ : update the Conta.
	 *
	 * @param id
	 *            the id of the ContaDTO to retrieve
	 * @return with body the ContaDTO
	 */
	@PutMapping
	public ContaDTO updateConta(@RequestBody ContaDTO contaDTO) {
		return contaService.salvar(contaDTO);
	}

	/**
	 * GET /conta/:id : get the "id" Conta.
	 *
	 * @param id
	 *            the id of the ContaDTO to retrieve
	 * @return with body the ContaDTO
	 */
	@GetMapping("/{codigo}")
	public ContaDTO getConta(@PathVariable Long codigo) {
		return contaService.getConta(codigo);
	}

	/**
	 * GET /todos/
	 *
	 * @return all ContaDTO
	 */
	@GetMapping("/{codUsuario}/todas")
	public List<ContaDTO> getAllConta(@PathVariable Long codUsuario) {
		return contaService.getAllContas(codUsuario);
	}
}

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

	@PutMapping
	public ContaDTO updateConta(@RequestBody ContaDTO contaDTO) {
		return contaService.salvar(contaDTO);
	}

	@GetMapping("/{codigo}")
	public ContaDTO getConta(@PathVariable Long codigo) {
		return contaService.getConta(codigo);
	}

	@GetMapping("/{codUsuario}/todas")
	public List<ContaDTO> getAllConta(@PathVariable Long codUsuario) {
		return contaService.getAllContas(codUsuario);
	}
}

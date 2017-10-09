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

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TransacaoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.TransacaoService;

@RestController
@RequestMapping("/transacao")
public class TransacaoResource {

	private final TransacaoService transacaoService;

	public TransacaoResource(TransacaoService transacaoService) {
		this.transacaoService = transacaoService;
	}

	@DeleteMapping("/{codigo}")
	public Boolean deletarTransacao(@PathVariable Long codigo) {
		return Boolean.FALSE;
	}
	
	@PostMapping
	public TransacaoDTO criarTransacao(@RequestBody TransacaoDTO transacaoDTO) {
		return transacaoService.salvar(transacaoDTO);
	}

	@PutMapping
	public TransacaoDTO alterarTransacao(@RequestBody TransacaoDTO transacaoDTO) {
		return transacaoService.salvar(transacaoDTO);
	}

	@GetMapping("/{codigo}")
	public TransacaoDTO buscarTransacao(@PathVariable Long codigo) {
		return transacaoService.getTransacao(codigo);
	}

	@GetMapping("/{codUsuario}/todas")
	public List<TransacaoDTO> buscarTodasTransacao(@PathVariable Long codUsuario) {
		return transacaoService.getAllTransacoes(codUsuario);
	}
}

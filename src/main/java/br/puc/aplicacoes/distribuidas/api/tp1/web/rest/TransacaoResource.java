package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TransacaoDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.service.TransacaoService;

@RestController
@RequestMapping("/transacao")
public class TransacaoResource {
	
//	private final TransacaoService transacaoService;
	
	public TransacaoResource(TransacaoService transacaoService) {
//		this.transacaoService = transacaoService;
	}
	
	@PostMapping
	public TransacaoDTO createTransacao(@RequestBody TransacaoDTO usuario){
//		TransacaoDTO result = transacaoService.salvar(usuario);
//		return result;
		return null;
	}
}

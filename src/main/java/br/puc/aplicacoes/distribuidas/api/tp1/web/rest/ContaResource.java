package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.ContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.ContaService;

@RestController
@RequestMapping("/conta")
public class ContaResource {
	
//	private final ContaService contaService;
	
	public ContaResource(ContaService contaService) {
//		this.contaService = contaService;
	}
	
	@PostMapping
	public ContaDTO createContas(@RequestBody ContaDTO contaDTO){
//		ContaDTO result = contaService.salvar(contaDTO);
//		return result;
		return null;
	}
	
	
}

package br.puc.aplicacoes.distribuidas.api.tp1.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.puc.aplicacoes.distribuidas.api.tp1.dto.TipoContaDTO;
import br.puc.aplicacoes.distribuidas.api.tp1.service.TipoContaService;

@RestController
@RequestMapping("/tipo-conta")
public class TipoContaResource {
	
//	private final TipoContaService tipoContaService;
	
	public TipoContaResource(TipoContaService tipoContaService) {
//		this.tipoContaService = tipoContaService;
	}
	
	@PostMapping
	public TipoContaDTO createTipoConta(@RequestBody TipoContaDTO tipoContaDTO){
//		TipoContaDTO result = tipoContaService.salvar(tipoContaDTO);
//		return result;
		return null;
	}
	
	
}
